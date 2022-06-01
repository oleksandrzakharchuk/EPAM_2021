package Array_4.twoDimensionalArrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        //массив ссылок размерностью 3
        //три одномерных массива ссылок, каждый размерностью 4
        //двенадцать одномерных массивом типа int, каждый размерностью 20.
        int[][][] dim3D = new int[3][4][20];
//при обращении к значению dim3D[1][1] получается адрес ссылки. И только при полном обращении dim3D[1][1][1]   получается значение элемента массива типа int.
        System.out.println(dim3D);//[[[I@4439f31e

    }
}
