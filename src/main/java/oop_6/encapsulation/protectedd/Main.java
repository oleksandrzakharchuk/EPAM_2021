package oop_6.encapsulation.protectedd;

public class Main {
    public static void main(String[] arg) {
        Car2 fastCar = new Car2();
        fastCar.speed = 100;//доступ к защищенному полю объекта возможен так как класс Car2 и клас Main находятся в одной зоне видимости (в одном пакете)
        System.out.println(fastCar.getSpeed());
    }
}
