package all_java.line;

public class A {
    static class B extends A {
    }

    static class C extends B {
    }

    static class Main {
        public static void main(String[] args) {
            //A obj = new B();
           // A obj = new C();
           // B obj = new C();

        }
    }
}
//Ссылке на суперкласс можно присвоить объект подкласса. В то время, как ссылке на дочерний класс присвоить объект родительского класса возможно только с использованием явного приведения типов.