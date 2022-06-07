package meetPractise_4;

import org.codehaus.groovy.runtime.DefaultGroovyMethods;

public class MeetPractise_SumOfEvenNumbers_2 {
    private static DefaultGroovyMethods SumOfEvenNumbers;

    //реализуйте метод sum.
    //Правильная реализация должна получить массив значений int и вернуть сумму четных чисел.
    //Подробности:
    //Если данный массив равен нулю или пуст, метод возвращает 0.
    //Метод sum не должен изменять массив.
    //Входной массив может содержать любое значение типа int от Integer.MIN_VALUE до Integer.MAX_VALUE.
    public static void main(String[] args) {
        //int[]vals = new int[]{-2,10,0,5};
        int[]vals = new int[]{1, 3, 2, 8, 15, 199};
        int sum = 0;
        for( int i = 0; i < vals.length; i++){
            sum += vals[i];
        }
        System.out.println("Sum = "+ sum);
        int result = SumOfEvenNumbers.sum(vals);
        //System.out.println(result == 13); // true
        System.out.println(result == 228); // true
    }
}
/*Sum = 13
true
*/

/*Sum = 228
true*/