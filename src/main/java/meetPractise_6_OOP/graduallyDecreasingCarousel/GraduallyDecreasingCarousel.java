package meetPractise_6_OOP.graduallyDecreasingCarousel;

public class GraduallyDecreasingCarousel extends DecrementingCarousel {
    public GraduallyDecreasingCarousel(final int capacity) {

        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new GraduallyDecreasingCarouselRun();
        }
        return null;
    }
}
