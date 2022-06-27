package class_5.initialization_block;

public class StaticMethod {
    private static int ii = initSt();

    //...
    private static int initSt() {
        System.out.println("Init ii value");//Init ii value
        return 1000;
    }
    //...
    public static void main(String[] arg) {//если инициализируется класс с точкой входа в Java-программу, то метод main() выполняется после инициализации полей класса.

        System.out.println("Main");//Main
        System.out.println("int: " + ii);//int: 1000
    }
}
