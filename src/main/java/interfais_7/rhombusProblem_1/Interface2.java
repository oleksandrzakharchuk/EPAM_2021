package interfais_7.rhombusProblem_1;
//Опишем интерфейс Interface2 с абстрактным методом method2() и методом по умолчанию log().

public interface Interface2 {
    void method2();

    default void log(String str) {

        System.out.println("The default method. Logging: " + str);
    }
}
