package all_java.a;

public class B extends A {
    public void job() {
        System.out.println("Class B");
    }

    public static void main(String[] args) {
        A b = new B();
        b.job();
    }
}
//Class B
// Всегда вызывается ближайший полиморфный метод к объекту, а не к типу ссылки.