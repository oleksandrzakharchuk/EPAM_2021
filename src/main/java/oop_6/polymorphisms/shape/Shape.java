package oop_6.polymorphisms.shape;

//полиморфизм — это предоставление единого интерфейса для сущностей (объектов) разных типов или использование одного обозначения для представления разных типов.
// Например, существует иерархия животных. В суперклассе "Животное" определен интерфейс поведения – ходить, издавать звуки, кушать и т.п. Все его наследники ("Кошка", "Собака", "Корова" и другие) разделяют этот интерфейс, однако реализуют его по-своему.
//
// Наиболее распространенное использование полиморфизма в ООП: применение ссылки на суперкласс для обращения к объекту подкласса.

public class Shape {
    //Рассмотрите пример полиморфизма применительно к объектно-ориентированному программированию. Представьте: на этапе проектирования программы необходимо реализовать функционал для рисования/отображения различных фигур, но каких именно — пока неизвестно.

    // Создадим класс Shape с методом draw() для отображения фигур, которые мы собираемся рисовать.

//Через ссылку на суперкласс можно обращаться к объекту любого его подкласса. Подклассы могут определять свое собственное уникальное поведение и при этом разделять функциональность своих суперклассов.
    public void draw() {
        System.out.println("Фигура");
    }
}
