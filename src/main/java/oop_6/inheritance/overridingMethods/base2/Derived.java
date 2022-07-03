package oop_6.inheritance.overridingMethods.base2;

public class Derived extends Base2 {
    @Override
    public void show() {
        super.show();
        System.out.println("Information from Derived");
    }
}
