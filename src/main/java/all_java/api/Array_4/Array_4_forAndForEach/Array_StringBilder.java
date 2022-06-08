package all_java.api.Array_4.Array_4_forAndForEach;

public class Array_StringBilder {
    public static void main(String[] args) {

        StringBuilder[] stringBuilders = new StringBuilder[3];//хранит строки но єто уже изменяемій тип данніх
        stringBuilders[0] = new StringBuilder("Java");
        stringBuilders[1] = new StringBuilder("Oracle");
        stringBuilders[2] = new StringBuilder("<epam>");

        for (StringBuilder elem : stringBuilders) {//преимущества:Упрощенность представления. Нет необходимости ведения дополнительной переменной цикла, установки ее начального значения и условия завершения цикла. Нет необходимости индексировать массив.
            // недостатки: Отсутствие гибкости при манипулировании итерационной переменной.  Невозможность изменить значение элементов массива (для примитивных и неизменяемых ссылочных типов данных).

            elem.append(12);
        }
        for (StringBuilder elem : stringBuilders) {
            System.out.println(elem);//Java12  Oracle12  <epam>12
            //заменить нельзя ссылку но если обект ссылочного типа являеться изменяемым то внутреннее состояние этого обекта изменить можно. Т.к ссылка elem на первой итерации ссілаеться на то же обект что и stringBuilders[0]. На єтой ссілке візіваеться метод. Все изменения после цікла будут изменяться.
        }
    }
}

