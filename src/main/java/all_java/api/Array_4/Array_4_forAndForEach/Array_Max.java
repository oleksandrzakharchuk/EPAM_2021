package all_java.api.Array_4.Array_4_forAndForEach;
//Задача: необходимо найти максимальное значение в массиве и заменить отрицательные элементы этого массива на него.

public class Array_Max {
    public static void main(String[] args) {


        //Сначала необходимо перебрать массив и найти максимальное значение. Поскольку в этом случае массив не меняется, то лучше использовать цикл for-each.
        int[] array = {5, 10, 0, -5, 16, -2};
        int max = array[0];
        for (int value : array) {
            if (max < value) {
                max = value;
            }
        }

        //Необходимо изменить элементы массива. Правильнее использовать обычный цикл for, так как требуется обращение к элементу массива по индексу.
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = max;
            }
            System.out.println("array[" + i + "]= " + array[i]);

        }
    }
}
