package oop_6.inheritance.supersuper;

public class Derived extends Base {
    private int c;

    Derived(int a, int b, int c) {
        super(a, b);//явное обращение к конструктору супер класса должно быть первым опрератором в теле конструктора подкласса
        this.c = c;
    }
}
