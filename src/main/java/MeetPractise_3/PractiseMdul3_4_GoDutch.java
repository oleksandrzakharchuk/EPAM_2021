package MeetPractise_3;

import java.util.Scanner;

//Описание
//Дано следующее условие: компания друзей посещает ресторан. Они решили разделить счет поровну и добавить 10 процентов от общей суммы счета в качестве чаевых. Далее друзья равными частями покрывают общую сумму платежа.
//
//Перейдите в класс GoDutch и напишите программу, которая считывает общую сумму счета и количество друзей, а затем выводит размер части оплаты.
//
//Рассмотрим некоторые детали:
//
//Программа должна читать данные из System.in
//Общая сумма счета не может быть отрицательной. Если введенное значение отрицательное, программа останавливается и печатает: Bill total amount cannot be negative
//Количество друзей не может быть отрицательным или нулевым. Если такое происходит, то программа останавливается и выводит: Number of friends cannot be negative or zero
//Общая сумма счета, количество друзей и часть к оплате являются целыми числами.
//
//Пример
//Ввод:
//
//1000
//5
//Вывод в консоли:
//
//220
public class PractiseMdul3_4_GoDutch {
    public static void main(String[] args) {

        float d;
        float d1;
        Scanner in = new Scanner(System.in);
        System.out.print("Общая сумма счета a=");
        float a = in.nextFloat();
        System.out.print("Kоличество друзей b=");
        float b = in.nextFloat();

        if (a < 0) {
            System.out.println("Bill total amount cannot be negative");

        } else if (b <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            d = (a / b);
            d1 = d+(d * 100 / a);

            System.out.println("Pазмер части оплаты для каждого из " + b + " друзей составляет : " + d1 + "$");
        }
    }
}
