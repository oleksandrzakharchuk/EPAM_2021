package oop_6.encapsulation.package_privat;

//package com.epam.eun.main;
public class Main {
    public static void main(String[] arg) {
        Car3 fastCar = new Car3();
        fastCar.speed = 100; // ошибка компиляции: отсутствует к полю, так как класс Car3 and Main находяться в разных пекетах(package com.epam.eun.entity;  and package com.epam.eun.main;)
        fastCar.setSpeed(100);
        System.out.println(fastCar.getSpeed());
    }
}
