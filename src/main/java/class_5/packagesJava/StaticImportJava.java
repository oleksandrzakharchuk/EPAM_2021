package class_5.packagesJava;

//В Java имеется языковое средство, расширяющее возможности ключевого слова import. Оно называется статическим импортом. Для этого вместе с директивой import используется модификатор static.

public class StaticImportJava {
    //обращение к статическому методу и константе .
    //
    // При вызове статических методов и обращении к статическим константам приходится использовать в качестве префикса имя класса, что утяжеляет код и снижает скорость его восприятия.
    public static void main(String[ ] args) {
        System.out.println(2 * Math.PI * 3);
        System.out.println(Math.floor(Math.cos(Math.PI / 3)));
    }
}
