package meetPractise_5_Class;

import java.util.Scanner;

public class CalculateCentroidAreaOfTriangle<A> {

    public static void main(String[] args) {
        class Point {

            private final double x;
            private final double y;

            public Point(double x, double y) {
                this.x = x;
                this.y = y;
            }


            public double getX() {
                return x;
            }

            public double getY() {
                return y;
            }


            @Override
            public String toString() {
                return ("(" + x + "," + y + ")");
            }
        }
        //Scanner in = new Scanner(System.in);
        // Java program to find the centroid of triangle
        double X1 = 3, Y1 = 4, X2 = 0, Y2 = 0, X3 = 0, Y3 = 0;
        double CX1 = (X1 + X2 + X3) / 3;
        double CY1 = (Y1 + Y2 + Y3) / 3;

        System.out.println("Point centroid() (X1,Y1) = (" + CX1 + "," + CY1 + ")");//Centroid(G) (X1,Y1) = (1.0,1.3333333333333333)

        // Java program Calculation the area of triangle that is, the triangle exists and is not degenerate.
        double x1 = 3, y1 = 4, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
        double Area = x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2);
        if (Area == 0) {
            throw new IllegalArgumentException("\nThree points o lie on a line. The area formed by the triangle of these three points is zero.\n");
        } else
            System.out.println(" The area formed by the triangle of these three points is not zero. The triangle exists.");

    }


}







