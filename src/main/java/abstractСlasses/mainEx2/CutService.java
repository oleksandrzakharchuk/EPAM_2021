package abstractСlasses.mainEx2;

public class CutService extends BaseService{
    @Override//аннотация показывает что метод являеться переопределенным т.е версия в суперклассе абстрактная или не абстрактная и сигнатура должна жостко совпадать (имя метода и тип параметров  ). Стоит чтото изменить и будет ошибка компиляции. Это роль аннотации  @Override
    public String change(String str) {
        return str.substring(3);
    }
}
