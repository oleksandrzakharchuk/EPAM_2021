package objectCloning_7.clon_ex;
//Клонирование используется, когда необходимо предоставить более широкий доступ к объекту, но в то же время важно, чтобы исходный объект не подвергался изменениям. Клонирование объекта – это способ создать точную копию объекта. Для этого в Java можно использовать четыре способа, которые определены следующими элементами.

//Конструктор копирования
//
//Класс, чьи объекты нужно клонировать, должен определить конструктор, который принимает объект этого класса – конструктор копирования.

//Фабричный метод
//
//Класс, чьи объекты нужно клонировать, может в своем теле определить статический метод, который будет возвращать экземпляр своего класса – фабричный метод.

//Сериализация
//
//Класс, чьи объекты нужно клонировать, может использовать механизм сериализации.

//Интерфейс Cloneable
//
//Класс, чьи объекты нужно клонировать, должен переопределить метод clone() класса Object и реализовать интерфейс Cloneable. Интерфейс Cloneable помечает класс как доступный для клонирования. Без этого интерфейса попытка клонировать объект класса приведет к генерации исключения.

//Наиболее удобным и гибким способом клонирования является механизм сериализации – он уже реализован в Java и пользователю не нужно самому его определять, а самым безопасным – фабричный метод.

//Несмотря на разные способы клонирования, в них применяется один из двух видов этого процесса:
//
//Поверхностное клонирование – уже реализовано самой Java.Реализация процесса клонирования описывается в методе clone(), унаследованном от класса Object.
//Синтаксис:
//protected Object clone() throws CloneNotSupportedException {       }
//Для корректной реализации процесса клонирования необходимо удовлетворять следующие требования (для любого существующего объекта х):
//
//Выражение x.clone() != х должно генерировать true. Другими словами, ссылки на исходный объект и его клон должны отличаться.
//Выражение x.clone().getClass() == x.getClass() должно генерировать true. Другими словами, тип исходного объекта и клона должен быть одним и тем же.
//Вне всякого сомнения x.clone().equals(x) должно генерировать true. Другими словами, сравнив исходный объект и его клон, вы должны получить информацию об их идентичности.
//В языке Java уже реализовано поверхностное клонирование/копирование в методе класса Object - клонирование заключается в получении копий полей, то есть:
//
//если поля примитивных типов, то получим независимую новую копию
//если есть ссылочные поля, то такие поля будут разделяться исходным объектом и его клоном (получаем не независимую копию).


//Глубокое клонирование – обязан реализовать разработчик.


import java.util.Date;
//Опишем класс Student с ссылочным полем типа Date (из пакета java.util) год набора yearSet и полем примитивного типа int группа group.

public class Student {
    private Date yearSet;
    private int group;

    public Student(Date year, int group) {
        this.yearSet = year;
        this.group = group;
    }
    //Переопределим метод toString() для получения описания объекта в виде текста.
    public String toString() {
        return "year = " + yearSet + ", group = " + group;
    }
    //Переопределим метод clone(), унаследованный от класса Object, просто вызвав метод clone() суперкласса.
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
