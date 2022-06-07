package MeetPractise_3;
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
//We will solve it through a discriminator. To obtain the roots of the equation, the following algorithm must be performed:

//Let's calculate the discriminant by the formula: Discriminant formula D= b * b - 4 * a * c;

//IF the discriminant is greater than zero, then calculate the roots of the equation x1 and x2 by the formula: x1,2 = -b+- sqrt D/2*a;

        // IF the discriminant is zero, then the equation has a single root. Let's calculate it by the formula: x = -b/2*a;

        //(that is, the discriminant is less than zero) the equation has no real roots.

        double a, b, c;
        double D;

        System.out.println("The program solves a quadratic equation of the form:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Enter a, b и c:");

        //  Let's create a new object of the Scanner class, it is necessary for entering data into the program. Initialize this class object with the input stream:

        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        //We implement an algorithm for solving a quadratic equation

        D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Roots of the equation: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("The equation has a single root: x = " + x);
        } else {
            System.out.println("The equation has no real roots!");
        }
    }
}

/*The program solves a quadratic equation of the form:
ax^2 + bx + c = 0
Enter a, b и c: 1 -2  1
The equation has a single root: x = 1.0

The program solves a quadratic equation of the form:
ax^2 + bx + c = 0
Enter a, b и c:
 2 5 -3
Roots of the equation: x1 = -3.0, x2 = 0.5

The program solves a quadratic equation of the form:
ax^2 + bx + c = 0
Enter a, b и c:
2 2 2
The equation has no real roots!
*/