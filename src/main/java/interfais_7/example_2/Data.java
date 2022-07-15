package interfais_7.example_2;

public interface Data {
    default void print(String str) {
        if ( !isNull(str) ) {
            System.out.println("Data: " + str);
        }
    }
    static boolean isNull(String str) {
        return str == null ? true : "".equals(str.trim()) ? true : false;
    }
}
