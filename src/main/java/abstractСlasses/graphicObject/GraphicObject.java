package abstractСlasses.graphicObject;
//описан абстрактный суперкласс GraphicObject с двумя полями x и y, абстрактным методом рисования фигуры draw() и методом перемещения фигуры с реализацией moveTo(). Далее описан его подкласс Circle, в котором приведена пустая реализация метода draw(). А значит, класс не абстрактный и можно создавать его объекты. В классе Runner создается ссылка типа GraphicObject, которая инициализируется объектом типа Circle. На этом объекте вызывается метод draw(). Все работает корректно.

public abstract class GraphicObject {
    public abstract void draw();
    public void moveTo(int x, int y) {    }
}

