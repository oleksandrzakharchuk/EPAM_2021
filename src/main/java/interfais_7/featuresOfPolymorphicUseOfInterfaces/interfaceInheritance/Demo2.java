package interfais_7.featuresOfPolymorphicUseOfInterfaces.interfaceInheritance;

//В классе Demo2 создадим ссылку object на интерфейс Call, проинициализируем ее объектом класса Client и вызовем на ней метод сall().

public class Demo2 {
    public static void main(String[] args) {
        Call object = (Call) new Client();
        object.сall();
    }
}
//сall() of class Client: NUM = 10
//сall() of class BASE: i = -5
