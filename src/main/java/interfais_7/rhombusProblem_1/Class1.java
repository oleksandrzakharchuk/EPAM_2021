package interfais_7.rhombusProblem_1;
//класс Class1 обязан предоставить свою собственную реализацию методов по умолчанию. В рассматриваемом случае она повторяет код методов интерфейсов. Опишем класс Main, в котором создадим объект класса Class1 и вызовем на нем метод log(). В результате увидим, что выполняется новая реализация этого метода.

public class Class1 implements Interface1, Interface2 {
    @Override
    public void method2() {
        // ...
    }
    @Override
    public void method1(String str) {
        // ...
    }
    @Override
    public void log(String str) {// общая реалиация метода по умолчанию
        System.out.println("Class1. Logging : " + str);
    }
}
