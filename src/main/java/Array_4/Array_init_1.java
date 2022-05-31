package Array_4;

public class Array_init_1 {
    public static void main(String[] args) {



       /* int[] array1 = new int[3];
 int [] array1 = {10,20,30};
        array1[0]=10;
        array1[1]=20;
        array1[2]=30;


        System.out.println(array1);*/

        int[] numberArray = new int[10];

        int i = 0;
        while (i < 10) {
            numberArray[i] = i;
            i++;
        }
        i = 0;
        while (i < 10) {
            System.out.println((i+1) + "-й элемент массива = " +  numberArray[i]);
            i++;
        }
    }

}
