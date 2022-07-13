package oop_6.polymorphisms.methodsOverload.inTheFourthStep;

//В этом примере описаны три метода с именем doJob(), с одним и двумя параметрами ссылочного типа String, а также с параметром переменной арности того же типа String. Поскольку методы переменной арности, как подходящие, проверяются самыми последними, то этот метод будет исполняться только в случае третьего вызова, когда у метода указаны три аргумента.

public class Main {
    static void doJob(String s) {
        System.out.println("String");
    }
    static void doJob(String s1, String s2) {
        System.out.println("String, String");
    }
    static void doJob(String s1, String... str) {
        System.out.println("String, String...");
    }
    public static void main(String[] args) {
        doJob("hi");
        doJob("hi", "hi");
        doJob("hi", "hi", "hi");
    }
}
//String
//String, String
//String, String...