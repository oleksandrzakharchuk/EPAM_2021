package objectCloning_7.DeepObjectCloning;
//лубокое копирование (клонирование) — означает разыменование ссылочного поля: вместо копии ссылки на объект, создается новая копия объекта ссылочного типа. На следующем рисунке показано глубокое клонирование объекта c, который описывается ссылочными полями a и b. img_7.png

//В результате ссылочные объекты в c независимы от таких же ссылок в объекте c’(copy). Однако, глубокие копии дороже из-за необходимости создавать дополнительные объекты и могут быть более сложными из-за множественных ссылок.

//Рассмотрим пример глубокого клонирования на том же классе Student, изменив только реализацию метода clone():


import java.util.Date;

public class Student implements Cloneable {
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
        Student stud = (Student) super.clone();//Сначала выполним поверхностное клонирование, чтобы получить новый объект.

        stud.yearSet = (Date) this.yearSet.clone();//Затем выполним клонирование поля yearSet и перезапишем полученную копию в поле yearSet нового объекта.
        return stud;
    }
}
