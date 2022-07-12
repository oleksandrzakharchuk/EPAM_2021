package oop_6.polymorphisms.lateBinding;

public class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {//Подклассы Rectangle и Triangle переопределяют метод area() для вычисления свой площади. Конструкторы этих классов передают свои размерности для хранения в поля dim1 и dim2: Rectangle — ширину и высоту,
        System.out.print("Площадь прямоугольника ");
        return dim1 * dim2;
    }
}
