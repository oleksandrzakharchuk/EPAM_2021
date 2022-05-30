package MeetPractise;
//Задание 5 "Max Value In Sequence"
//Перейдите в класс FindMaxInSeq и напишите программу, которая считывает последовательность целочисленных значений из стандартного вывода и находит максимальное из них. Вы должны поместить свое решение в метод max, чтобы пройти тесты.
//
//Подробности:
//
//Вы должны считывать значения последовательности, пока следующее не станет 0. Нулевое значение означает конец входной последовательности и не является ее элементом.
//Последовательность гарантированно содержит хотя бы одно значение.
//
//Пример
//Ввод:2 4 6 9 2 4 5 0
//Вывод в консоли:9

import java.util.Scanner;

public class PractiseMdul3_5_MaxValueInSequence {
    public static void main(String[] args){
        int min, max;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        int val = s.nextInt();
        min = max = val;

        while (val != 0) {
//            if (val < min) {
//                min = val;
//            }
          if (val > max) {
             max = val;
           }
            System.out.print("Enter a Value: ");
            val = s.nextInt();

        }
       // System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
    }

//Enter a Value: 2
//Enter a Value: 4
//Enter a Value: 6
//Enter a Value: 9
//Enter a Value: 4
//Enter a Value: 5
//Enter a Value: 0
//Max: 9