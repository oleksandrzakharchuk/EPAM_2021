package Array_4.Array_4_ToothedArrays;

public class ExToothedArray {
    public static void main(String[] args) {


        int[] numbers = {1, 3, 5, 7, 9};//сохдание одномерного массива
        int[][] array = new int[3][];//сщздание ссылок на другие массимы
        array[0] = numbers;//создали массив numbers с первой строкой массива array
        array[2] = new int[]{2, 4, 6, 8};// можно не указывать кол елементов при выделении памяти тогда значения перечисляються
        for (int[] row : array) {
            if (row != null) {//для избежания ошибки вывести содержимое отсутствующего массива -> проверка наличия массива
                for (int element : row) {
                    System.out.print(element + "");
                }
            } else {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
