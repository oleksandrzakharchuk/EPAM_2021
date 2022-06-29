package meetPractise_5_Class;

public class Point1 {

    private final double x;
    private final double y;

    public Point1(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Main1 {
    public static void main(String[] args) {
        //{
           /* double area = new Triangle(new Point1(0, 0), new Point1(3, 0), new Point1(0, 4)).area();
            System.out.println(area);
        }*/
        {
            Point centroid = new Triangle(new Point1(0, 0), new Point1(3, 0), new Point1(0, 3)).centroid();

            System.out.println(centroid.getX());
            System.out.println(centroid.getY());
        }
    }

    static class Triangle {
        private static Point1 a;
        private static Point1 c;
        private static Point1 b;


        double length1, length2, length3;

        public Triangle(Point1 point1, Point1 point11, Point1 point12) {


            if (((length1 + length2) <= length3) || ((length1 + length3) <= length2) || ((length2 + length3) <= length1)) {
                throw new IllegalArgumentException("Triangle is degenerative");
            }
        }


        public Point centroid() {
            double xc = (((a.getX() + b.getX() + c.getX()) / 3));
            double yc = (((a.getY() + b.getY() + c.getY()) / 3));
            return new Point(xc, yc);
        }

        public double area() {
            length1();
            length2();
            length3();
            double s = (length1 + length2 + length3) / 2;

            System.out.println("area" + Math.sqrt(s * (s - length1) * (s - length2) * (s - length3)));


            return s;
        }

        private void length3() {
            double xDistanceSquare = Math.pow(c.getX() - b.getX(), 2.0);
            double yDistanceSquare = Math.pow(c.getY() - b.getY(), 2.0);

            System.out.println("length3 = " + Math.sqrt(xDistanceSquare + yDistanceSquare));

        }


        private static void length2() {
            double xDistanceSquare = Math.pow(a.getX() - c.getX(), 2.0);
            double yDistanceSquare = Math.pow(a.getY() - c.getY(), 2.0);

            System.out.println(Math.sqrt(Double.parseDouble("length2 = " + xDistanceSquare + yDistanceSquare)));
        }



        private static void length1() {
            double xDistanceSquare = Math.pow(a.getX() - b.getX(), 2.0);
            double yDistanceSquare = Math.pow(a.getY() - b.getY(), 2.0);

            System.out.println("length1 = " + Math.sqrt(xDistanceSquare + yDistanceSquare));
        }
        }
    }



