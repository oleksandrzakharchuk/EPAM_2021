package all_java.api.Array_4;

import java.util.Arrays;

public class Array_copy {
    public static void main(String[] args) {
        int[]array= {1,2,3,4,};
        int[]hold = {33,44,55,66,77,88};
        System.arraycopy(array, 0, hold, 2, 2);//[33, 44, 1, 2, 77, 88] копировать часть одного массива в другой массив с помощью метода System.arraycopy().
        System.out.println(Arrays.toString(hold));
    }
}
