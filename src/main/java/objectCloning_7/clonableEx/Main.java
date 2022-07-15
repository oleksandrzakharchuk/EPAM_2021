package objectCloning_7.clonableEx;

import java.util.Date;

public class Main {
    public static void main(String[] arg) throws Exception {
        Date dd = new Date(System.currentTimeMillis());
        Student stud1 = new Student(dd, 201);
        System.out.println(stud1);
        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);
    }
}
//В результате клонирование проходит успешно и два объекта имеют одинаковое представление:
//year = Fri Jul 15 12:10:37 EEST 2022, group = 201
//year = Fri Jul 15 12:10:37 EEST 2022, group = 201

//Как же хранятся в памяти эти два объекта? Будет два объекта типа Student, однако оба они будут ссылаться на один и тот же объект типа Date, потому что при поверхностном клонировании была скопирована ссылка, а не сам объект даты. img_6.png
//Поверхностные копии просты и дешевы и, как правило, могут быть реализованы путем простого копирования битов.