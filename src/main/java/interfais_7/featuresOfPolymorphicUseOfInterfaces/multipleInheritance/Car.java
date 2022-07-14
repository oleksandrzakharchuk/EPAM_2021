package interfais_7.featuresOfPolymorphicUseOfInterfaces.multipleInheritance;
//описаный класс Car реализует несколько интерфейсов OperateCar (операции с автомобилем), Parkable (паркование), Moveable (перемещение). В зависимости от того, через какую ссылку мы обращаемся к объекту, мы сразу четко определяем набор действий, который хотим производить с этим объектом. Например, обращаясь через ссылку типа Parkable, нас интересует только выполнение действий по парковке.

/*
public class Car implements  OperateCar, Parkable, Moveable {   …  }
    OperateCar сar = new Car ();// в зависимости от типа ссылки поведение обекта отражает тот или инной контракт
    Parkable park = (Parkable) сar;
    Moveable mov = (Moveable) сar;
}
*/
