package meetPractise_4;

import groovy.util.GroovyCollections;

import java.util.Arrays;

public class MeetPractice_4_MaxMethod_1 {
    private static GroovyCollections MaxMethod;

    //Правильная реализация должна получить массив значений типа int и вернуть его максимальное значение.
    //
    //Подробности:
    //
    //Входной массив гарантированно не будет пустым или null.
    //Метод max не должен изменять массив.
    //Входной массив может содержать любое значение типа int от Integer.MIN_VALUE до Integer.MAX_VALUE.
    public static void main(String[] args) {
        int[] vals1 = new int[]{ -2, 0, 10, 5 };
        Arrays.sort(vals1);
        System.out.println(Arrays.toString(vals1));//[-2, 0, 5, 10]

        int min =vals1[0];
        System.out.println("MIN_VALUE: "+min);

        int max= vals1[vals1.length-1];
        System.out.println("MAX_VALUE: "+max);

        //int result = MaxMethod.max(vals1);
       // System.out.println(result == 10);
    }
}
