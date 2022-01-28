package ArrToInt;

import java.util.Scanner;

public class ArrayElementSum {
    public static void main(String args[]) {
        int count, sum = 0, i;
        int[] inputArray = new int[500];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of elements");
        count = in .nextInt();
        System.out.println("Enter " + count + "elements");
        for (i = 0; i < count; i++) {
            inputArray[i] = in .nextInt();
        }

        for (int num: inputArray) {
            sum = sum + num;
        }

        System.out.println("Sum of all elements = " + sum);
    }
}

