package oop_6.polymorphisms.methodsOverload.point;
//не использовать перегрузку с одинаковым числом параметров, не использовать сложных вариантов перегрузки, по возможности перегрузку заменять различными методами

public class LearnMainOverload {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        point.method();//вызов перегруженных методов
        point.method(42);
        point.method(101.1);
        Point2D.method("Java");

    }
}
//WITHOUT
//int42
//double101.1
//String Java