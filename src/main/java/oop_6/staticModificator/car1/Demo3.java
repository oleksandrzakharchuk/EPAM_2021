package oop_6.staticModificator.car1;

public class Demo3 {
    public static void main(String[] arg) {
        Car1 сar1 = new Car1();
        Car1 сar2 = new Car1();
        Car1 сar3 = new Car1();
        System.out.println(сar1.getNumOfCars());//3 Теперь, когда в методе main() класса Demo2 создается три объекта класса Car, а затем выводится в консоль значение поля numOfCars, получаем в результате 3. Это происходит потому, что поле numOfCars является общим для всех объектов и они все разделяют доступ к нему.
    }
}
//[](![public static int numOfCar](img_2.png))

//Рекомендация: методы, которые используют только статические данные класса, лучше всего описывать как статические, чтобы можно было использовать их без создания экземпляра класса.