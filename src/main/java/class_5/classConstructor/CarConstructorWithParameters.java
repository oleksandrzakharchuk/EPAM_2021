package class_5.classConstructor;
//В некоторых случаях достаточно иметь в классе только конструктор по умолчанию. Однако зачастую конструктор должен принимать один или несколько параметров для начальной инициализации объекта. Параметры в конструктор передаются таким же образом, как и в метод. Для этого достаточно объявить их в круглых скобках после имени конструктора.
//В классе может быть несколько конструкторов с разным набором параметров – для различного начального состояния объекта (различного представления объекта). То есть конструкторы, как и методы, можно перегружать. Например, в следующем описании класса присутствует несколько конструкторов:

class Car {
    private String model;
    private String brand;
    //Если в классе присутствует явно описанный конструктор с параметрами, то Java сама уже не создает конструктор по умолчанию. А значит обращение к такому конструктору приведет к ошибке компиляции. Для его применения требуется явно описать конструктор без параметров!

    public Car() {}
    public Car(String model) {
        this.model = model;
    }
    public Car(String model, String brand) {
    //private Car(String model, String brand) { приватный конструктор не может быть вызван вне тела класса
        this.model = model;
        this.brand = brand;
    }
    //   геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
class Main3 {
    public static void main(String[] arg) {
        Car car1 = new Car();
        Car car2 = new Car("Camry");
        Car car3 = new Car("Camry", "Toyota");
        System.out.println(car1.getModel() + " " + car1.getBrand());
        System.out.println(car2.getModel() + " " + car2.getBrand());
        System.out.println(car3.getModel() + " " + car3.getBrand());// ошибка компиляции при вызове приватного конструктора private Car(String model, String brand) {.
        // В описании конструктора можно использовать любой модификатор доступа. Если конструктор в классе имеет доступ private, то он не может быть вызван из любого места за пределами класса.
        // Закрытые конструкторы могут вызываться из других конструкторов или из статических методов этого же класса.
    }
}
//null null
//Camry null
//Camry Toyota