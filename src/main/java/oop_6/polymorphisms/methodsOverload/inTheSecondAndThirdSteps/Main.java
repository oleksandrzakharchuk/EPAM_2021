package oop_6.polymorphisms.methodsOverload.inTheSecondAndThirdSteps;
//В этом примере описаны два метода с именем doJob():
//
//первый с параметром примитивного типа int
//второй ссылочным Double.
//Когда методы вызываются, то аргументы имеют тип byte и Byte. Поэтому в этом случае для первого вызова разрешение происходит на втором шаге, приведением byte → int. Для второго вызова – при приведении ссылки к супертипу не нашлось нужного метода. Тогда компилятор выполняет распаковку аргумента типа Byte в примитивный тип byte, а затем расширяющим приведением находит метод с типом параметра int.

public class Main {
    static void doJob(int i) {  System.out.println("int");  }
    static void doJob(Double d) {  System.out.println("Double");  }
    public static void main(String[] args) {
        byte b = 5;
        Byte bb = b;
        doJob(b);
        doJob(bb);
    }
}
//int
//int
