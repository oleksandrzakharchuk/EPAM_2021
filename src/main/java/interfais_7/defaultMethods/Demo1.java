package interfais_7.defaultMethods;
//В классе Demo1 создадим ссылку типа интерфейса FlyingMachine и инициализируем ее объектом класса Plane, затем вызовем метод makeTravel().
public class Demo1 {
    public static void main(String[] args) {
        FlyingMachine plane = new Plane();
        plane.makeTravel();
    }
}
