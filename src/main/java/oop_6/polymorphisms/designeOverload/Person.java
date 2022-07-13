package oop_6.polymorphisms.designeOverload;
//Конструктор это специальный метод класса предназначен для инициализации полей класса и инициализация объекта в целом. Никаких активных действий конструктор выполнять не должен. Не может быть класса у которого нет конструктора.
//
public class Person {
    private int id;
    private String name = "";

    public  Person(){//конструктор
        // если класс public то конструктор - котор предоставляеться компилятором тоже будет public. Если класс не паблик то и конструктор будет иметь дефолтную видимость
        super();
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
//Конструкторы могут быть перегруженными. Если один из конструкторов уже существует то конструктор по умолчанию не предоставляется. Его нужно писать ручками.

//Если в одном классе присутствуют два метода с одинаковыми именами, то списки их параметров должны отличаться. Такие методы считаются перегруженными.
//При обращении вызывается доступный метод — происходит разрешение перегрузки. Это происходит во время компиляции. Метод, который будет исполняться, компилятор подбирает по сигнатуре метода, типу передаваемых аргументов и включает в себя три этапа.
