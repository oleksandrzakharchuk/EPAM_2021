package oop_6.objectClass.hashCode.student;

import java.util.Objects;

public class Student1 {
    private String name;
    private long phone;
    private int age;

    public Student1(String peter, long l, int i) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return phone == student1.phone && age == student1.age && Objects.equals(name, student1.name);
    }

    // …
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        result = 31 * result + age;
        return result;
    }
}
