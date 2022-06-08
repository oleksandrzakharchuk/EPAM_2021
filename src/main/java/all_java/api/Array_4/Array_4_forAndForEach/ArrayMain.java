package all_java.api.Array_4.Array_4_forAndForEach;

public class ArrayMain {
    public static void main(String[] args) {

       int[] array;
        int[] arrayInt = new int[100];
        int[] amountDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Апрель содержит " + amountDays[3] + " дней");

        for (int i = 0; i < amountDays.length; i++) {//ип итерационной переменной должен совпадать с типом элементов массива.
            if (amountDays[i] < 31) {
                amountDays[i] = 0;
            }
            arrayInt[i] = amountDays[i];
        }
        array = amountDays;

//операция не изменяет элементы массива, то для его перебора можно использовать цикл for-each:
       // int[] arrayInt1 = {1, 2, 3, 4, 5, 6};
        //for (int valueInt1 : arrayInt1) {
        //    System.out.print(valueInt1);//123456

//фрагмент кода, в котором предполагается изменение элементов массива. Поскольку для перебора массива используется цикл for-each, то элементы массива не изменятся. В этом случае меняется только значение переменной element:
            int[]  arrayInt2 = { 1, 2, 3, 4, 5, 6 };
            for (int element :  arrayInt2) {
                element *=  element;
            }
            for (int valueInt2 : arrayInt2) {//Изменения работают только для ссылочных изменяемых типов данных.
                System.out.print(valueInt2+" ");//1 2 3 4 5 6
            }

        }
    }

