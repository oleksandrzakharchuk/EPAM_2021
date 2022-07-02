package oop_6.staticModificator.car1;

// В классе Car поле numOfCars описано как статическое. Соответственно метод для получения его значения getNumOfCars() тоже статический.

public class Car1 {
    private static int numOfCars;
    //другие поля
    public Car1() {
        numOfCars++;
    }
    //другие методы
    public static int getNumOfCars() {
        return numOfCars;
    }
}

