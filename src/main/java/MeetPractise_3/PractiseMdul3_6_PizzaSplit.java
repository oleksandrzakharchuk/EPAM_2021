package MeetPractise_3;
//Перейдите в класс PizzaSplit и напишите программу, которая должна прочитать два значения из System.in:
//
//количество людей
//количество кусочков в одной пицце.
//Гарантируется, что входные параметры — целые положительные числа.
//
//Программа должна напечатать минимальное количество пицц (не ноль), которое надо заказать, чтобы у всех было одинаковое количество ломтиков и не осталось ни одного лишнего.
//
//
//Пример
//Ввод:12 8
//Вывод в консоли:3

import java.util.Scanner;

public class PractiseMdul3_6_PizzaSplit {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
// each pizza has 8 pieces
        int slicesPerPizza = 8;

// Collect the first number from the user.
        System.out.print("Enter the total number of people : ");
        int numberOfPeople = scnr.nextInt();
// Collect the second number from the user.
        System.out.print("Enter the number of pieces each person will receive: ");
        double slicesPerPerson = scnr.nextDouble();

// Below we calculate the number of pizzas for the order and
//save the result in a variable of type int named numberOfPizzas.
        int numberOfPizzas = (int) Math.ceil(((numberOfPeople * slicesPerPerson) / slicesPerPizza));

        System.out.println("Number of pizzas to order : " + numberOfPizzas);
    }

}

/*Enter the total number of people : 12
Enter the number of pieces each person will receive: 2
Number of pizzas to order : 3*/