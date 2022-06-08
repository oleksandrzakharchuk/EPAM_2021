package meetPractise_1;
//напишите простую программу, которая печатает: "Hello, Autocode!" (не печатайте кавычки).

import java.io.IOException;
import java.util.Scanner;

public class MeetAutoCade {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string Hello, Autocode! without quotation marks : ");
        if (in.hasNextLine()) {
            String str = in.nextLine();
            System.out.println("Print " + "Hello, Autocode!" + "  with quotation marks : " + (char) 34 + str + (char) 34);
        }
// or
        String x = "\"Hello, Autocode!";
        String z = x.replace("\"", "");
        System.out.println("Or print Hello, Autocode! without quotation marks : " + z);
    }
}
/* Enter the string Hello, Autocode! without quotation marks : Hello, Autocode!
Print Hello, Autocode!  with quotation marks : "Hello, Autocode!"
Or print Hello, Autocode! without quotation marks : Hello, Autocode! */


        //Character ch =  'Hello, Autocode!';
       // System.out.println((char) 34 + ch + (char) 34);

        //char = Hello, Autocode!;//Hello, Autocode!

        // newStr = char.replace(" ", """");
        // System.out.println(newStr);

        //System.out.printf((char)34+ "%", 'Привет' + (char)34);
   // String.format("Привет м%cр!",'и');
      //  System.out.println();



