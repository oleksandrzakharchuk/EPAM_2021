package abstractСlasses.animal;
//класс Animal описывается как абстрактный суперкласс с абстрактным методом move(). Затем описывается класс Reptiles как его подкласс без какого-либо кода. В итоге получаем ошибку компиляции, так как класс Reptiles унаследовал абстрактный метод move() и не предоставил его реализацию. Это значит, что и он должен быть явно объявлен как абстрактный.

public abstract class Animal {
    /*public abstract void move();
}

class Reptiles extends Animal {//подкласс должен обемпечить реализацию метода move() и быть абстрактным

}
*/
    public abstract void move();
}

abstract class Reptiles extends Animal {// подкласс обявлен абстрактным
}