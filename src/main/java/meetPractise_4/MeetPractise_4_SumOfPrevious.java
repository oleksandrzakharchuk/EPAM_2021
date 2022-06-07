package meetPractise_4;
//реализуйте метод getSumCheckArray.
//
//Правильная реализация должна получить массив значений int и вернуть массив логических значений, где каждый элемент является результатом проверки: является ли соответствующий исходный элемент суммой двух предыдущих элементов в данном массиве.
//
//Подробности:
//Гарантируется, что длина данного массива составляет 2 или более.
//Данный массив гарантированно не равен null.
//Метод возвращает массив логических значений, где каждый элемент является результатом для соответствующего элемента в данном массиве.
//Первые два элемента логического массива всегда false.
//Ввод:
//
//[1, -1, 0, 4, 6, 10, 15, 25]
//Вывод в консоли:
//
//[false, false, true, false, false, true, false, true]

import java.util.Arrays;

public class MeetPractise_4_SumOfPrevious {
    public static void main (String[]args)
    {
        int[] array = new int[]{ 1, -1, 0, 4, 6, 10, 15, 25 };

        System.out.println (Arrays.toString (getSumCheckArray (array)));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] booleans = new boolean[array.length];
        int sum = 0;

        for (int i = 0; i < array.length - 2; i++) {
            sum = array[i] + array[i + 1];
            if (sum == array[i + 2]) {
                booleans[i + 2] = true;
            }
        }
        return booleans;
    }
}

/*[false, false, true, false, false, true, false, true]*/