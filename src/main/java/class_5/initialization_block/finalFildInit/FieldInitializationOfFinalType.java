package class_5.initialization_block.finalFildInit;
//Поля типа final используются для описания неизменяемых свойств класса или объекта. Как вы знаете, после инициализации значение переменной типа final изменить нельзя. Как следствие, существуют особенности инициализации такого поля. Поле должно быть инициализировано в одном из трех вариантов:
//
//в той же строке, в которой и объявлено
//в каждом конструкторе
//в одном из динамических блоков инициализаций.
//Это связано с тем, что поле типа final может быть инициализировано только один раз.

public class FieldInitializationOfFinalType {
    //public static void main(String[] args) {


//В примере демонстрируется корректная инициализация полей (выражением инициализации, динамической секцией инициализации, конструктором).

        private final int XX = 50;//явная инициализация выражения
        private final int ZZ;
        private final int YY;
        {
            ZZ = 20;//инициализация в динамическом блокe
            System.out.println("Dynamic section");
        }
    public FieldInitializationOfFinalType() {
            YY = 30;//инициализация в конструкторе
            System.out.println("Constructor");
        }
        public static void main (String[]arg){
            System.out.println("Main");
            FieldInitializationOfFinalType obj = new FieldInitializationOfFinalType();
        }
    }

//Main
//Dynamic section
//Constructor