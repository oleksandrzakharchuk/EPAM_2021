package Array_4;

public class Array_length {
    public static void main(String[] args) {
        int[] numbers = {-9, 6, 0, -59};
        int num = numbers.length;//информация о количестве элементов массива хранится в свойстве массива length.
        System.out.println(num);//4
        //Используйте свойство length, чтобы контролировать обращение к элементу массива. Это помогает избежать ситуации выхода за границы массива.
        //int num = numbers.length-1;
        System.out.println("Первій елемент: "+numbers[1]);
        System.out.println("2 елемент: "+numbers[2]);
        System.out.println("3 елемент: "+numbers[3]);
        System.out.println("4 елемент: "+numbers[4]);//Index 4 out of bounds for length 4
    }
}
