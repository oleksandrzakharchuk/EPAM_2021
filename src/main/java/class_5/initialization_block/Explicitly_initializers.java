package class_5.initialization_block;
//Второй шаг – это ЯВНЫЕ ИНИЦИАЛИЗАТОРЫ полей класса в их начальные значения. К слову, каждое поле класса может явно быть проинициализировано некоторым значением, если эту инициализацию можно записать в одну строку. Рассмотрим пример описания класса с несколькими статическими полями различных типов. Проинициализируем их при объявлении литералами своего типа и отобразим в консоль их значения.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Explicitly_initializers {
    private static char ch = 'A';
    private static boolean bb = true;
    private static byte by = -56;
    private static int ii = 1000;
    private static float ff = 1.25e-2F;
    private static String str = "Data";
    private static int[] array = {0, 1, 2, 3};
    public static void main(String[] arg) {
        System.out.println("char: " + ch);//char: A
        System.out.println("boolean: " + bb);//boolean: true
        System.out.println("byte : " + by);//byte : -56
        System.out.println("int: " + ii);//int: 1000
        System.out.println("float: " + ff);//float: 0.0125
        System.out.println("String: " + str);//String: Data
        System.out.println("Array: " +  array);//Array: [I@5e5792a0-адрес памяти
        System.out.println("Array: " +  Arrays.toString(array));//Array: [0, 1, 2, 3] - содержание массива

        //Компилятор Java автоматически генерирует метод инициализации класса (внутренний метод с именем <clinit>) для каждого класса:
        //
        //метод гарантированно будет вызываться только один раз, когда класс впервые используется/упоминается
        //выражения инициализации полей класса вставляются в метод инициализации класса в порядке их появления в исходном коде. Как следствие, в выражении инициализации поля класса можно использовать ранее объявленные поля этого класса.

        //public class InitDemo3 {
        //    //...
        //    private static byte by = 17;
        //private static int ii  = 24 * by;
        //
        //    //...
        //}

        //В выражении инициализации поля класса можно использовать обращение к статическому методу. Преимущество – повторное использование, если есть необходимость в использовании кода метода неоднократно.

    }
   /* private static int ii = initSt();

    //...
    private static int initSt() {
        System.out.println("Init ii value");
        return 1000;
    }
    //...
    public static void main(String[] arg) {
        System.out.println("Main");
        System.out.println("int: " + ii);
    }*/

}
