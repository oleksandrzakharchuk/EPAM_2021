package oop_6.polymorphisms.methodsOverload.inTheSecondStep;
//В этом примере описаны три метода с именем doJob(), с параметрами примитивных типов byte, int, double. Когда методы вызываются, то аргументы имеют тип short, long и double. Поэтому в этом случае два типа аргумента не соответствуют типам параметров. Поскольку аргументы относятся к примитивным типам данных, то компилятор сначала выполнит расширяющее приведение и проверит результат на совпадение с параметрами. Ближайший существующий тип для short → int, для long → double.

public class Main {
    static void doJob(byte b) {  System.out.println("byte");  }
    static void doJob(int i) {  System.out.println("int");  }
    static void doJob(double d) {  System.out.println("double");  }
    public static void main(String[] args) {
        short s = 10;
        long x = s;
        double dd = s;
        doJob(s);
        doJob(x);
        doJob(dd);
    }
}
//int
//double
//double