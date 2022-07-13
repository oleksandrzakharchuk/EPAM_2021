package oop_6.polymorphisms.methodsOverload.point;
//перегрузка называеться статическим полтморфизмом так как версия метода определяеться на етапе компиляции. Обычный метод может быть перегружен и статическим. Перегруженный метод может находиться и в подклассе.

public class Point2D extends Point1D {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public double length() {
        return Math.hypot(y, getX());
    }

    public void method() {
        System.out.println(" WITHOUT ");
    }
        public void method ( int value){
            System.out.println(" int " + value);
        }
        public static void method (String str){
            System.out.println(" String " +str );
        }

    }
