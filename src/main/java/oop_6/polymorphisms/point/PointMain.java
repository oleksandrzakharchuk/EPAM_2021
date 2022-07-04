package oop_6.polymorphisms.point;

public class PointMain {
    public static void main(String[] args) {
        Point1D point1 = new Point1D();//на ссылке Point1D
        point1.setX(3);// назначить X=3.
        System.out.println(point1.length());// вызвать метод который вычисляет длинну. Возврат 3

        Point1D point2 = new Point2D();//особенность на ссылке Point1D обект point2 но проинициализировать как Point2D
        point2.setX(3);
        ((Point2D) point2).setY(4);// 3 в квадрате плюс 4 в квадрате = 9+16=25. Корень квадратный из 25 = 5
        System.out.println(point2.length());//  на point2 вызвать метод length(). Вивод 5

        // ссылка на Point1D но результаты разные.  полиморфный метод всегда вызываеться ближайший метод т.е new Point2D(). И соответственно
    }
}
//Именно благодаря полиморфизму программисты могут создавать приложения, которые смогут работать в будущем с объектами, которых нет на этапе разработки.
