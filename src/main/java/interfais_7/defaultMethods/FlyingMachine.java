package interfais_7.defaultMethods;
//пишем интерфейс FlyingMachine:
//
//с абстрактными методами взлета blastOff() и посадки landing()
//с методами по умолчанию: makeTravel() – перелет из одной точки в другую; и fly() – полет по эшелону
//эти методы имеют реализацию, так как их работа не очень зависит от типа самолета.

public interface FlyingMachine {
    void blastOff();
    void landing();

    default void makeTravel() {//Методы по умолчанию:        отмечаются ключевым словом default  и должны иметь тело.
        // класс не обязан переопределять тело такого метода, то есть может использовать его как есть.

        blastOff();
        fly();
        landing();
    }
    default void fly() {
        System.out.println("Machine is flying!");
    }
}
//The plane is blasting off
//Machine is flying!
//The plane is landing

