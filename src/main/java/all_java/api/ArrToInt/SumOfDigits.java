package all_java.api.ArrToInt;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String args[]) {
        String[] str = {"123", "345", "437", "894"};
        int size = str.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println("start :" +Arrays.toString(arr));
      //  end = [sum(map(int, list(str(x)))) for x in start]
      //  print(end)
//        int number = 123;
//
//        int sum = 0;
//        int num = number;
//        while (num > 0) {
//            int lastDigit = num % 10;
//            sum += lastDigit;
//            num /= 10;
//        }
//        System.out.println("Sum of digits : "+sum);
    }
}
