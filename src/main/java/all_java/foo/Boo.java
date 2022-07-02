package all_java.foo;

public class Boo {
    public static void main(String[] args) {
        fooMaxChange();
    }

    static void fooMaxChange() {
        // Foo.FOO_MAX *= 2;// illegal start of expression
        System.out.print(Foo.FOO_MAX);
    }
}
