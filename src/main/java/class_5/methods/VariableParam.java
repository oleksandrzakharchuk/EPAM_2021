package class_5.methods;

import java.util.Arrays;

public class VariableParam {
    public  void method (int ... values) {// операнд в единственном числе -> (int ... values, int ... values)) - невозможно. Два подобных фигурировать не могут. Должен быть всегда крайний справа. (int ... values, int h)) - даст ошибку
        //public  void method (String str, int ... values) -> слева можна добавлять любое количество аргументов

if(values.length !=0){
    System.out.println(Arrays.toString(values));
}else {
    System.out.println("without values");

}
    }
    public  void method (int a, int b) {// перегрузка
    //public  void method (int [] b) {// нельзя перегружать массивом
        System.out.println(a + "  " + b);
    }
}
