package MeetPractise_3;
//Описание
//Перейдите в класс Average и напишите программу, которая считывает последовательность целочисленных значений из стандартного ввода и находит среднее значение.
//
//Подробности:
//
//Вы должны считывать значения последовательности, пока следующее не станет 0. Нулевое значение означает конец входной последовательности и не является ее частью.
//Последовательность гарантированно содержит хотя бы одно значение.
//Среднее значение также является целым числом. Используйте целочисленные операции.
//
//Примеры
//Ввод:1 2 3 4 5 0
//Вывод в консоли:3

import java.util.Scanner;
//https://stackoverflow.com/questions/28553361/write-a-program-that-reads-an-unspecified-number-of-integers-determines-pos-ne

public class PractiseMdul3_6_Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double positive = 0, negative = 0;
        double total = 0;
        int count = 0;
        int number;
        double average;

        System.out.println("Enter the number: ");
        do {
            number = input.nextInt();
            total += number;
            count++;
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }
        while (number != 0);

        average = total / count;

        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The count is " + count);
        System.out.println("The average is " + average);
        System.out.println("The round average is "+ Math.round(average));

    }
}
/*Enter the number:
1 2 3 4 5 0
The number of positives is 5.0
The number of negatives is 0.0
The total is 15.0
The count is 6
The average is 2.5
The round average is 3
*/