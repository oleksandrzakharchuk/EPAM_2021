package oop_6.polymorphisms.lateBinding;


public class FindAreas {
    public static void main(String[] args) {

        Figure f = new Figure(10.0, 5.0);//Класс FindAreas создает три объекта. По одному для классов Figure, Rectangle и Triangle.
        Rectangle r = new Rectangle(9.0, 5.0);
        Triangle t = new Triangle(10.0, 8.0);
        Figure figref;//создает ссылку типа Figure – figref.

        figref = r;
        System.out.println(figref.area()); // Эта ссылка поочередно связывается с созданными объектами, и на ней вызывается метод area().
        figref = t;
        System.out.println(figref.area());
        figref = f;
        System.out.println(figref.area());
    }

}
//Площадь прямоугольника 45.0
//Площадь треугольника 40.0
//Площадь фигуры не определена 0.0

//синтаксис вызова метода одинаковый в трех случаях (figref.area()), а результат разный. Это происходит потому, что выбор варианта выполнения метода осуществляется во время исполнения программы и зависит от типа объекта, а не от типа ссылки на объект. В трех случаях объекты разные, поэтому выполняется разная реализация метода area().