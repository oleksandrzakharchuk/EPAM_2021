package oop_6.encapsulation.package_privat;
//package com.epam.eun.entity;
//Если модификатор уровня доступа не указан, то класс или член класса будут видимыми и доступными только в теле этого же класса или класса из того же пакета. В таком случае по умолчанию устанавливается модификатор package-private.
//package com.epam.eun.entity;
public class Car3 {
    //...
    int speed;//доступ package_privat так как нет явно указанного модификатора доступа
    //...
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //...
}

