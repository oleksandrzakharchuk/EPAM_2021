package objectCloning_7.clonableEx.cat_ex;

public class Main {
    public static void main(String[] arg) throws Exception {
        Cat cat = new Cat(5, "Chita");
        //Cat copyCat = (Cat) cat.clone();
        // System.out.println(copyCat);
    }
}
//ошибка компиляции
//Метод clone() помечен как protected и не может быть вызван явно вне класса. Для корректной работы механизма клонирования необходимо переопределить метод clone() и внутри его реализации сделать вызов super.clone().