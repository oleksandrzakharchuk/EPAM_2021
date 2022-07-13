package oop_6.objectClass.hashCode.student;

import java.util.Objects;

import static java.util.Objects.hash;

/*
public class Student {
    private int id;
    private String name = "";
    private int yearOfStudy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (yearOfStudy != student.yearOfStudy) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;//пускай result = id
        result = 31 * result + (name != null ? name.hashCode() : 0);// 31*result + значение хеш кода для name (опасаемся что name=0, если так то хеш-код=0, если нет у класа String есть метод хеш-код и мы его вызываем)
        result = 31 * result + yearOfStudy;// этот же результа мы ещк раз умножаем на 31 и добавляем год обучения
        return result;
        //return  42;// может быть такой хеш-код или нет? Правилам не противоречит, а конвенции да. Запись коректна но использовать запрещаеться.
    }
}



*/
