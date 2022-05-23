package MeetPractise;//Задание 1 "Meet an Agent"
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

public class PractiseMdul3_1 {
    public static void main(String[] args) {
        final int password = 133976;
        Scanner scanner=new Scanner(System.in);
        int pass = Integer.parseInt(scanner.nextLine());
        do {
            if (password == password) {
                break;
            }
            System.out.println("Hello, Agent");
        } while (password != password);
        System.out.println("Access denied");

    }
}
