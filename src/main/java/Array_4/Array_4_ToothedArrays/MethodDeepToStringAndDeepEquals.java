package Array_4.Array_4_ToothedArrays;

import java.util.Arrays;

public class MethodDeepToStringAndDeepEquals {
   //Метод deeptoString
    // возвращает строковое представление многомерного массива. Элементы массива объединяются с помощью квадратных скобок в зависимости от уровня вложенности.
    //Описание:
    //public static String deepToString(Object[] a)
   public static void main(String[] args) {
       int [][] array = {{1, 2, 3},{4, 5, 6}};
       System.out.println(Arrays.deepToString(array));//[[1, 2, 3], [4, 5, 6]]


       //Метод deepEquals возвращает истину, если два указанных массива полностью равны друг другу. В отличие от метода equals, этот метод можно использовать с многомерными массивами. Два многомерных массива считаются равными при выполнении одного из условий:
       //
       //если оба имеют значение null
       //если они имеют одинаковое количество элементов на первом уровне и все соответствующие пары элементов следующих уровней являются равными.
       //Описание:
      //public static boolean deepEquals(Object[] a1, Object[] a2) { }

       int[][] array5 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
       int[][] anotherArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
       System.out.println(Arrays.equals(array5, anotherArray));//false, метод equals нельзя использовать с многомерными массивами
       System.out.println(Arrays.deepEquals(array5, anotherArray));//true, метод deepEquals можно использовать с многомерными массивами
   }
}
