package oop_6.encapsulation.privat;

public class Main {
    public static void main(String[] arg) {
        Car1 fastCar = new Car1();
         // fastCar.speed = 100; //ошибка компиляции, отсутствует доступ к закрытому полю
        fastCar.setSpeed(100);//доступ к закрытому полю через открытый метод - сеттер
        System.out.println(fastCar.getSpeed());
    }
}
