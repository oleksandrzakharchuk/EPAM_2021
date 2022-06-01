package Array_4.twoDimensionalArrays;

public class Array_init {
    public static void main(String[] args) {
        //Многомерные массивы можно инициализировать при помощи литералов. Нужно просто вложить описание одних массивов в другие массивы, применяя множество вложенных фигурных скобок.
        int[][] products = { { 0, 0, 0, 0, 0 },
                { 0, 1, 2, 3, 4 },
                { 0, 2, 4, 6, 8 },
                { 0, 3, 6, 9, 12 },
                { 0, 4, 8, 12, 16 } };
        System.out.println(products);
    }
}
