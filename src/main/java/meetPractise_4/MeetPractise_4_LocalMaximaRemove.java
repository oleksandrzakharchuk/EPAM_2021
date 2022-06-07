package meetPractise_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Правильная реализация должна получить массив значений типа int и вернуть копию данного массива со всеми удаленными локальными максимумами. Исходный массив изменять нельзя.
//
//Локальный максимум — это элемент, который больше любого из его соседних элементов. Вам необходимо удалить элементы, которые являются локальными максимумами в исходном массиве.
//
//Подробности:
//
//Размер данного массива гарантированно больше 1.
//Данный массив гарантированно не равен null.
//Если у массива нет локальных максимумов, то вы должны вернуть его копию без изменений.
//Вы можете использовать методы java.util.Arrays.*.
//
//Пример
//Ввод:
//
//[18, 1, 3, 6, 7, -5]
//Вывод в консоли:
//
//[1, 3, 6, -5]
public class MeetPractise_4_LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMax(array)));
    }

    public static int[] removeLocalMax(int[] array) {

        /*I create an array of numbers that are not local maxima. */
        List<Integer> locals = new ArrayList<Integer>();
        if (array[0] <= array[1]) {
            locals.add(array[0]);
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1] || array[i] <= array[i - 1]) {
                locals.add(array[i]);
            }
        }
        if (array[array.length - 2] >= array[array.length - 1]) {
            locals.add(array[array.length - 1]);
        }

        int[] arr = new int[locals.size()];
        for (int i = 0; i < locals.size(); i++) {
            arr[i] = locals.get(i);
        }
        return arr;
    }
}
/*[1, 3, 6, -5]*/