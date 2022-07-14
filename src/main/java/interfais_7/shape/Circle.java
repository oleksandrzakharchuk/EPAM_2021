package interfais_7.shape;

public class Circle implements Shape {
    double radius;

    Circle(double x) {
        radius = x;
    }


    public double getSquare() {//реализация метода. метод getSquare() переопределяется – получает тело.
        return PI * radius * radius;//тело
    }
}
