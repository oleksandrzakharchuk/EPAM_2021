package class_5.classConstructor;
//Закрытые конструкторы могут вызываться из других конструкторов или из статических методов этого же класса.
// Любой конструктор может ссылаться на другой конструктор в том же классе, используя ключевое слово this:
//это осуществляется без использования оператора new
//вместо имени класса следует применить ключевое слово this
//обращение к другому конструктору должно быть первым действием в теле такого конструктора.

//конструктор без параметров и с одним параметром вызывают конструктор с двумя параметрами. Такой синтаксис позволяет избежать дублирования кода инициализации полей экземпляра.

public class CarСonstructorFromAnother {
    public static void main(String[] args) {

    }
    private String model;
    private String brand;

    public CarСonstructorFromAnother() {
        this("Camry", "Toyota");
        System.out.println("Init");
    }

    public CarСonstructorFromAnother(String model) {
        this(model, "Toyota");
    }

    public CarСonstructorFromAnother(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
}
//задача конструктора - создать объект, не должен быть перенапряжен какимито другими действиями. Его задача принять и присвоить значения. Максимум-иногда проверить