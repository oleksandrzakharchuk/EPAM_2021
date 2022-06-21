package class_5.methods;

import java.util.Locale;

public class StudentStaticMethod {
    static String faculty;
    private long studentId;
    private String name = "";
    private int yearOfStudy;

    public StudentStaticMethod(long studentId){
        this.studentId = studentId;
    }
    public static void convertFaculty(String head){

        System.out.println(head + "    " + faculty.toLowerCase(Locale.ROOT));//обращение к статическому полю faculty

       //обращение к нестатическим полям НЕМОЖЕТ
        //studentId --> Error

        //не имеет доступа к ссылке this
        //this.name;-->Error

    }
}
