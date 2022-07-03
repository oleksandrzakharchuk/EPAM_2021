package oop_6.inheritance.constructorChainCallRules.rulle_3;

//А в классе BritishCat описан только конструктор c параметром. Конструктор класса BritishCat не обращается явно ни к одному конструктору класса Rull_3_Cat. При этом выполняется конструктор по умолчанию класса Rull_3_Cat.

public class BritishCat extends Rull_3_Cat {
    BritishCat(String name) {

        System.out.println("British constructor");
    }
}
//Cat default constructor
//British constructor