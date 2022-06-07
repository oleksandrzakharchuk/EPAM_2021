package MeetPractise_3;//Задание 1 "Meet an Agent"
//Описание
//Перейдите в класс MeetAnAgent и напишите программу, которая:
//
//запрашивает на вход число-пароль
//если оно равно секретному числу, программа выводит: "Hello, Agent"
//в противном случае печатает: "Access denied".
//Секретный пароль хранится в final static int password.
//Пример
//Ввод:133976
//Вывод в консоли:Hello, Agent
//Ввод:711
//Вывод в консоли:Access denied

import java.util.Scanner;

public class PractiseMdul3_1_MeetAnAgent {

    final static int PASSWORD = 133976;

    public static void main(String[] args) {
        System.out.print("\nEnter Your Password: ");
        Scanner input = new Scanner(System.in);
        int inputPass = input.nextInt();

        if (!(inputPass == PASSWORD)) {
            System.out.println("\nAccess denied");
        } else {
            System.out.println("\nHello, Agent!");
        }
    }
}


/*Enter Your Password: 711  Access denied*/
/*Enter Your Password: 133976 Hello, Agent!*/
