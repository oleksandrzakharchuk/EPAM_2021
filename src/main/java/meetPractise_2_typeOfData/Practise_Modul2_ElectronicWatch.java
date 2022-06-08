package meetPractise_2_typeOfData;
//Перейдите в класс ElectronicWatch и напишите программу, которая получает на вход целое число. Это число представляет собой текущее суточное время как количество прошедших с полнуочи секунд. Затем программа должна напечатать вывод экрана электронных часов для этого времени.
//
//Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out
//
//Гарантируется, что входное значение — неотрицательное.
//
//Формат вывода: h:mm:ss (возможные значения: [0:00:00; 23:59:59]).
//
//Усложненный вариант: попробуйте решить задачу без использования if и циклов.

import java.util.Scanner;


public class Practise_Modul2_ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int seconds = scanner.nextInt();
        int sec = seconds % 60;
        int min = seconds / 60;
        int hour = seconds / 3600;
        int dif = (seconds - (hour * 3600)) / 60;


        String strSec = ((sec < 10) ? "0" + sec : Integer.toString(sec));
        String strMin = ((min < 10) ? "0" + min : (dif == 0 || dif == 1) ? "0" + Integer.toString(dif) : Integer.toString(dif));

        String strHour = ((hour < 10) ? "" + hour : (hour == 24) ? "0" : Integer.toString(hour));

        System.out.println(strHour + ":" + strMin + ":" + strSec);
    }
}

/*Input seconds: 60
0:01:00

Input seconds:3599
0:59:59

Input seconds:86229
0:57:09

Input seconds:86400
0:00:00
*/