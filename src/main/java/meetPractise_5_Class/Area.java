package meetPractise_5_Class;

public class Area {

    // Function to check if three points make a triangle
    static void checkTriangle(int x1, int y1,
                              int x2, int y2,
                              int x3, int y3) {

        // Calculation the area of triangle. We have skipped  multiplication with 0.5 to avoid floating point  computations
        int a = x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2);

        // Condition to check if area is not equal to 0
        System.out.println("Area of triangle = " + a + ";");
        if (a == 0) {
            throw new IllegalArgumentException("\nThree points o lie on a line. The area formed by the triangle of these three points is zero.\n");

        } else

            System.out.println(" The area formed by the triangle of these three points is not zero");
    }
    class GFG
    {

        // Driver code
        public  void main(String args[])
        {
            // coordinate of the vertices
           float x1 = 1, x2 = 3, x3 = 6;
           float y1 = 2, y2 = -4, y3 = -7;

            // Formula to calculate centroid
           float x = (x1 + x2 + x3) / 3;
            float y = (y1 + y2 + y3) / 3;

            //System.out.print(setprecision(3));
            System.out.println("Centroid = "
                    + "(" + x + ", " + y + ")");
        }
    }

    // Driver code  x1 = 1, y1 = 1,
    //                x2 = 2, y2 = 2,
    //                x3 = 3, y3 = 3;
    public static void main(String[] args)
    {
        int     x1 = 1, y1 = 1,
                x2 = 2, y2 = 2,
                x3 = 3, y3 = 3;
        checkTriangle(x1, y1, x2, y2, x3, y3);
    }
}


