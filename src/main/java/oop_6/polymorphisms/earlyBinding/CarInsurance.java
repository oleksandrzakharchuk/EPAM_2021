package oop_6.polymorphisms.earlyBinding;
//Класс CarInsurance – является подклассом Insurance, в котором:
//
//определено свое статическое поле HIGH
//переопределен статический метод метод getCategory(), который возвращает имя подкласса
//переопределен метод экземпляра getPremium(), который возвращает значение поля HIGH.

public class CarInsurance extends Insurance {
    public static final int HIGH = 200;

    @Override
    public int getPremium() {
        return HIGH;
    }

    public static String getCategory() {
        return "CarInsurance";
    }
}
