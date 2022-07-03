package oop_6.inheritance.overridingMethods.base3;

//package com.model.test_transport;
//import com.model.basic_transport.Vehicle;
//import com.model.derived_transport.Bicycle;

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bicycle bicycle = new Bicycle();
        System.out.println(vehicle.maxSpeed);//ошибка компиляции
        System.out.println(bicycle.maxSpeed);
        vehicle.showSpeed();
        bicycle.showSpeed();
    }
}

//Во всех случаях, кроме вызова метода showSpeed() на объекте Bicycle, получили ошибку компиляции. Это произошло потому, что protected элементы одного класса недоступны из классов, находящихся в других пакетах.