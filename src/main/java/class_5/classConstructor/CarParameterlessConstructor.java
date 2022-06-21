package class_5.classConstructor;
//Существуют два типа конструкторов: без параметров (конструкторы по умолчанию) и с параметрами (пользовательские конструкторы).

//Конструктор без параметров – это конструктор, который не имеет параметров и используется для инициализации полей экземпляра нулевыми значениями либо некоторыми предопределенными/начальными. Если в классе нет явного описания конструктора, то Java создает конструктор без параметров, который инициализирует поля экземпляра нулевыми значениями своего типа.

import class_5.createObjects.Car;

public class CarParameterlessConstructor {
    private String modelCarParameterlessConstructor;

    public String getModelCarParameterlessConstructor() {
        return modelCarParameterlessConstructor;
    }
}
 class Main {
    public static void main(String[] arg) {
        CarParameterlessConstructor car2 = new CarParameterlessConstructor();//обращение к конструктору без параметров
        System.out.println(car2.getModelCarParameterlessConstructor());//null
    }
}
