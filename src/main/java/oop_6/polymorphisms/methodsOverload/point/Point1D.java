package oop_6.polymorphisms.methodsOverload.point;

public class Point1D {
    private int x;

    public int getX() {
        return x;
    }
    public  void  setX(int x){this.x = x;}
    public double length(){
        return  Math.abs(x);
    }
public  void method(double value){
    System.out.println(" double " + value);
}
}

