package ArrToInt;
import java.util.*;
import java.lang.*;
import java.io.*;
/*вычислить сумму цифр и сумму чередующихся цифр (от первого порядка до третьего порядка) для строки в JAVA, но моя попытка, похоже, вообще не работает...

Таким образом, для строки «123456789» должно быть:

Q1: 9+8+7+6+5+4+3+2+1 = 45
Q2: 89 + 67 + 45 + 23 + 1 = 225
Q3: 789 + 456 + 123 = 1368
AQ1: 9 − 8 + 7 − 6 + 5 − 4 + 3 − 2 + 1 = 5
AQ2: 89 − 67 + 45 − 23 + 1 = 45
AQ3: 789 − 456 + 123 = 456*/

public class Ideone {
    /* package whatever; // don't place package name! */



    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            String zahlen = "123456789";
            int zahl1 = Integer.parseInt(zahlen), zahl2, zahl3;
            int quersumme1 = 0, quersumme2 = 0, quersumme3 = 0;
            int altquersumme1 = 0, altquersumme2 = 0, altquersumme3 = 0;
            int i = 0;

            zahl2 = zahl1;
            zahl3 = zahl1;

            while (zahl1 > 0) {
                if (i % 2 == 0) {
                    altquersumme1 += zahl1 % 10;
                    altquersumme2 += zahl2 % 100;
                    altquersumme3 += zahl3 % 1000;
                    i++;
                } else {
                    altquersumme1 -= zahl1 % 10;
                    altquersumme2 -= zahl2 % 100;
                    altquersumme3 -= zahl3 % 1000;
                    i++;
                }
                quersumme1 += zahl1 % 10;
                quersumme2 += zahl2 % 100;
                quersumme3 += zahl3 % 1000;
                zahl1 = zahl1 / 10;
                zahl2 = zahl2 / 100;
                zahl3 = zahl3 / 1000;
            }

            System.out.println("Q1: \t" + quersumme1);
            System.out.println("AQ2: \t" + altquersumme1);
            System.out.println("Q2: \t" + quersumme2);
            System.out.println("AQ2:\t" + altquersumme2);
            System.out.println("Q3:\t\t" + quersumme3);
            System.out.println("AQ3:\t" + altquersumme3);
        }
    }

