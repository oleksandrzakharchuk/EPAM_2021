package all_java.api.Array_4.twoDimensionalArrays;

public class Array_sum {
    public static void main(String[] args) {
        //необходимо найти сумму элементов двумерного массива.
        //1. Необходимо описать двумерный массив (используется короткая форма) размерностью 3х5.
        int[][] array2D = {{1, 2, 3, 4, 5},
                           {5, 4, 3, 2, 1},
                           {0, 2, 0, 4, 0}};
        //2.Используются вложенные циклы для нахождения суммы: внешний – для перебора элементов массива ссылок, внутренний — для перебора элементов целочисленных массивов. используем цикл for-each, так как нет необходимости в изменении элементов массива.
        int sum = 0;
        for (int[] row : array2D) {
            for (int element : row) {
                sum = sum + element;

        //3.Необходимо отобразить массив и сумму.

              System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("sum = " + sum);
    }//1 2 3 4 5
     //5 4 3 2 1
    // 0 2 0 4 0
    //sum = 36
}
