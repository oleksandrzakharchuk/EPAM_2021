package class_5.methods;

public class LearnMainVariableParam {
    public static void main(String[] args) {
        VariableParam param = new VariableParam();
//        param.method(42, 3, 5);
//        param.method();
        int []arr = {4, 5};
        param.method(arr);//попытка сделать второй массив приводит к ошибке (arr, arr))  или добавление числа (arr, 4) --> ошибка компиляции
        param.method(1, 42);//перегруженная версия
    }
}

