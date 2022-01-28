package ArrToInt;

//You can convert a String to integer using the parseInt()
// method of the Integer class. To convert a string array
// to an integer array, convert each  element of it to integer
// populate the integer array with them.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class StringToIntegerArray {

    private static String sum;

    public static void main(String[] args) {
        String[] str = {"123", "345", "437", "894"};
        int size = str.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(Arrays.toString(arr));

    }

}

//        for (int i=0; i < 10; i++)
//        {
//            // считываем введенный пользователем элемент в массив
//            //
//            Scanner scanner = null;
//            arr[i] = scanner.nextInt();
//        }
//        // проходим по всем элементов массива и суммируем каждое число
//        for( int num : arr) {
//            sum = sum+num;
//        }
//        System.out.println("Сумма элементов массива равна: " + sum);
////        int sum = 0;
////        for (int num : arr) {
////            sum = sum + num;
//        }
//    }
//
//
//
//        //final String[] array = {"123", "345", "437", "894"};
//       // int sum = 0;
//       // for ( final  c : array )
//       // {
//         //   if ( !Character.isDigit (Integer.parseInt(c)) )
//         //   {
//        //        throw new IllegalArgumentException ();
//         //   }
//
//        //    sum = sum + Character.getNumericValue (Integer.parseInt(c));
//      //  }
//
//        //System.out.println ( "sum = " + sum );
//
//       // String[] str = {"123", "345", "437", "894"};
//        // String[] str = {"123"};
//       // int result = 0;
//       // for (int i = 0; i < str.length; i++) {
//        //    result = result + Integer.parseInt(str[i]);
//       // }
     //   System.out.println(result);;



//        int size = str.length;
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = Integer.parseInt(str[i]);
//        }
//        System.out.println(Arrays.toString(arr));
//       int sum = 0;
//        while (arr > 0) {
//            sum += arr[i] % 10;
//            n /= 10;
//        }*//*
//        int sum = 0;
//        while (arr[0] > 0)
//        {
//            sum += arr[0] % 10;
//            //arr[0] /= 10;
//            System.out.println(sum);
//        }
//
//       // for (int i = 0; i <= arr[i]; i ++) {
//          //  sum += arr[0];
//         //   System.out.println("Сумма - " + sum);
//        }
//
//    }
//*/

//[123, 345, 437, 894]
//You can convert a String to integer using the parseInt()
// method of the Integer lass. To convert a string array
// to an integer array,  convert each element of it to integer and
// populate the integer array with them.
//hps://www.nikialeksey.com/2017/12/20/code-wrapping.html