package oop_6.inheritance.constructorChainCallRules.rulle_2;

//в классах Rull_2_Cat и BritishCat описаны только конструкторы с параметрами.

public class BritishCat extends Rull_2_Cat {

    BritishCat(String name) {
        super(name);//Конструктор класса BritishCat обращается явно к конструктору класса Rull_2_Cat первым своим действием.

        System.out.println("British constructor");
    }
}
