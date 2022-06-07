package meetPractise_4;

import java.util.Arrays;

//реализуйте его статический метод:
//
//int[][] spiral(int rows, int columns)
//Возвращает двумерный массив в виде таблицы, содержащий числа от 1 до rows * columns. Размер таблицы будет определяться заданными параметрами.
//Числа заполняют "таблицу" по часовой стрелке от верхнего угла по спирали.
//Например, для значений параметров (3, 4), выходной массив должен быть:
// 1  2  3  4
//10 11 12  5
// 9  8  7  6
//
//Примеры
//Ввод:
//
//...
//int[][] spiral = Spiral.spiral(3, 4);
//
//for (int i = 0; i < spiral.length; i++) {
//    for (int j = 0; j < spiral[i].length; j++) {
//        System.out.print(String.format("%4s", spiral[i][j]));
//    }
//    System.out.println();
//}
//Вывод в консоли:
//
//  1     2    3   4
//
//  10  11    12   5
//
//  9     8    7   6
//
//
//Ввод:
//
//...
//int[][] spiral = Spiral.spiral(4, 3);
//
//for (int i = 0; i < spiral.length; i++) {
//    for (int j = 0; j < spiral[i].length; j++) {
//        System.out.print(String.format("%4s", spiral[i][j]));
//    }
//    System.out.println();
//}
//Вывод в консоли:
//
//  1    2   3
//
// 10   11    4
//
//  9   12   5
//
//  8    7   6
//
//
//Ввод:
//
//...
//int[][] spiral = Spiral.spiral(5, 6);
//
//for (int i = 0; i < spiral.length; i++) {
//    for (int j = 0; j < spiral[i].length; j++) {
//        System.out.print(String.format("%4s", spiral[i][j]));
//    }
//    System.out.println();
//}
//Вывод в консоли:
//
// 1   2  3   4   5    6
//
//18  19  20  21  22    7
//
//17  28  29  30  23    8
//
//16  27  26  25  24    9
//
//15  14  13  12  11  10
//
//
//Ввод:
//
//...
//int[][] spiral = Spiral.spiral(5, 5);
//
//for (int i = 0; i < spiral.length; i++) {
//    for (int j = 0; j < spiral[i].length; j++) {
//        System.out.print(String.format("%4s", spiral[i][j]));
//    }
//    System.out.println();
//}
//Вывод в консоли:
//
//  1   2  3  4   5
//
//16  17  18  19   6
//
//15  24  25  20   7
//
//14  23  22  21   8
//
//13  12  11  10   9
public class MeetPractise_4_Spiral {
    /*заводим переменные для верхней/нижней строки и правого/левого столбца и реализуем четыре цикла для прохождения по спирали вправо/вниз/влево/вверх, пока не будет достигнуто максимальное значение rows * cols:*/
    public static int[][] spiral(int rows, int cols) {
        int[][] arr = new int[rows][cols];

        int num = 1;
        int max = rows * cols;

        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = cols - 1;

        while (num <= max) {
            // проход влево по верхней строке, инкремент столбцов
            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;
            // проход вниз по правому краю, инкремент строк
            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;
            // проход вправо по нижней строке, декремент столбцов
            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;
            // проход вверх по левому краю, декремент строк
            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }

        return arr;


    }

    public static void main(String[] args) {
      /*  System.out.println("-- 5 x 4 --");
        for (int[] row : spiral(5, 4)) {
            System.out.println(Arrays.toString(row));*/

          /*  System.out.println("\n-- 6 x 5 --");
            for (int[] row1 : spiral(6, 5)) {
                System.out.println(Arrays.toString(row1));*/

                System.out.println("\n-- 3 x 4 --");
                for (int[] row2 : spiral(4, 3)) {
                    System.out.println(Arrays.toString(row2));
            }
        }
    }





