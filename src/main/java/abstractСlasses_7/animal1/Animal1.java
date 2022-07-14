package abstractСlasses_7.animal1;

public abstract class Animal1 {
    public abstract void move();//абстрактный метод
}

abstract class Reptiles extends Animal1 {   }//абстрактный класс

class Boa extends Reptiles {
    @Override
    public void move() {
        System.out.println("Boa move");//реализация метода
    }
}

