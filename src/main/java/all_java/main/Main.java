package all_java.main;

public class Main {
    static void doJob(Integer num) {
        System.out.println("Integer");
    }
    static void doJob(Object obj) {
        System.out.println("Object");
    }
    static void doJob(int number) {
        System.out.println("int");
    }
    public static void main(String[] args) {
        Object object = 10;			//Line1
        doJob(object);
    }
}
//Object

//Correct:В строке //Line1 ошибки не будет, так как сработает автоупаковка числа в объект типа Integer. Ссылка на него связывается с супертипом Object. Затем произойдет разрешение перегрузки на 2-м шаге этого процесса.