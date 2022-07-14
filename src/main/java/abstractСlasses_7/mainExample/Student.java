package abstractСlasses_7.mainExample;

public class Student extends Person {//наследование сущности возможно так как у супер класса есть поля. Нас интересует наследование свойств и расширение типов.

    private double averageMark;//средняя оценка

    public Student(int personalId, String lastname, double averageMark) {
        super(personalId, lastname);
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append(super.toString()).append(" averageMark = ").append(averageMark);
        sb.append('}');
        return sb.toString();
    }
}
