package all_java.base;

public class Main {
    public static void main(String[] args) {
        Base object = new SubClass();
        object.print();
    }
}
//SubClass

//Correct:При вызове метода в данном случае будет использоваться механизм позднего связывания. Поэтому будет вызван метод не на основе типа ссылочной переменной, а на конкретном объекте, т.е будет вызван метод класса В.