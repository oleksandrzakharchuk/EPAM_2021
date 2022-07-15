package interfais_7.staticMethods;
//Опишем класс DataImpl, который реализует интерфейс Data, и определим в нем свой собственный метод isNull().

public class DataImpl implements Data {
//В методах isNull() и класса и интерфейса присутствует код вывода сообщений, но разный – это сделано для того, чтобы отследить, в каком случае какой метод исполняется.
    public boolean isNull(String str) {
        System.out.println("Null check ");
        return str == null;
    }
//В методе main() создадим экземпляр класса DataImpl и вызовем на нем методы print() и isNull().
    public static void main(String[] args) {
        DataImpl obj = new DataImpl();
        obj.print("");//В результате: когда исполняется метод по умолчанию print(), то мы наблюдаем, что вызывается статический интерфейса Data, а не метод isNull() класса DataImpl. Только по обращению к методу isNull() через ссылку на объект, уже исполняется собственный метод класса DataImpl.
        //Static method null checking
        //Null check
        obj.isNull("abc");
    }
}
//Таким образом, начиная с версии Java 8, в языке программирования появились статические методы интерфейса, а также методы интерфейса по умолчанию.