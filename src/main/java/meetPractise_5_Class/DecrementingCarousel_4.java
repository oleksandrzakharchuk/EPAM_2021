package meetPractise_5_Class;
//Decrementing Carousel контейнер, принимающий элементы int. DecrementingCarousel имеет максимальную вместимость, указанную в конструкторе. При создании DecrementingCarousel находится в состоянии накопления: вы можете добавлять элементы с помощью метода addElement и создать объект CarouselRun с помощью метода run. После вызова метода run DecrementingCarousel находится в рабочем состоянии: он отказывается добавлять дополнительные элементы.
//
//CarouselRun позволяет перебирать элементы карусели, уменьшая их один за другим с помощью метода next.
//
//Данный метод возвращает значение текущего элемента, затем он уменьшает текущий элемент на единицу и переключается на следующий элемент.
//
//CarouselRun перебирает элементы в порядке их добавления. Когда элемент уменьшится до нуля, CarouselRun пропустит его в дальнейших итерациях. Когда больше нет элементов, доступных для уменьшения, CarouselRun возвращает -1.
//
//CarouselRun также имеет метод isFinished который указывает, закончились ли в карусели элементы для уменьшения.
//
//Детали спецификации
//DecrementingCarousel имеет два public метода:
//
//boolean addElement(int element) – добавляет элемент. Если элемент отрицателен или равен нулю, не добавляет его. Если контейнер заполнен, не добавляет элемент. Если метод run был вызван для создания CarouselRun, не добавляет элемент. Если элемент добавлен успешно, возвращает true. В противном случае – false.
//CarouselRun run() – возвращает CarouselRun для перебора элементов. Если метод run уже был вызван ранее, он должен вернуть null: DecrementingCarousel может генерировать только один объект CarouselRun.
//CarouselRun имеет два public метода:
//
//int next() – возвращает текущее значение текущего элемента, затем уменьшает текущий элемент на единицу и переключается на следующий элемент в порядке добавления. Пропускает нулевые элементы. Когда больше нет элементов для уменьшения, возвращает -1.
//boolean isFinished() – когда больше нет элементов для уменьшения, возвращает true. В противном случае возвращает false.

public class DecrementingCarousel_4 {
    static int capacity;
    int counter = 0;
    //static List <Integer> elements = new ArrayList<>();
    static int [] arr ;


    public DecrementingCarousel_4(int capacity) {
        DecrementingCarousel_4.capacity = capacity;
        arr = new int[capacity];

    }

    public boolean addElement(int element){
        if (counter < capacity && element > 0) {
            arr[counter] = element;
            counter++;
            return true;
        }
        return false;

    }
    public CarouselRun run(){
        return new CarouselRun();
    }
}
 class CarouselRun {
     int position = 0;
     int number = 0;


     public int next() {
         int count = 0;
         double[] arr = new double[0];
         while (count < arr.length && arr[position %= arr.length] <= 0) {
             position++;
             count++;
         }
         if (count == arr.length) return -1;
         return (int) arr[position++]--;
     }




        /*int[] arr = new int[0];
        if (allNegative(arr)) return -1;

        int capacity = 0;
        if (position >= capacity) position = 0;

        if (arr[position] <= 0) {
            if (position == arr.length - 1) {
                position = 0;
                if (arr[position] == 0) {
                    return arr[++position]--;
                }
                else {return arr[position++]--;}
            }
            else {
                return arr[++position]--;
            }

        }
        return arr[position++]--;
*/
        /*int count = 0;
        double[] arr = new double[0];
        while (count < arr.length && arr[position %= arr.length] <= 0) {
            position++;
            count++;
        }
        if (count == arr.length) return -1;
        return (int) arr[position++]--;*/



    public static int[] removeTheElement(int[] arr, int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

    public static boolean allNegative (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) return false;
        }
        return true;
    }
     public boolean isFinished() {
         int[] arr = new int[0];
         for (int var: arr) {
             if (var > 0) return false;
         }
         return true;

     }
 }
    /*public boolean isFinished() {
        int[] arr = new int[0];
        for (int var: arr) {
            if (var > 0) return false;
        }
        return true;

    }*/

class Main {
    public static void main (String args[]) {
            DecrementingCarousel_4 carousel = new DecrementingCarousel_4(7);

            carousel.addElement(2);
            carousel.addElement(3);
            carousel.addElement(1);

            CarouselRun run = carousel.run();

            System.out.println(run.isFinished()); //false

            System.out.println(run.next()); //2
            System.out.println(run.next()); //3
            System.out.println(run.next()); //1

            System.out.println(run.next()); //1
            System.out.println(run.next()); //2

            System.out.println(run.next()); //1

            System.out.println(run.isFinished()); //true
            System.out.println(run.next()); //-1


        }
    }



