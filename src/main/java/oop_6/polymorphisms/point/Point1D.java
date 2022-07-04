package oop_6.polymorphisms.point;

public class Point1D {//определяет расстояние от нуля до точки на прямой
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public double length(){// при наследовании при  переопределении метода у исходного метода стоит спецификатор public. Понижать область видимости для подкласса нельзя
        return Math.abs(x);
    }
}
