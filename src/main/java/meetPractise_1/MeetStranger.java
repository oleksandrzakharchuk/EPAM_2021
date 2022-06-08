package meetPractise_1;

import java.util.Scanner;

//MeetAStranger и напишите программу, которая прочтет строку из System.in и выведет сообщение: "Hello, прочитанная строка".
//
//Если во входной строке несколько слов, нужно напечатать их все.
//
//
//Пример
//Ввод:
//
//Mrs. Robinson
//Вывод в консоли:
//
//Hello, Mrs. Robinson
public class MeetStranger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string Mrs. Robinson : ");
        if (in.hasNextLine()) {
            String str = in.nextLine();
            System.out.println("Hello, " + str);
        }
    }
}
/*Enter the string Mrs. Robinson : Mrs. Robinson
Hello, Mrs. Robinson*/