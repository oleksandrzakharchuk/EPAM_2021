package oop_6.polymorphisms.methodsOverload.inTheFirstStep;
//В этом примере описаны два метода с именем doJob():
//
//первый с параметром примитивного типа byte
//второй – с ссылочным Byte.
//Когда методы вызываются, то аргументы тоже имеют тип byte и Byte. Поэтому в этом случае получается точное соответствие типов аргументов и параметров.

public class Main {
    static void doJob(byte b) {  System.out.println("byte");  }
    static void doJob(Byte b) {  System.out.println("Byte");  }
    public static void main(String[] args) {
        byte b = 5;
        Byte bb = b;
        doJob(b);
        doJob(bb);
    }
}
//byte
//Byte