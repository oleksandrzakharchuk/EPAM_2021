package Array_4.twoDimensionalArrays;

public class Array_error {
    public static void main(String[] args) {
        // описание двумерного массива с указанием только первой размерности (то есть, создается массив ссылок). При попытке записать в массив ссылок целочисленное значение – получим ошибку компиляции. Компилятор проверяет тип данных и тип ячейки, в которую данные размещаются:

        int[][] array2D = new int[10][];
       // array2D[0] = 10;// int cannot be converted to int[] В данном случае будет ошибка, поскольку данный элемент массива хранит ссылку на массив типа int, а не само значение типа int. Это разные типы данных.

    }
}