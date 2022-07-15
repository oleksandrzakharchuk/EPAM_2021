package objectCloning_7.clonableEx;
//Поверхностное клонирование с интерфейсом Clonable

//Интерфейс Cloneable не содержит абстрактных методов. Он используется как интерфейс-маркер, чтобы указать системе на возможность клонирования объектов некоторого класса.

import java.util.Date;

public class Student implements Cloneable {
    //Добавим к описанию класса Student реализацию интерфейса Cloneable.
    private Date yearSet;
    private int group;
    public Student(Date year, int group) {
        this.yearSet = year;
        this.group = group;
    }
    public String toString() {
        return "year = " + yearSet + ", group = " + group;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
