package oop_6.objectClass.hashCode.student;

public class Demo9 {
    public static void main(String[] arg) {
        Student1 stud1 = new Student1("Peter", 5558956L, 20);
        Student1 stud2 = new Student1("Ivan", 9876543L, 18);//обекты идентичны, хеш коды совпадают
        Student1 stud3 = new Student1("Dasha", 5558956L, 20);
        Student1 stud4 = new Student1("Ivan", 9876543L, 18);
        System.out.println(stud1.hashCode());
        System.out.println(stud2.hashCode());
        System.out.println(stud3.hashCode());
        System.out.println(stud4.hashCode());
    }
}
//1160475683
//
//-1786389060
//
//-1015000986
//
//-1786389060