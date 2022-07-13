package oop_6.polymorphisms.methodsOverload.compilationErrorInStepFour;
//В этом примере описаны три метода с именем doJob():
//
//первый с одним параметром переменной арности типа String
//второй с двумя параметрами типа String
//третий с одним обязательным параметром типа String и вторым параметром переменной арности типа String.
//Если вызывать метод с одним аргументом, то получаем неопределенность – подходят два из описанных методов (первый и третий). Или, если вызывать с тремя аргументами, то тоже будет неопределенность – подходят два из описанных методов (первый и третий). Поэтому компилятор будет сигнализировать об ошибке.

public class Main {
    static void doJob(String... ss) {
        System.out.println("String...");
    }
    static void doJob(String s1, String s2) {
        System.out.println("String, String");
    }
    static void doJob(String s1, String... str) {
        System.out.println("String, String...");
    }
    public static void main(String[] args) {
        //doJob("hi");  компилятор  сигнализирует об ошибке.
        //doJob("hi", "hi", "hi"); компилятор  сигнализирует об ошибке.
    }
}
