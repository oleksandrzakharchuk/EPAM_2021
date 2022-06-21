package class_5.ThisIsLink;

public class ThisIsLinkToObjectInClass {
   // Ключевое слово this – это ссылка на текущий объект внутри класса, то есть объект, для которого выполняются метод или конструктор. Слово this используется для обращения к любому члену текущего объекта внутри метода экземпляра или конструктора.

   //У этого класса есть поле с именем speed, и метод setSpeed()  имеет параметр с именем speed. Внутри этого метода параметр перекрывает область видимости поля. Чтобы различить обращение к полю, перед ним указывается ссылка this (обращение к текущему объекту).

   private String model;
    private int year;
    private int speed;
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }
}
//Наиболее распространенная причина для использования ключевого слова this – необходимость различать поля и локальные переменные/параметры, если они имеют одинаковые имена.
//Существуют особые методы доступа к закрытым полям класса:
//
//Геттер – это метод для получения значения поля. Имя метода начинается с глагола get, а дальше следует название поля в стиле camelCase.
//Сеттер – это метод для установки значения поля. Имя метода начинается с глагола set, а дальше следует название поля в стиле camelCase.
