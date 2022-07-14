package abstractСlasses.mainExample;

public abstract class Person {//обект етого класса с помощю опеатора new создать невозможно. Описание сущности которое не может быть создано в реальности. С пом. абстрактного класса можна выделить некоторые общие свойства каких то различных груп сущностей из одной предметной области
    private int personalId;// нет абстрактных методов поведения а только
    private String lastname;

    public Person(int personalId, String lastname) {
        this.personalId = personalId;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        final  StringBuilder sb = new StringBuilder("{");
        sb.append("personId = ").append(personalId);
        sb.append(", lastName = '").append(lastname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
