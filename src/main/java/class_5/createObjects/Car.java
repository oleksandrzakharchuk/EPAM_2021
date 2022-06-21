package class_5.createObjects;
//исполнительная система Java выделяет память под хранение объекта, когда вы ее запрашиваете с помощью оператора new. При этом необходимо после оператора вызвать конструктор – специальный метод инициализации объекта
//создание объекта состоит из трех этапов: объявления, выделения памяти, инициализации.
//Обявление - Связывание имени переменной с типом объекта, то есть создание ссылочной переменной для хранения адреса памяти, где размещается объект.

//Выделение памяти - Запрос на выделение памяти под хранение объекта. Всегда осуществляется с помощью оператора/ключевого слова new.

//Инициализация - Обращение к конструктору, задача которого – проинициализировать создаваемый объект. Всегда идет в паре с new.

//пример описания класса Car и создания его объектов.

public class Car {
    private static String carModel;//В классе приведено объявление поля carModel
    public static String getCarModel() {//метода доступа к нему getCarModel().
        return carModel;
    }
}
 class Demo {
    public static void main(String[] arg) {
        Car car1 = new Car();//При использовании ключевого слова new система выделяет необходимый объем памяти для нового объекта в "куче".
        Car car2 = new Car();
        Car car3 = new Car();
        String name = car1.getCarModel();//вызывает конструктор для инициализации объекта (установки его полей в начальные значения). После этого поля и методы объекта становятся доступными через полученную ссылку на объект.
        System.out.println(name);
    }
    //Если ссылочная переменная не связана с объектом, она имеет нулевое/пустое значение:
     //
     //нулевое значение определяется литералом null
     //литерал null всегда может быть назначен/присвоен или приведен к любому ссылочному типу.

     //приведение
    String str1 = null;
     Car car1 = null;
     String str2 = (String)null;
     Car car2 = (Car)null;

     //операции
     //Литерал null можно сравнивать со значениями ссылочных переменных с помощью операторов == и !=.
     //Литерал null нельзя использовать с другими операторами отношений, например, < или >.
     //System.out.println(null == null);
//System.out.println(car1 == null);
//System.out.println(car1 != car2);

     //вызов метода
     //При вызове метода экземпляра через ссылочную переменную со значением null, произойдет ошибка времени исполнения - NullPointerException!
   //  car1 = null;
//car1.getCarModel();
}



