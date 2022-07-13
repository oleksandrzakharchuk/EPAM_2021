package meetPractise_6_OOP.decrementingCarouselWithLimit;

public class CarouselRun {
    protected final int[] array = DecrementingCarousel.carousel.clone();
    protected int position = 0;

    public int next() {
        int beforeDecreasing;
        if (isFinished())
            return -1;
        else {
            beforeDecreasing = array[position];
            int decrement = 0;
            array[position] -= decrement;
            do {
                position++;
                if (position == array.length) {
                    decrement++;
                    position = 0;
                }
            } while ((array[position] <= 0) && !isFinished());
        }
        return beforeDecreasing;
    }

    public boolean isFinished() {
        for (int el : array)
            if (el > 0)
                return false;
        return true;
    }
}
