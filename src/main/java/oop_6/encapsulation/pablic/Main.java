package oop_6.encapsulation.pablic;

public class Main {
    public static void main(String[] arg) {
        Car fastCar = new Car();
        fastCar.speed = 100;//прямой доступ к полю через обект
        System.out.println(fastCar.getSpeed());//прямой доступ к методу через обект
    }
}
