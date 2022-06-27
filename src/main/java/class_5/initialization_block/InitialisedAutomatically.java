package class_5.initialization_block;

import java.lang.reflect.Array;

//Блоки инициализации – это специальные конструкции класса, которые предназначены для инициализации полей класса (статических) и полей экземпляра. Инициализация класса начинается с загрузки его описания в оперативную память.
//
//Существует несколько шагов инициализации или блоков инициализации:
//
//автоматическая инициализация полей классов
//явные инициализаторы полей класса
//статические блоки инициализации
//динамические блоки инициализации/конструкторы.
public class InitialisedAutomatically {
    //Первый шаг инициализации класса – это автоматическая инициализация значениями по умолчанию. Например, значение по умолчанию для типа char – это символ ‘NULL’, то есть неотображаемый символ. Обратите внимание на пример описания класса с несколькими статическими полями различных типов. Оставим их без явной инициализации и отобразим в консоль их значения.
    private static char ch;
    private static boolean bb;
    private static byte by;
    private static int ii;
    private static float ff;
    private static String str;
    private static Array[] array;

    public static void main(String[] arg) {
        System.out.println("char: " + ch);//char:
        System.out.println("boolean: " + bb);//boolean: false
        System.out.println("byte : " + by);//byte : 0
        System.out.println("int: " + ii);//int: 0
        System.out.println("float: " + ff);//float: 0.0
        System.out.println("String: " + str);//String: null
        System.out.println("Array: " + array);//Array: null
        //Если статические поля только объявить, то они будут проинициализированы значениями по умолчанию своего типа и их можно будет использовать.
    }
}
