package Array_4.Array_4_ToothedArrays;

public class ЕoothedArrays {
    public static void main(String[] args) {
        //Если все размерности и значения элементов массива известны, то для его описания можно использовать явную инициализацию.
        /*int[][] array = { { 11, 22 },
                { 33, 44, 55, 66 },
                { 77, 88, 99 },
                {} };
        System.out.println(args);
        */
//Если все размерности известны, а значения элементов массива нет, то можно сначала только зарезервировать/выделить память.
        int[][] arr = new int[4][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[3];
        arr[3] = new int[2];
        System.out.println(arr[0]);
    }
}
