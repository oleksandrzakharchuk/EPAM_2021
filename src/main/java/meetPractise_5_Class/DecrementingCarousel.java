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

import java.util.Arrays;

public class DecrementingCarousel {
    int capacity;
    static int[] elements;
    int size = 0;
    boolean called;


    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];

    }

    public boolean addElement(int element) {
        if (element <= 0 || elements.length == size) {
            return false;
        }
        elements[size++] = element;
        return true;
    }


    public CarouselRun run() {
        if (!called) {
            elements = Arrays.copyOf(elements, size);
            called = true;
            return new CarouselRun();
        } else {
            return null;
        }
    }

    public class CarouselRun {
        int count = 0;
        int[] array = DecrementingCarousel.elements;

        public int next() {

            if (array.length == 0) {
                return -1;
            }

            if (count == array.length) {
                count = 0;
            }

            while (array[count] == 0) {
                count++;

                if (count > array.length - 1) {
                    count = 0;
                }

                if (isFinished()) {
                    return -1;
                }
            }

            for (int i = 1; i < array.length; i++) {
                if (array[i] == -1) {
                    break;
                }
            }

            count++;
            action(count - 1);
            return array[count - 1] + 1;
        }

        public boolean isFinished() {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            return sum == 0;
        }

        public void action(int index) {
            array[index]--;
        }
    }
    public static class HalvingCarousel extends DecrementingCarousel {

        public HalvingCarousel(final int capacity) {
            super(capacity);
            System.out.println("integer division, discarding the remainder capacity/2 = " + capacity / 2);

        }

    }


    static class Main {
        public static void main(String args[]) {
           // CarouselRun run = new  HalvingCarousel(7).run();
           // System.out.println(run.isFinished()); //true
           // System.out.println(run.next()); //-1


       /*    DecrementingCarousel carousel = new HalvingCarousel(7);

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
            System.out.println(run.next()); //-1*/

        /*    DecrementingCarousel carousel = new DecrementingCarousel(3);

            System.out.println(carousel.addElement(-2)); //false
            System.out.println(carousel.addElement(0)); //false

            System.out.println(carousel.addElement(2)); //true
            System.out.println(carousel.addElement(3)); //true
            System.out.println(carousel.addElement(1)); //true

            //carousel is full
            System.out.println(carousel.addElement(2)); //false

            CarouselRun run = carousel.run();

            System.out.println(run.next()); //2
            System.out.println(run.next()); //3
            System.out.println(run.next()); //1

            System.out.println(run.next()); //1
            System.out.println(run.next()); //2

            System.out.println(run.next()); //1

            System.out.println(run.isFinished()); //true
            System.out.println(run.next()); //-1*/

            //Refusing to add more elements after "run" was called:

       /*     DecrementingCarousel carousel = new DecrementingCarousel(10);

            System.out.println(carousel.addElement(2)); //true
            System.out.println(carousel.addElement(3)); //true
            System.out.println(carousel.addElement(1)); //true

            carousel.run();

            System.out.println(carousel.addElement(2)); //false
            System.out.println(carousel.addElement(3)); //false
            System.out.println(carousel.addElement(1)); //false*/

            //Refusing to create more than one CarouselRun:

            DecrementingCarousel carousel = new DecrementingCarousel(10);
            System.out.println(carousel.run() == null); //false
            System.out.println(carousel.run() == null); //true
        }
    }
}




