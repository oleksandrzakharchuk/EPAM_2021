package all_java.aa;

public class B extends AA {
    public void job(int i) {
        System.out.println("Class B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.job();
    }
}
//Class A Версия перегруженного метода всегда определяется на этапе компиляции кода и не может быть заменена в процессе выполнения.