package ArrToInt;

import java.util.Arrays;

//You can convert a String to integer using the parseInt()   method of the Integer class. To convert a string array // to an integer array, convert each // element of it to integer and populate the integer array with them.
class StringToIntegerArray {

    public static void main(String args[]) {
        String[] str = {"123", "345", "437", "894"};
        int size = str.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
//[123, 345, 437, 894]
//You can convert a String to integer using the parseInt()  method of the Integer class. To convert a string array // to an integer array, // convert each element of it to integer and populate the integer array with them.
//hps://www.nikialeksey.com/2017/12/20/code-wrapping.html