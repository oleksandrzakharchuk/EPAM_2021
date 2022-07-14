package interfais_7.featuresOfPolymorphicUseOfInterfaces.multiInterfaceImplementation;

//Опишем класс SomeClass, реализующий оба эти интерфейса. В этом классе определяется реализация метода someMethod(), общая для обоих интерфейсов.

public class SomeClass implements Interface1, Interface2 {
    @Override
    public String someMethod() {
        System.out.println("In interface2 = " + Interface2.someField);
        return "It Works";
    }
}
