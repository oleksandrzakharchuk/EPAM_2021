package all_java.person;

public class Main {
    public static void main(String[] args) {
        Person person = new Student();
        System.out.println(person.version);
    }
}
//Person
// Поля в Java не являются полиморфными. Это значит, что к какому полю происходит обращение вне тела подкласса, зависит от типа ссылки, а не типа объекта. В этом случае, у класса Student есть два поля с именем version (свое и унаследованное). Обращение к полю происходит через ссылку на суперкласс Person, потому используется унаследованное поле.