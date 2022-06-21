package class_5.learnStatic;

public class LearnMainStatic {
    public static void main(String[] args) {
        Student student1 = new Student(42);
        Student student2 = new Student(77);
        Student.faculty="MMF";
        student1 = null;//ожидаеться Null Pointer Exeption но компилятор вместо имени обекта будет стоять имя класса
        student1.faculty = "GEO";//плохая практика. Так делать не следует. Static member 'class_5.LearnStatic.Student.faculty' accessed via instance reference (доступ через ссылку на экземпляр )
        System.out.println(student1.faculty);//GEO т.е через ссылку на null у нас есть прямой доступ к статическому полю класса.
    }
}
// student1 = null;
// student1.faculty = "GEO"; --> плохой код, использовать не рекомендуеться