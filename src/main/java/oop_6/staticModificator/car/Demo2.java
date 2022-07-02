package oop_6.staticModificator.car;

public class Demo2 {
    public static void main(String[] arg) {
        Car сar1 = new Car();
        Car сar2 = new Car();
        Car сar3 = new Car();
        System.out.println(сar3.getNumOfCars());//1 В итоге, вместо ожидаемого значения 3, получили 1. Это произошло, потому что поле numOfCars является полем экземпляра. Каждый объект имеет свою копию этого поля с начальным значением 0, которое принимает значение 1 в процессе создания объекта. В этом примере было бы более правильным сделать поле numOfCars статическим. Тогда оно было бы общим для всех объектов.

    }
}
