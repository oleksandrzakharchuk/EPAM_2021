package class_5.finalUsing;

public class FinalFiled {
    //предельные значения (лимит на карте, ежедневный расход денег, ) тогда обявляем поле с фиксирванным значением
    private final int MAX_RANGE = 1_000;
    //final поле изменяемого типа, то внутреннее состояние обекта изменять можна

    final StringBuilder builder = new  StringBuilder();
    // final !=const;

    private int x;
    private String name;
    //при присваивании x нужно проверять это значение на привышение этого значения. Если меньше MAX_RANGE - значение x будет присвоино, если больше то будет генерация исключения ...

    //final переопределить нельзя


    public FinalFiled(int x) {
        this.x = x;
       // MAX_RANGE = 111; переопределение(переинициализация) приводит к ошибке компиляции в любом месте кода
        builder.append("hello");// внутреннее состояние обекта изменять можно
        //builder = new StringBuilder();// переприсвотть билдер невозможно - ошибка компиляции

    }
}
