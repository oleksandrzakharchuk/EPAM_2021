package OdNumbers;

import java.util.Arrays;
import java.util.List;

public class odd_list {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,3,5,2,3,4,4,5,5,7,8,9,0,9,8,7,6,3);
        System.out.print("The even numbers in the list: ");
        numbers.stream().filter( i -> i %2 == 0 ).distinct().forEach(i -> System.out.print(" " + i));

        System.out.print("\n The odd numbers in the list: ");
        numbers.stream().filter( i -> i %2 != 0 ).distinct().forEach(i -> System.out.print(" " + i));
        //List<Integer> oddNumbers;

//The even numbers in the list:  2 4 8 0 6
// The odd numbers  in the list:  1 3 5 7 9
        

    }
}
