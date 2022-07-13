package oop_6.objectClass.hashCode;

import java.awt.*;

public class Demo8 {
    public static void main(String[] arg) {
        Point point1 = new Point(5, -5);//одна и таже ссылка, один и тот же хеш=код
        Point point2 = point1;
        //Point point2 = new Point(1,2);
        Point point3 = new Point(5, -5);
        Point point4 = new Point(5, 5);
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        System.out.println(point3.hashCode());//объект идентичен с предшествующим, а хеш-код другой ?
        System.out.println(point4.hashCode());
    }
}

//41418752
//41418752
//41418752
//-2106064896