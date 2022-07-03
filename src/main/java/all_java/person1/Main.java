package all_java.person1;

public class Main {
    public static void main(String[] args) {

        SuperMan superMan = new SuperMan("super vision", "Clark Kent");
        System.out.print(superMan.showInfo());
    }
}
//null has super vision
// Поле skills будет инициализировано переданным в конструктор класса SuperMan значением. Поле name суперкласса Person получило значение по умолчанию, так как из конструктора SuperMan значение никак не было передано в конструктор суперкласса.