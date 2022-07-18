package interfais_7.featuresOfPolymorphicUseOfInterfaces.multiInterfaceImplementation;

//Опишем класс Demo3, в котором рассмотрим различные способы обращения к полям и методу.

//Правильнее обращаться к полю через имя интерфейса, так как поля статические.

public class Demo3 {
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        System.out.println(obj.someMethod());
        System.out.println(((Interface2) obj).someMethod());
        System.out.println(((Interface1) obj).someField);
        System.out.println(Interface1.someField);
    }
}
//In interface2 = 200.5
//It Works
//In interface2 = 200.5
//It Works
//100
//100

//В процессе разработки программного обеспечения часто случается так, что нужно внести изменения в код программы. Если один модуль программы зависит от деталей другого модуля, то изменения, сделанные в первом модуле, могут нарушить корректную работоспособность второго модуля. Такие модули называются сильно связанными.
//
//Интерфейсы в данном случае позволяют нам абстрагироваться от деталей реализации путем определения минимального количества методов, необходимых для правильного взаимодействия модулей между собой, и добавления этих методов в интерфейсы. Таким образом, определив интерфейсы между модулями, мы получаем слабую связанность классов между собой, абстрагируемся от деталей реализации и уменьшаем риск нарушить работоспособность связанных модулей.