package ArrToInt;

import java.util.Arrays;
import java.util.Scanner;

public class Sum4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Input positive number:" );


        String number = read.nextLine().trim();

        int sum = 0;
        if (number.matches("\\d+")) {
            for (char symbol : number.toCharArray()) {
                if (Character.isDigit(symbol)) {
                    sum += Character.getNumericValue(symbol);
                }
            }
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("Incorrect number.");
        }
    }
}



