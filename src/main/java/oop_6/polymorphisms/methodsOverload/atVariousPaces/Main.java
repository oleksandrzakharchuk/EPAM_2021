package oop_6.polymorphisms.methodsOverload.atVariousPaces;

//В этом примере описаны два метода с именем doJob():
//
//первый с двумя ссылочными типами Object
//второй с первым параметром типа String и вторым - переменной арности типа Object.
//При вызове метода с двумя аргументами типа String выполнится метод с двумя параметрами типа Object (разрешение на 2-м шаге). При вызове метода с аргументами типа Object и String выполнится метод с двумя параметрами типа Object (разрешение на 2-м шаге). И только при вызове метода с тремя аргументами типа String выполнится метод с параметром переменной арности типа Object (разрешение на 4-м шаге).

public class Main {
    static void doJob(Object obj1, Object obj2) {
        System.out.println("Object, Object ");
    }
    static void doJob(String str, Object... oo) {
        System.out.println("String, Object...");
    }
    public static void main(String[] args) {
        doJob("hi", "hi");
        doJob(new Object(), "hi");
        doJob("hi", "hi", "hi");
    }
}
//Object, Object
//Object, Object
//String, Object...