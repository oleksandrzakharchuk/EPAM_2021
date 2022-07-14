package interfais_7.movable;

 interface Movable {
    void move();
}
class Person implements Movable {
    public void move() {   System.out.println("Person move");   }
}
class Vehicle implements Movable {
    public void move() {   System.out.println("Vehicle move");   }
}
class Test {
    // INSERT CODE HERE
   // void walk(Vehicle movable) {
   //void walk(Person movable) {
    void walk(Movable movable) {
        movable.move();
}
}
