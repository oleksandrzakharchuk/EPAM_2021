package meetPractise_6_OOP.graduallyDecreasingCarousel;

//нужно расширить DecrementingCarousel. Для этого реализуйте GraduallyDecreasingCarousel. Этот подкласс должен уменьшать элементы путем постепенного увеличения уменьшения. Когда вам нужно уменьшить элемент в первый раз, уменьшите его на 1. В следующий раз, когда вам нужно уменьшить тот же элемент, уменьшите его на 2. Далее уменьшите его на 3, затем на 4 и так далее. Вы не должны продолжать уменьшение с неположительные элементами.

public class DecrementingCarousel {
    private final int capacity;
    static int[] carousel;
    int index;
    boolean isRun;

    {
        index = 0;
        isRun = false;
    }

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if (element > 0 && index < capacity && !isRun) {
            carousel[index++] = element;
            return true;
        }
        return false;
    }

    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
    }
}
