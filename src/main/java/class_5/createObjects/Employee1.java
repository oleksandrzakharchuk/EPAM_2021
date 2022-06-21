package class_5.createObjects;

public class Employee1 {
    String name;
    int age;
    public Employee1(String newName, int newAge)  {
        name = newName;
        age = newAge;
    }
}
class Main1 {
    public static void main(String[] args) {
        Employee1 e =  new Employee1("Alex", 30);
        System.out.println(e.name);
    }
}
