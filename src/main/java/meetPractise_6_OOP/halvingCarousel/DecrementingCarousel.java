package meetPractise_6_OOP.halvingCarousel;

import meetPractise_5_Class.CarouselRun;

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

    public static class CarouselRun {
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

        public static class HalvingCarousel extends DecrementingCarousel {

            public HalvingCarousel(final int capacity) {
                super(capacity);
            }
        }

        static class Main {
            public static void main(String args[]) {
                CarouselRun run = new HalvingCarousel(7).run();
                System.out.println(run.isFinished()); //true
                System.out.println(run.next()); //-1

                // DecrementingCarousel carousel = new HalvingCarousel(7).run();


                    /*    carousel.addElement(20);
                        carousel.addElement(30);
                        carousel.addElement(10);

                        CarouselRun run = carousel.run();

                        System.out.println(run.isFinished()); //false

                        System.out.println(run.next()); //20
                        System.out.println(run.next()); //30
                        System.out.println(run.next()); //10

                        System.out.println(run.next()); //10
                        System.out.println(run.next()); //15
                        System.out.println(run.next()); //5

                        System.out.println(run.next()); //5
                        System.out.println(run.next()); //7
                        System.out.println(run.next()); //2

                        System.out.println(run.next()); //2
                        System.out.println(run.next()); //3
                        System.out.println(run.next()); //1

                        System.out.println(run.next()); //1
                        System.out.println(run.next()); //1

                        System.out.println(run.isFinished()); //true
                        System.out.println(run.next()); //-1
                    }*/
            }
        }
    }
}





