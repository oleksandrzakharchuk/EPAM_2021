package meetPractise_4;
/*реализуйте метод multiply.

Метод принимает в качестве параметра прямоугольный целочисленный массив (матрицу) и возвращает его транспонированным.

Рассмотрим целочисленную матрицу, представленную в виде прямоугольного массива. Задача состоит в том, чтобы транспонировать ее по главной диагонали.

Результат транспонирования матрицы – это перевернутая по главной дагонали версия исходной матрицы.*
/
для получения транспонированной матрицы из исходной нужно каждую строчку исходной матрицы записать в виде столбца в том же порядке.
Ввод:

{
    {0, 1, 2},
    {3, 4, 5},
    {6, 7, 8}
}
Вывод в консоли:
{

    {0, 3, 6},

    {1, 4, 7},

    {2, 5, 8}

}
 */

public class MeetPractise_4_MatrixTransposition {
    public static void main(String[] args) {

        // part 1 - create a matrix n by n and fill it with values with the help of the cycle.
        int n = 3;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n*i + j;//the expression " a[i][j] = n*i + j " simply fills the array in order with numbers starting with 0.
            }
        }

        // part 2 - displays the initial matrix
        System.out.println("Initial matrix");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);//displays a two-dimensional matrix using two arrays. "%4d" means "4 spaces". So, "%3d" is 3 spaces, "%6d" is 6 spaces, etc..
            }
            System.out.println();
        }

        // Part 3 - Transposing the Matrix This is the "flipping" of the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];//a[i][j] и a[j][i] are swapped using a variable tempo (temp - temporary).
                a[j][i] = temp;

            }
        }

        // part 4 - displays the transposed matrix during transposition, the column number and the row number are "swapped". For example, it was a[1] [9], became a[9][1]. And so with all the elements (a[2] [2], of course, remains a[2][2])..
        System.out.println();
        System.out.println("New matrix");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }

    }
}

/*Initial matrix
------
   0   1   2
   3   4   5
   6   7   8

New matrix
------
  0  3  6
  1  4  7
  2  5  8

*/