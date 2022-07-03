package oop_6.inheritance.overridingMethods.base3;

//Как вам уже известно, элементы с доступом protected наследуются подклассом вне зависимости от того, в одном или разных пакетах определены суперкласс и его подкласс. Однако, если суперкласс и подкласс находятся в разных пакетах, то область видимости protected элементов ограничивается только телом подкласса. Вне его они недоступны. Для того чтобы унаследованные protected методы сделать доступными для использования вне тела подкласса, можно при переопределении такого метода изменить модификатор доступа на public.
//
//В этом примере описаны три класса в разных пакетах. Суперкласс Vehicle в пакете com.model.basic_transport с protected полем maxSpeed и protected методом экземпляра showSpeed(). Подкласс Bicycle в пакете com.model.derived_transport при переопределении метода showSpeed() изменяет модификатор доступа на public. Класс Demo в третьем пакете com.model.test_transport создает объекты классов Vehicle и Bicycle. Затем на этих объектах происходит обращение к полю maxSpeed и вызов метода showSpeed().

//package com.model.basic_transport;

    public class Vehicle {
        protected int maxSpeed = 230;
        protected void showSpeed() {
            System.out.println(maxSpeed);
        }
    }

//package com.model.derived_transport;
//import com.model.basic_transport.Vehicle;

    class Bicycle extends Vehicle {
        public void showSpeed() {//изменение области видимости переопределенного метода
            System.out.println(maxSpeed);
        }
    }

