package oop_6.inheritance.car;
//подкласс ElectricCar использовал унаследованные методы как есть. Но чаще всего наследнику необходимо реализовать то, что отличает его поведение от суперкласса.

public class ElectricCar extends Car {
}
//Что же может сделать подкласс в отношении различных унаследованных элементов своего суперкласса?
//в отношении полей:
// Унаследованные поля могут быть использованы напрямую, как и любые другие поля подкласса.
//В подклассе можно объявить поле с тем же именем, что и в суперклассе, скрывая его таким образом (настоятельно не рекомендуется).
//В подклассе можно объявить новые поля, которых нет в суперклассе.

//в отношении методов:
//наследованные методы могут быть использованы напрямую, как есть.
//В подклассе можно написать новый метод экземпляра, который будет иметь ту же сигнатуру, что и один из методов экземпляра суперкласса, таким образом переопределяя его.
//В подклассе можно написать новый метод класса (статический), который имеет туже сигнатуру, что и один из методов суперкласса, таким образом скрывая его.
//В подклассе можно объявить новые методы, которых нет в суперклассе.

//в отношенни конструкторов:
//Конструкторы суперкласса не наследуются. Их можно только вызвать. Конструктор подкласса может вызывать конструктор суперкласса, используя ключевое слово super. Для этого используют следующий синтаксис: super(<список аргументов>);
//Обычно обращение к конструктору суперкласса в теле конструктора подкласса используется для инициализации закрытых полей суперкласса. Такие поля не перешли в область видимости подкласса, но являются его характеристиками, которые нужно инициализировать при создании объекта подкласса.
//https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html