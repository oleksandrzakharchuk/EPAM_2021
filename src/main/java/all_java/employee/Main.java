package all_java.employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(5);
    }
}
//Good night employee!

//Correct:Поскольку при вызове конструктора его аргумент является литералом типа int, а в описании класса Employee нет конструктора с параметром типа int, то Java неявно может выполнить только расширяющее приведение аргумента. В результате подойдет для выполнения конструктор с параметром типа long и строка "Good night employee!" будет выведена в консоль.