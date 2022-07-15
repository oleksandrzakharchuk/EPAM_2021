package objectCloning_7.DeepObjectCloning;

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
//year = Fri Jul 15 12:28:06 EEST 2022, group = 201
//year = Fri Jul 15 12:28:06 EEST 2022, group = 201

//представить хранение объектов в памяти --> img_8.png (README.md)
