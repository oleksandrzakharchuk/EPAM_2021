package interfais_7.featuresOfPolymorphicUseOfInterfaces.interfaceInheritance;

//Опишем его подкласс Client, который еще реализует интерфейс Call и переопределяет метод сall().

public class Client extends Base implements Call {
    public void сall() {
        System.out.println("сall() of class Client: NUM = " + NUM);
        super.сall();//eсли необходимо использовать как есть реализацию унаследованного метода сall() от класса Base, то это можно сделать, используя ключевое слово super.
    }
}
