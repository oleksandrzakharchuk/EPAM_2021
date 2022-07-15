package objectCloning_7.clon_ex;

import java.util.Date;
//В классе Main создадим объект типа Date: для этого воспользуемся статическим методом currentTimeMillis() класса System. Затем создадим объект stud1 класса Student и отобразим его.

public class Main {
    public static void main(String[] arg) throws Exception {
        Date dd = new Date(System.currentTimeMillis());
        Student stud1 = new Student(dd, 201);
        System.out.println(stud1);
        //Создадим клон объекта stud1 и отобразим его.
        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);
    }

}
//year = Fri Jul 15 11:51:27 EEST 2022, group = 201
//Exception in thread "main" java.lang.CloneNotSupportedException: objectCloning_7.clon_ex.Student
//В результате исполнения этой программы получили ошибку CloneNotSupportedException.
// Это произошло, потому что недостаточно переопределить метод clone(). Нужно еще указать, что такой процесс возможен.
//Класс должен еще и реализовать интерфейс Cloneable.