package Array_4;

import java.util.Arrays;

public class Array_copy1 {
    public static void main(String[] args) {
        int[] array = {21, 22, 23, 24,};
        int[] hold = {49, 48, 47, 46, 45, 44, 43, 42};
        System.arraycopy(array, 0, hold, 0, array.length);// с какого массива - src, с какого елемента-srcPos, в какой массив-dest, с какой позиции-destPos, количество елементов-length)
        //src - исходный массив.
        //srcPos — начальная позиция в исходном массиве.
        //dest - массив назначения.
        //destPos - начальная позиция в данных назначения.
        //length - количество копируемых элементов массива.
        System.out.println(Arrays.toString(hold));// преобразование всего массива в стороку


//[21, 22, 23, 24, 45, 44, 43, 42] вместо первіх 4 елементов массива hold стали 4 елемента масива array

//если необходимо вставить не с первой а с третьей позиции ставим вместо 0-2

        int[] array1 = {21, 22, 23, 24,};
        int[] hold1 = {49, 48, 47, 46, 45, 44, 43, 42};
        System.arraycopy(array1, 0, hold1, 2, array1.length);
        System.out.println(Arrays.toString(hold1));//[49, 48, 21, 22, 23, 24, 43, 42]

        //если собираемся вставлять не все елементі массива а начиная например с первого  то нужно вічесть 1
        int[] array2 = {21, 22, 23, 24,};
        int[] hold2 = {49, 48, 47, 46, 45, 44, 43, 42};
        System.arraycopy(array2, 1, hold2, 2, array2.length-1);
        System.out.println(Arrays.toString(hold2)); //[49, 48, 22, 23, 24, 44, 43, 42]
    }
}