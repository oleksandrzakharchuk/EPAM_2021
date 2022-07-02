package all_java.fizzBuzz;

public class FizzBuzz {// В Java все является классом
    public static void main(String[] args) { // Каждая программа содержит main()
        for(int i = 1; i <= 30; i++) { // Считаем от 1 до 100
            if (((i % 5) == 0) && ((i % 7) == 0)) // Делится ли число и на 5, и на 7?
                System.out.print("fizzbuzz");
            else if ((i % 5) == 0) // Делится ли число на 5?
                System.out.print("fizz");
            else if ((i % 7) == 0) // Делится ли число на 7?
                System.out.print("buzz");
            else System.out.print(i); // Число не делится ни на 5, ни на 7
            System.out.print(" ");
        }
        System.out.println();
    }
}

