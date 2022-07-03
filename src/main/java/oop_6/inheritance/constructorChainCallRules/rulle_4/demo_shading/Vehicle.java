package oop_6.inheritance.constructorChainCallRules.rulle_4.demo_shading;

//пример затенения поля. В классе Vehicle описано поле maxSpeed. Область видимости данного поля перейдет в подкласс Car, потому что доступ к нему определен как protected. Однако класс Car объявляет свое собственное поле с именем maxSpeed. Происходит затенение видимости унаследованного поля. Для разрешения этой ситуации в методе showSpeed() подкласса Car, используется ключевое слово super.

public class Vehicle {
    protected int maxSpeed = 230;
}

