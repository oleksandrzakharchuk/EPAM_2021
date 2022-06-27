package class_5.initialization_block;

public class ExInitForFildClassForEXEMPlARClass {
    private int a = 5;//поле экземпляра

    private static int b = 100;//поле класса
    {
        a = -5;
        System.out.println("Dynamic initialization section");
    }
    public ExInitForFildClassForEXEMPlARClass() {
        a = 10;
        b = 10;
        System.out.println("Constructor");
    }
    static {
        b = -5;
        System.out.println("Static initialization section ");
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        ExInitForFildClassForEXEMPlARClass obj = new ExInitForFildClassForEXEMPlARClass();
        System.out.println("a=" + obj.a + "\t\tb=" + b);
    }
}
//Static initialization section
//Main
//Dynamic initialization section
//Constructor
//a=10	    b=10