package oop_6.staticModificator.staticDemo;

public class Demo1 {
    public static void main(String[] s) {
        StaticDemo.callme();//вызов метода класса без создания экземпляра класса
        System.out.print("b = " + StaticDemo.b);//обращение к полю класса
    }
}
//a = 42
//b = 99