package MeetPractise;
//Перейдите в класс QuadraticEquation и напишите программу для решения квадратных уравнений.
//
//Для заданных коэффициентов квадратного уравнения (ax² + bx + c = 0), верните один или два корня уравнения, если они существуют в области действительных чисел.
//
//Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out.
//
//Формат вывода:
//
//"x₁ x₂" (два корня в любом порядке, разделенные пробелом), если есть два корня
//"x" (просто значение корня), если есть единственный корень
//"no roots" (просто строковое значение "без корней"), если корня нет.
//Параметр a гарантированно не равен нулю.
//
//В помощь: Квадратное уравнение
//Примеры
//Ввод:1 -2 1
//Вывод в консоли:1
//
//Ввод:
//2 5 -3
//Вывод в консоли:-3 0.5
//Ввод:2 2 2
//Вывод в консоли:no roots

import java.util.Scanner;

public class PractiseMdul3_7_QuadraticEquation {
    public static void main(String[] args) {


//Будем решать его через дискриминант. Для получения корней уравнения необходимо выполнить следующий алгоритм:
//
//Вычислим дискриминант по формуле: Формула дискриминанта D= b * b - 4*a*c;

//ЕСЛИ дискриминант больше нуля, то вычислим корни уравнения x1 и x2 по формуле:
        //x1,2 = -b+- sqrt D/2*a;

        // ЕСЛИ дискриминант равен нулю, значит уравнение имеет единственный корень. Вычислим его по формуле: x = -b/2*a;

        //(то есть дискриминант меньше нуля) уравнение не имеет действительных корней.

        double a, b, c;
        double D;


        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");
        //  Создадим новый объект класса Scanner, он необходим для ввода данных в программу. Инициализируем этот объект класса входным потоком:

        Scanner in = new Scanner(System.in);


        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        //Реализуем алгоритм решения квадратного уравнения

        D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}

