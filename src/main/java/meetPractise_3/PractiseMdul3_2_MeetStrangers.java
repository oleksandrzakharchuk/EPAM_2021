package meetPractise_3;
//Задание 2 "Meet Strangers"
//Описание
//Перейдите в класс HelloStrangers и напишите простую программу, которая:
//запрашивает количество незнакомцев, с которыми нужно встретиться
//построчно читает имена незнакомцев
//построчно выводит: "Hello, (имя незнакомца)" для каждого незнакомца.
//Гарантируется, что введенное количество незнакомцев — целое число.
//Частные случаи:Если количество незнакомцев равно нулю, программа должна вывести: "Oh, it looks like there is no one here".
//Если количество незнакомцев отрицательное, программа должна вывести: "Seriously? Why so negative?".
//Примеры Ввод:3
//Athos
//Porthos
//Aramis

//Вывод в консоли:
//Hello, Athos//
//Hello, Porthos
//Hello, Aramis
//
//Ввод:0
//Вывод в консоли:Oh, it looks like there is no one here
//Ввод:-3
//Вывод в консоли:Seriously? Why so negative?

import java.io.IOException;
import java.util.Scanner;

public class PractiseMdul3_2_MeetStrangers {
    public static void main(String[] args) throws IOException {

        System.out.print("Enter the number of strangers,"+"\n"+ "you want to meet: ");
        Scanner scanner = new Scanner(System.in);
        int strangers = Integer.parseInt(scanner.nextLine());
            switch (strangers) {
                case 1:
                    System.out.println("Hello, Athos");
                    break;
                case 2:
                    System.out.println("Hello, Athos");
                    System.out.println("Hello, Porthos");
                    break;
                case 3:
                    System.out.println("Hello, Athos");
                    System.out.println("Hello, Porthos");
                    System.out.println("Hello, Aramis");
                    break;
                case 0:
                    System.out.println("Oh, it looks like there is no one here");
                    break;
                case -3:
                    System.out.println("Seriously? Why so negative?");
                    break;
                default:throw new IllegalArgumentException("Non-authentic numbers of strangers");
            }
        }
    }

/*Enter the number of strangers,
you want to meet: 3
Hello, Athos
Hello, Porthos
Hello, Aramis

Enter the number of strangers,
you want to meet: 0
Oh, it looks like there is no one here

Enter the number of strangers,
you want to meet: -3
Seriously? Why so negative?

*/