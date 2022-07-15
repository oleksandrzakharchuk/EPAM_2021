package objectCloning_7.CloningAnObjectByACopyDesigner;

//Опишем класс Main, в котором создадим объект типа ClassA, а потом сделаем его копию.
public class Main {
    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        //...
        ClassA obj2 = new ClassA(obj1);// использование конструктора копирования
    }
}
