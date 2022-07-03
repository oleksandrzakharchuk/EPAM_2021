package oop_6.inheritance.overridingMethods.base1;

public class Demo1 {
    public static void main(String[] args) {
        Base1 base = new Base1();
        Derived obj = new Derived();
        base.show();// для каждого обекта выполняеться его вариант метода
        obj.show();
    }
}
//Base
//Derived
