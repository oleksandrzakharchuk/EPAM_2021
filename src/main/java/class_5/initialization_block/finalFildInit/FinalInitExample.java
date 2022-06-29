package class_5.initialization_block.finalFildInit;

import java.util.Random;

public class FinalInitExample {
    final int MAX_RANGE;//в общем случае значение по умолчанию файнел поле получить не может в отличии от x and y. Выдает ошибку. Чтобы оставить строку неизменной но инициализацию провести есть способы. Инициализацию требуеться провести до окончания работы каждого конструктора
    // MAX_RANGE должно быть проинициализированно в каждом конструкторе MAX_RANGE = 1000; MAX_RANGE = new Random().nextInt(10000);
    // для каждого обекта класса это значение может быть собственным, т.е оно неизменяемо в пределах одного обекта (один раз получив инициализацию изменено оно уже быть не может)
    // final поле гарантированно должно получить значение до окончания инициализации объекта. Инициализацией обекта занимаеться конструктор. Значит обязательно в конструкторе должно быть проинициализированно это
    // значение. Если использовать в данном случае конструктор с параметрами то для всех обектов, которые вызываються с этим конструктором  инициализационное значение MAX_RANGE -предельное значение будет
    // различным. Т.е если у нас обычное файнел поле то это значит что для каждого обекта класса это значение мржет быть собственным. Т.е оно неизменяемо в пределах одного обекта. Один раз получив инициализацию изменено уже быть не может.

    private int x;
    private  int y;
    //второй способ инициализации с помощю логического блока. Вставляеться между именем класса и первым конструктором так как он вызываеться до вызова конструктора
    {
        MAX_RANGE = new Random().nextInt(10000);//в єтом случае любое добавление конструктора не повлечет за собой необходимость добавления инициализации файнел поля
    }
    public FinalInitExample(){
        //MAX_RANGE = 1000; появляються ошибки компиляции
    }
    public FinalInitExample(int x, int y){
        this.x = x;
        this.y = y;
        //MAX_RANGE = new Random().nextInt(10000);появляються ошибки компиляции
    }

    public FinalInitExample(int x) {
        this.x = x;
    }
}
//так как логический блок вызывается перед каждым вызовом конструктора то тогда в конструкторе делать єто нет необходимости. В случае если  б они остались в конструкторе то добавление любого нового конструктора привело бі к необходимости добавлять обязательно инициализацию в каждом из них.

//поле экземпляра типа final обязательно должно быть проинициализировано. Но только в одном из мест: там же, где объявляется; в динамическом блоке инициализации; в конструкторе.