package all_java.boy;

public class Boy {
    private int age = 19;
    private String name = "Michael";

    public static void main(String[] args) {
        Boy b = new Boy();
        b.toString();
    }
    public String toString() {
        return name + " is " + age + " years old";
    }
}
//Ничего не напечатается
// Ничего не будет выведено на консоль, так как отсутствует оператор System.out.print(b) или System.out.print(b.toString()), что собственно одно и тоже.