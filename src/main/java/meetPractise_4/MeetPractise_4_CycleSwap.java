package meetPractise_4;

import java.util.*;

//Для класса MeetPractise_4_CycleSwap реализуйте статические методы :
//
//void cycleSwap(int[] array)
//Сдвигает все элементы в данном массиве вправо на 1 позицию.
//В этом случае последний элемент массива становится первым.
//Например, 1 3 2 7 4 становится 4 1 3 2 7.
//void cycleSwap(int[] array, int shift)
//Сдвигает все элементы в заданном массиве вправо на shift позиций.
//Гарантируется, что значение сдвига неотрицательное и не больше длины массива.
//Например, 1 3 2 7 4 со сдвигом 3 становится 2 7 4 1 3.
//Для большего интереса при выполнении задания попробуйте не использовать циклы в своем коде (это не обязательно).
//
//Обратите внимание, что входной массив может быть пустым.

public class MeetPractise_4_CycleSwap {


    public static <RotateArrayByN> void main(String[] args) {

        //Initialize array
        int[] arr = new int[]{1, 3, 2, 7, 4};
        //n determine the number of times an array should be rotated.
        int n = 1;
        //int n = 3;
        //int n = 5;//[1, 3, 2, 7, 4]

        //Displays original array
        System.out.println("Original array: ");//Original array:
       // 1 3 2 7 4
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Rotate the given array by n times toward right
        for (int i = 0; i < n; i++) {
            int j, last;
            //Stores the last element of array
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                //Shift element of array by one
                arr[j] = arr[j - 1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }

        System.out.println();

        //Displays resulting array after rotation
        System.out.println("Array after right rotation: ");//Array after right rotation: 4 1 3 2 7
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        List<Integer> list = Arrays.asList(1, 3, 2, 7, 4);
        System.out.println("\n List before swapping: " + list);//List before swapping: [1, 3, 2, 7, 4]
        Collections.swap(list, 0, 4);
        Collections.swap(list, 1, 4);
        Collections.swap(list, 2, 4);
        Collections.swap(list, 3, 4);

        System.out.println(" List after swapping:  " + list);//List after swapping: [4, 1, 3, 2, 7]
    }
}







