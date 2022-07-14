package interfais_7.rhombusProblem;
//Опишем интерфейс Interface1 с абстрактным методом method1() и методом по умолчанию log().

public interface Interface1 {
    void method1(String str);
    default void log(String str) {//одноименные методы по умолчанию в двух разных интерфейсах(смю Interface1)
        System.out.println("The default method. Logging: " + str);
    }
}
//Опишем класс Class1, реализующий оба эти интерфейса, и переопределим только абстрактные методы, так как знаем, что методы по умолчанию переопределять не нужно.

//Получаем ошибку компиляции: в области класса присутствуют два метода с одинаковой сигнатурой, даже несмотря на то, что они имеют одинаковую реализацию. Компилятор не проверяет код на совпадения.

//public class Class1 implements Interface1, Interface2 {//ошибка компиляции
    //@Override
    //public void method2() { //рефлизация только абстрактных методов
        // ...
   /* }
    @Override
    public void method1(String str) {
        // ...
    }
}
*/