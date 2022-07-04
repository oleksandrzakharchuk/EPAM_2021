package oop_6.polymorphisms.point;

public class Point2D extends Point1D {//точка на плоскости
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override//переопределим метод length(). Метод в классе имеет ту же самую сигнатуру что и метод в суперклассе но выполняет несколько другие действия.

    // В данном случае нам необходимо посчитать длинну от начала координат до конкретной точки
    public double length() {// оставляем область видимости public. При попытке снижения области видимости будет получена ошибка компиляции.
        return Math.hypot(y, getX());
    }
}
