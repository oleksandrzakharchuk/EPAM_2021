package class_5.classConstructor.Subject;

public class Employee {
    String name;
    int age;
    public Employee(String newName, int newAge)  {
        name = newName;
        age = newAge;
    }
}
//public class Main {
    //public static void main(String[] args) {
        // Employee e =  new Employee();
       // System.out.println(e.name);
    //}
//}
//В методе main() производится обращение к конструктору без параметров класса Employee. А в классе объявлен конструктор с парамерами. Компилятор не находит конструктора без параметров и выдает ошибку. Ошибки бы не возникло, если бы у класса вообще не было объявлено конструкторов. В этом случае компилятор создал бы конструктор по умолчанию без параметров.