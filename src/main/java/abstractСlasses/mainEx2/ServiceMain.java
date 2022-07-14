package abstractСlasses.mainEx2;

public class ServiceMain {
    public static void main(String[] args) {
       BaseService service = new UpperServise();
       String string = "java16";
        System.out.println(service.change(string));

        service = new CutService();
        System.out.println(service.change(string));

    }
}
