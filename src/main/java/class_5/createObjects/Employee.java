package class_5.createObjects;

public class Employee {
    String name;
    int age;
    public Employee()  {}
}
class Main {
    public static void main(String[] args) {
        Employee e =  new Employee();
        System.out.println(e.name);//null
    }
}
