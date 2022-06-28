package meetPractise_5_Class;
//Вам необходимо реализовать метод intersection в классе Line. Он должен возвращать точку пересечения двух линий (Point). Если линии совпадают или не пересекаются, метод должен возвращать значение null.
//
//Вас может удивить, что в задании используется int для аргументов и полей координат. Дело в том, что использование int внесет некоторые дополнительные сложности, которых авторы хотели избежать в этом базовом упражнении. Все тесты выбраны так, чтобы производить вычисления без остатков.
//
//Вы можете проверить свой результат в классе Main.

//import class_5.finalUsing.Point;

import org.testng.annotations.Test;

import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

import static org.testng.AssertJUnit.assertEquals;

public class LineIntersection_1 {
    /* public static void main(String[] args) {
         Line line1 = new Line(1, 1);
         Line line2 = new Line(-1, 3);

         System.out.println(line1.intersection(line2));*/

    public static void main(String[] args) {
        System.out.println("Point of intersection of two lines : " + Arrays.toString(calculateIntersection()));
    }

    public static int[] calculateIntersection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The program calculates the point of intersection \nof two lines, given by their equations: ax + b. \nPlease introduce the a and b coefficients of both\nlines:");

        int m1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        if ((m2 - m1) == 0) {
            System.out.println("\nNull. The lines don't have intersection, because they're parallel.\n");
            throw new ArithmeticException();

        }

        // Intersection [x,y] formula
        int crossX = (b1 - b2) / (m2 - m1);
        int crossY = (m1 * crossX + b1);

        int[] array = new int[]{crossX, crossY};
        return array;

    }
}
//The program calculates the point of intersection
//of two lines, given by their equations: ax + b.
//Please introduce the a and b coefficients of both
//lines:
//1
//1
//-1
//3
//Point of intersection of two lines : [1, 2]

//The program calculates the point of intersection
//of two lines, given by their equations: ax + b.
//Please introduce the a and b coefficients of both
//lines:
//1
//1
//1
//3
//
//Null. The lines don't have intersection, because they're parallel.