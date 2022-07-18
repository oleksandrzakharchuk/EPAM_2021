package interfais_7.shape;

public class Demo1 {
    public static void main(String[] args) {
        Shape object = new Circle(7.01);//создается ссылка object на интерфейс Shape, а инициализируется она объектом класса Circle (это полиморфное использование интерфейсов), на котором вызывается метод getSquare().
        System.out.print("Square: " + object.getSquare());//вызывается метод getSquare().
    }
}
//Объектную ссылку на интерфейсный тип можно связывать с любым объектом, чей класс реализует этот интерфейс:
//
//через эту ссылку можно вызывать только методы, объявленные в интерфейсе
//собственные методы класса недоступны.