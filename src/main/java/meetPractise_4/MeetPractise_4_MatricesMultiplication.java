package meetPractise_4;
/*реализуйте метод multiply.

Метод берет два прямоугольных целочисленных массива (матрицы) и возвращает результат их умножения.

Рассмотрим две целочисленные матрицы, представленные в виде прямоугольных массивов. Задача – перемножить данные матрицы. При таком умножении элементы в i-й строке матрицы A умножаются на соответствующие элементы в j-м столбце матрицы B, а сумма полученных значений сохраняется в ij-й элемент результирующей матрицы.

Обратите внимание, что количество столбцов в первой матрице равно количеству строк во второй матрице.

Ввод:
{{1, 2, 3},
{4, 5, 6}},

{{7 , 8},
{9 , 10},
{11, 12}}
Вывод в консоли:

{{58 , 64 },

{139, 154}}
*/

import java.util.Scanner;

import java.io.*;

public class MeetPractise_4_MatricesMultiplication {
//Задача – перемножить данные матрицы. При таком умножении элементы в i-й строке матрицы A умножаются на соответствующие элементы в j-м столбце матрицы B, а сумма полученных значений сохраняется в ij-й элемент результирующей матрицы. Количество столбцов в первой матрице равно количеству строк во второй матрице.


    public static void main(String args[]){
//creating two matrices
        /*int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};*/
        double a[][]={{0,12345},{4509,0},{3,567}};
        double b[][]={{653,8,25353},{0,61,6}};
///creating another matrix to store the multiplication of two matrices
        int c[][]=new int[3][3];  //2 rows and 3 columns

//multiplying and printing multiplication of 2 matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<2;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }//end of k loop
                System.out.print(c[i][j]+" ");  //printing matrix element
            }//end of j loop
            System.out.println();//new line
        }
    }
}
/*   0    753045 74070
  2944377 36072  114316677
  1959    34611  79461     */

/*
public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        // Put your code here
         int a[][]={{1,2,3},{4,5,6}};
        int b[][]={{7,8},{9,10},{11,12}};
//creating another matrix to store the multiplication of two matrices
        int c[][]=new int[2][3];  //2 rows and 3 columns

//multiplying and printing multiplication of 2 matrices
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }//end of k loop
                System.out.print(c[i][j]+" ");  //printing matrix element
            }//end of j loop
            System.out.println();//new line
        }
    }
    }*/