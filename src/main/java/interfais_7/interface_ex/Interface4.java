package interfais_7.interface_ex;

public interface Interface4 {
    static boolean isNull(String str) {
        System.out.println("Static method of checking for null");
        return str == null ? true : "".equals(str.trim()) ? true : false;
    }
    default void log(String str) {
        System.err.println("The default method. Logging: " + str);
    }
    void method(int data, String str);
}
class  Main{
    public static void main(String[] args) {
        System.out.println();
    }
}
