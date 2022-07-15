package objectCloning_7.clonableEx.cat_ex;

public class Cat implements Cloneable  {
    private int age;
    private String name;
    public Cat(int year, String name) {
        this.age = year;
        this.name = name;
    }
    public String toString() {
        return "Age = " + age + ", name = " + name;
    }
}
