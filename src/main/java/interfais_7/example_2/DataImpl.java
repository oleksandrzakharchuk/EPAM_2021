package interfais_7.example_2;

public class DataImpl implements Data {
    public static void main(String[] args) {
        Data obj = new DataImpl();
        obj.print("test");
    }
}
//Объект класса DataImpl имплементирующий Data вызывает дефолтный метод интерфейса, который в свою очередь вызывает статический метод этого же интерфейса.