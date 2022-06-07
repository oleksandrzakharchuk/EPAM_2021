package MeetPractise_3;
//Задание 3 "Snail"
//Описание
//Дано следующее условие: улитка поднимается по дереву на a футов в день. Затем каждую ночь улитка сползает вниз на b футов. Высота дерева — h футов.
//Перейдите к классу Snail и напишите программу с подсчетом количества дней, которые потребуются улитке, чтобы добраться до вершины дерева.
//Программа читает a, b, h построчно. Входные значения гарантированно являются положительными целыми числами.
//Если улитка не может добраться до вершины дерева, должно выводиться сообщение: Impossible.

//Примеры
//Ввод:4
//2
//14
//Вывод в консоли:6

//Ввод://4
//3
//10
//Вывод в консоли:7

//Ввод:3
//4
//10
//Вывод в консоли:Impossible

//Ввод:
//4
//4
//1
//Вывод в консоли:1

import java.util.Scanner;

public class PractiseMdul3_3_Snail {
    public static void main(String[] args) {
        float d;
        Scanner in = new Scanner(System.in);
        System.out.print("The snail rose in a day by a = ");
        float a = in.nextFloat();
        System.out.print("The snail descended during the night b = ");
        float b = in.nextFloat();
        System.out.print("Enter the length of the pole h = ");
        float h = in.nextFloat();

        if (a < b) {
            System.out.println("Won't crawl - Impossible");
        } else if (a == b) {
            System.out.println("Will crawl back and forth");
        } else {
            d = h / (a - b);
            //d=(h-h%(a-b))/(a-b) + 1;
            System.out.println("Creeps in "  + d + " days");

        }
    }
}

/*The snail rose in a day by a = 4
The snail descended during the night b = 2
Enter the length of the pole h = 14
Creeps in 7.0 days

The snail rose in a day by a = 4
The snail descended during the night b = 3
Enter the length of the pole h = 10
Creeps in 10.0 days

The snail rose in a day by a = 3
The snail descended during the night b = 4
Enter the length of the pole h = 10
Won't crawl - Impossible

The snail rose in a day by a = 4
The snail descended during the night b = 4
Enter the length of the pole h = 1
Will crawl back and forth

*/
