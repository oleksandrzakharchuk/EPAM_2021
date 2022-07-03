package oop_6.inheritance.car;
//пример описания наследования для классов Car и ElectricCar, оставив тело подкласса ElectricCar без реализации. Помните, что компилятор добавит в описание класса ElectricCar конструктор по умолчанию. Также необходимо убедиться, что согласно правилам наследования, класс ElectricCar получил в свою область видимости (унаследовал) методы setName() и show() класса Car.
public class Program {
    public static void main(String[] args) {

        Car car = new Car();
        car.setName("Wheels");
        car.show();

        ElectricCar electricCar = new ElectricCar();
        electricCar.setName("Lightning");//вызов унаследованного метода
        electricCar.show();
    }
}
////Name: Wheels
////Name: Lightning