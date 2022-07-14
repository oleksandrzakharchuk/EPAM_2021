package abstractСlasses_7.graphicObject;

public class Runner {
    public static void main(String[] args) {
        GraphicObject mng;
        // mng = new GraphicObject();
        // нельзя создать объект!
        mng = new Circle();
        mng.draw();
        mng.moveTo(10, 10);
    }
}
