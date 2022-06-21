package class_5.finalUsing;

//public final class Point
public class Point {
    // private final int MAX_RANGE = 1 000;
    final StringBuilder builder = new StringBuilder();
    private int x;

    public  Point (int x){
        this.x = x;
        builder.append("hello");
    }
    // final method
    final int length(){//final этого метода указывает, что в подклассе переопределить метод будет невозможно --> на запрет переопределениe
        //public final class and public final method писать безсмысленно (двойной запрет выполнить одно и тоже действие)

        return Math.abs(x);
    }
}
