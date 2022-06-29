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

public class Triangle3 {
    private static int Area;

    public static void main(String[] args) {

        Point22 A = new Point22(0, 0);
        Point22 B = new Point22(1, 0);
        Point22 C = new Point22(2, 0);
        System.out.println("formula 4:" + Triangle.triangleExists(A, B, C));
        //Exists area/degenerate = 0.0 Exception in thread "main" java.lang.IllegalArgumentException:
        //Three points o lie on a line. The area formed by the triangle of these three points is zero.

        Point22 A1 = new Point22(0, 0);
        Point22 B1 = new Point22(3, 0);
        Point22 C1 = new Point22(0, 4);
        System.out.println("area of triangle using formula 1: " + Triangle.area(A1, B1, C1));
        //area of triangle using formula 1: 6.0

        Point22 A2 = new Point22(0, 0);
        Point22 B2 = new Point22(3, 0);
        Point22 C2 = new Point22(0, 3);
        System.out.println("formula 3 :" + Triangle.centroid(A2, B2, C2));
        //Point centroid() (X1,Y1) = (1.0,1.0)

        if (Area == 0) {
            throw new IllegalArgumentException("\nThree points o lie on a line. The area formed by the triangle of these three points is zero.\n");
        } else
            System.out.println(" The area formed by the triangle of these three points is not zero. The triangle exists.");
    }
}

class Point22 {
    int x;
    int y;

    public Point22(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Triangle {

    /**
     * formula 1:
     * Java method to return area of triangle using vertices as per following * formula area = (Ax(By -Cy) + Bx(Cy -Ay) + Cx(Ay - By))/2 * * @return
     */
    public static float area(Point22 A, Point22 B, Point22 C) {
        float area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
        return Math.abs(area);
    }

    /**
     * formula 3:
     * * @(A.x + B.x + C.x) / 3.0
     */
    public static float centroid(Point22 A, Point22 B, Point22 C) {
        double CX1 = (A.x + B.x + C.x) / 3.0f;
        double CY1 = (A.y + B.y + C.y) / 3.0f;
        System.out.println("Point centroid() (X1,Y1) = (" + CX1 + "," + CY1 + ")");
        return 0;

    }

    /**
     * formula 4:
     * *   // Java program Calculation the area of triangle that is, the triangle exists and is not degenerate. Area = x1 * (y2 - y3) +
     * x2 * (y3 - y1) +
     * x3 * (y1 - y2);
     */
    public static float triangleExists(Point22 A, Point22 B, Point22 C) {
        double ExistsArea = A.x * (B.y - C.y) +
                B.x * (C.y - A.y) +
                C.x * (A.y - B.y);
        System.out.println("Exists area/degenerate = " + ExistsArea);
        return 0;
    }

}


