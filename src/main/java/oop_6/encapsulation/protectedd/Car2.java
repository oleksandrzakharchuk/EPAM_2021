package oop_6.encapsulation.protectedd;

//Модификатор protected может использоваться перед описанием члена класса: метода, конструктора, поля, вложенного класса/интерфейса.
// Он определяет, что доступ к члену класса возможен только в теле этого же класса, класса из того же пакета или класса-наследника, даже если он находится в другом пакете (области видимости).

public class Car2 {
    protected int speed;
    //...
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //...
}

