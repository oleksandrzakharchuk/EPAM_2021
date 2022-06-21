package class_5;
//Определяя класс, вы объявляете его конкретную форму и поведение. Для этого указываются содержащиеся в нем поля, а также методы оперирования этими полями. Самые простые классы могут содержать либо только методы, либо только поля. Но большинство настоящих классов содержат и то и другое.
//Модификатор_Класса устанавливает правила использования класса (область видимости).
//Идентификатор – имя класса (то есть тип данных).
//Параметры_Типа определяют обобщенность используемых данных класса.
//Супер_Класс определяет родителя этого класса.
//Супер_Интерфейсы определяют дополнительное поведение класса.
//Тело_класса определяет поля и методы класса.

//Правильно сконструированный класс должен определять одну и только одну логическую сущность.
//в правильно сконструированном классе должна быть сгруппирована логически связанная информация. Если в один и тот же класс помещается логически не связанная информация, то структурированность кода быстро нарушается.

import java.util.Objects;
//что хранит класс информационный эксперт:

public class Subject_Inform_Expert {
    private long subjectId;
    private String name;

    public Subject_Inform_Expert(long subjectId, String name) {
        this.subjectId = subjectId;
        this.name = name;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject_Inform_Expert subject = (Subject_Inform_Expert) o;
        return subjectId == subject.subjectId && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectId, name);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", name='" + name + '\'' +
                '}';
    }
}
