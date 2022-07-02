package oop_6.encapsulation.privat;
//Модификатор private может использоваться только перед описанием члена класса: метода, конструктора, поля, вложенного класса/интерфейса. Он определяет, что доступ к члену класса возможен только в теле этого же класса.

public class Car1 {
    private int speed;
    //...
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //...
}


