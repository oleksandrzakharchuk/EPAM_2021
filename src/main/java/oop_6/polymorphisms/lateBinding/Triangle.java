package oop_6.polymorphisms.lateBinding;

public class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {//Подклассы Rectangle и Triangle переопределяют метод area() для вычисления свой площади. Конструкторы этих классов передают свои размерности для хранения в поля dim1 и dim2: Triangle – длину основания и высоту.
        System.out.print("Площадь треугольника ");
        return dim1 * dim2 / 2;
    }
}
