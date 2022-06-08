package all_java.api.Array_4.Array_4_forAndForEach;

public class ArrayString {
    public static void main(String[] args) {
        String[] strings = {"Java", "Oracle", "<epam>"};
        //добавим каждому елементу значение
        // for (String elem: strings) {
        //   elem +=11;//переназначить значение ссілки невозможно
        //}
        for (int i = 0; i < strings.length; i++) {
            strings[i] +=11;//Java11 Oracle11 <epam>11
        }
        for (String elem : strings) {
            System.out.println(elem + " ");//Java Oracle <epam>
        }
       /* StringBuilder stringBuilders = new StringBuilder(3);
        stringBuilders[0] = new StringBuilder("Java");
        stringBuilders[1] = new StringBuilder("Oracle");
        stringBuilders[2] = new StringBuilder("<epam>");

        for (StringBuilder elem : stringBuilders) {
            System.out.println(elem);*/
    }

}
//}
