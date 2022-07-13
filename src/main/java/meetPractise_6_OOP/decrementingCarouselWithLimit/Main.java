package meetPractise_6_OOP.decrementingCarouselWithLimit;

public class Main {
    public static void main(String[] args) {
        /*CarouselRun run = new GraduallyDecreasingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1
        */
        /*DecrementingCarousel carousel = new GraduallyDecreasingCarousel(7);

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run = carousel.run();

        System.out.println(run.isFinished()); //false

        System.out.println(run.next()); //20
        System.out.println(run.next()); //30
        System.out.println(run.next()); //10

        System.out.println(">>>>>>>>>>");

        System.out.println(run.next()); //19
        System.out.println(run.next()); //29
        System.out.println(run.next()); //9

        System.out.println(">>>>>>>>>>");

        System.out.println(run.next()); //17
        System.out.println(run.next()); //27
        System.out.println(run.next()); //7

        System.out.println(">>>>>>>>>>");

        System.out.println(run.next()); //14
        System.out.println(run.next()); //24
        System.out.println(run.next()); //4

        System.out.println(">>>>>>>>>>");

        System.out.println(run.next()); //10
        System.out.println(run.next()); //20

        System.out.println(">>>>>>>>>>");

        System.out.println(run.next()); //5
        System.out.println(run.next()); //15

        System.out.println(">>>>>>>>>>");

        System.out.println(run.next()); //9

        System.out.println(">>>>>>>>>>");

        System.out.println(run.next()); //2

        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1
*/
        //Refusing adding more elements case:

  /*      DecrementingCarousel carousel = new DecrementingCarousel(3);

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

        /*DecrementingCarousel carousel = new DecrementingCarousel(10);

        System.out.println(carousel.addElement(2)); //true
        System.out.println(carousel.addElement(3)); //true
        System.out.println(carousel.addElement(1)); //true

        carousel.run();

        System.out.println(carousel.addElement(2)); //false
        System.out.println(carousel.addElement(3)); //false
        System.out.println(carousel.addElement(1)); //false*/


       // Refusing to create more than one CarouselRun:

        DecrementingCarousel carousel = new DecrementingCarousel(10);
        System.out.println(carousel.run() == null); //false
        System.out.println(carousel.run() == null); //true
    }
}
