package meetPractise_5_Class;
//Реализуйте методы класса Segment (отрезок):
//
//Конструктор, в который в качестве параметров передаются координаты точек начала и конца отрезка.
//Убедитесь, что созданный отрезок существует и не является вырожденным, что означает, что начало и конец отрезка не являются одной и той же точкой.
//Если это не так, используйте throw new IllegalArgumentException(), чтобы вызвать ошибку.
//int length() – возвращает длину сегмента.
//Point middle() – возвращает среднюю точку сегмента.
//Point intersection(Segment another) – возвращает точку пересечения текущего отрезка с другим.
//Возвращает null, если такой точки нет.
//Возвращает null, если сегменты коллинеарны.
//Обратите внимание, что точка пересечения должна лежать на обоих сегментах.
//Класс Point уже существует.

import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Scanner;


class Point {
    private int x;
    private int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Segment {

    private Point start;
    private Point end;


    public Segment(Point start, Point end) {
        if (start == null || end == null)
            throw new IllegalArgumentException("Arguments can't be null");
        if (start.equals(end))
            throw new IllegalArgumentException("The points must differ");
        this.start = start;
        this.end = end;
    }

    int length() {
        int xDistanceSquare = (int) Math.pow(start.getX() - end.getX(), 2);
        int yDistanceSquare = (int) Math.pow(start.getY() - end.getY(), 2);
        return (int) Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    Point middle() {
        return new Point((start.getX() + end.getX()) / 2,
                (start.getY() + end.getY()) / 2);
    }
    Point intersection(Segment another) {

        int m1 = 1 ;
        int m2 = 2;
        int b1 = -1;
        int b2 = 3;

        int x = (b2 - b1)/(m1 - m2);
        int y = m1 * x + b1;  // or m2 * x + b2
        //double x = 5; // Это просто пример, чтоб компилятор не ругался
        //double y = 25;

        // И верните точку с этими координатами
        return new Point(x, y);

    }

}


class Main11 {
    public static void main(String[] args) {

        {
            double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
            System.out.println("length : " +length);
        }

        {
            Segment first = new Segment(new Point(0, 0), new Point(4, 4));
            Segment second = new Segment(new Point(2, 0), new Point(0, 2));
            Point intersection = first.intersection(second);

            System.out.println("getX()= " + intersection.getX());
            System.out.println("getY() = " +intersection.getY());
        }
        Segment sequent = new Segment(new Point(2, 0), new Point(0, 2));
        Point midpoint = sequent.middle();

        System.out.println("midpoint getX(): " + midpoint.getX());
        System.out.println("midpoint getY(): " + midpoint.getY());
        {

            Segment first = new Segment(new Point(0, 0), new Point(4, 0));
            Segment second = new Segment(new Point(2, 1), new Point(1, 2));
            Point intersection = first.intersection(second);

            System.out.println( intersection == null);

        }
    }
}
//length : 5.0
//getX()= -4
//getY() = -5
//midpoint getX(): 1
//midpoint getY(): 1
//false