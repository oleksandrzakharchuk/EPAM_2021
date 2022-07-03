package oop_6.inheritance.constructorChainCallRules.rulle_4.demo_shading;

public class Car extends Vehicle {

    protected int maxSpeed = 300;//класс Car объявляет свое собственное поле с именем maxSpeed. Происходит затенение видимости унаследованного поля. Для разрешения этой ситуации в методе showSpeed() подкласса Car, используется ключевое слово super.

    public void showSpeed() {
        System.out.println(super.maxSpeed);// доступ из подкласса к затененному полю супер класса через ссылку super.

        System.out.println(maxSpeed);
    }
}
//С точки зрения синтаксиса, ситуация по доступу к обоим полям разрешилась. Однако, в этом случае в классе Car имеется два поля, сохраняющих значение максимальной скорости с разными величинами. Вопрос: что же истина? Именно поэтому сокрытие полей желательно не применять.