package abstractСlasses.mainEx2;

public abstract class BaseService {
    public abstract  String change (String str);//начиная с 8 джави все возможности абстрактного класса который описывает поведение на себя приняли интерфейсы.В интерфейсах так же можна обявлять абстрактные и неабстрактные методы с дефолтной реализацией и можна обявлять статические методы. Все это можно и у абстрактного класса. Абстракция поведения подразумевает, что в базовом классе реализации не существует и реализация этого поведения будет находиться в подклассе. Абстрактные классы которые описывают поведение редко имеют поля и эти поля носят служебную роль - используються при работе методов - если они есть и  в подклассах эти методы переопределяютьсяю. Избежать переопределения просто невозможно. Нас заставит это сделать компилятор. Иначе попросит сделать класс абстрактным

}
