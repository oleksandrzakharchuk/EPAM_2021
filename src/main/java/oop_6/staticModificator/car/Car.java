package oop_6.staticModificator.car;

//Необходимо вести учет количества созданных объектов класса Автомобиль. В этом примере описан класс Car. В нем определено закрытое поле numOfCars для подсчета количества объектов этого класса. При создании объектов значение поля numOfCars увеличивается на 1. Обращением к методу getNumOfCars() можно получить значение поля numOfCars. В методе main() класса Demo2 создается три объекта класса Car, а затем выводится в консоль значение поля numOfCars.

public class Car {
    private int numOfCars;
    //другие поля
    public Car() {
        numOfCars++;
    }
    //другие методы
    public int getNumOfCars() {
        return numOfCars;
    }
}

