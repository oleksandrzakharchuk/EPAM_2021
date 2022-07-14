package interfais_7.defaultMethods;
//Опишем класс самолета Plane, который реализует интерфейс FlyingMachine, для работы с которым достаточно переопределить только абстрактные методы интерфейса, и класс можно использовать.

public class Plane implements FlyingMachine {
    @Override
    public void blastOff() {
        System.out.println("The plane is blasting off");
    }

    @Override
    public void landing() {
        System.out.println("The plane is landing");
    }
}
