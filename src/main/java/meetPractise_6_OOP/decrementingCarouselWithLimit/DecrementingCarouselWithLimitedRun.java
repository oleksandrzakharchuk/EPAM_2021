package meetPractise_6_OOP.decrementingCarouselWithLimit;
//Необходимо расширить класс DecrementingCarousel. Вам нужно реализовать класс GraduallyDecreasingCarousel. Этот подкласс должен уменьшать элементы как обычный DecrementingCarousel. Разница в том, что эта реализация должна производить карусельный запуск, который ограничивает количество вызовов следующего метода. При достижении лимита вызовов запуск карусели должен считаться завершенным.

public class DecrementingCarouselWithLimitedRun extends  DecrementingCarousel{

    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
    }
}
