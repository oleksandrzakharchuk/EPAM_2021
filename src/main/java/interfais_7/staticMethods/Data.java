package interfais_7.staticMethods;
//Статические методы:
//
//отмечаются ключевым словом static и обязаны иметь реализацию

//не наследуется классами, реализующими интерфейс, а также другими интерфейсами, так как принадлежат самому интерфейсу

//не могут быть переопределенными в классе, реализующем интерфейс
//подобны статическим методам класса и вызываются через имя интерфейса
//обычно используются другими методами интерфейса в качестве вспомогательных, например, для проверки на null.

public interface Data {
   // Опишем интерфейс Data со статическим методом isNull() и методом по умолчанию print().
   default void print(String str) {
       if ( !isNull(str) ) {
           System.out.println("Data. Prints lines: " + str);
       }
}
    static boolean isNull(String str) {
        System.out.println("Static method null checking ");
        return str == null ? true : "".equals(str.trim()) ? true : false;
    }
}

//Метод по умолчанию должен иметь тело всегда
//Класс, реализующий интерфейс, может использовать метод по умолчанию без переопределения
//Интерфейс может содержать методы с реализаций типа default и static
//Интерфейс может содержать любое количество методов разных типов