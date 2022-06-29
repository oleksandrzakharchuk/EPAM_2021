package meetPractise_5_Class;

//Реализуйте методы класса Triangle:
//
//Конструктор, имеющий в качестве параметров координаты трех вершин.
//Убедитесь, что эти точки относятся к вершинам треугольника.
//Проверьте, что созданный треугольник существует и не является вырожденным.
//Если это не так, используйте throw new IllegalArgumentException(), чтобы вызвать ошибку.
//double area() – возвращает площадь треугольника.
//Point centroid() – возвращает центроид треугольника.
//Класс Point уже существует.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle_3 {
//проверка, что созданный треугольник существует и не является вырожденным.
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int b = Integer.parseInt(a);
        String c = reader.readLine();
        int d = Integer.parseInt(c);
        String h = reader.readLine();
        int t = Integer.parseInt(h);
        triangle(b, d, t);

    }

    public static void triangle(int m, int n, int u) {
        if (m + n >= u) {
            if (n + u >= m)
                if (m + u >= n)
                    System.out.println("The triangle exists.");
        } else {
            throw new IllegalArgumentException("The triangle doesn't exist.");

        }
    }
}







