package class_5.destructurizationOfClassObjects;
//В Java нет специальных методов и операторов для деструктуризации объектов класса – деструкторов. Потому разработчик не управляет этим процессом. Уничтожение неиспользуемых объектов производится сборщиком мусора (garbage collector) – специальным компонентом JVM.

// распределение памяти
//Как вам известно, при использовании оператора new память для создаваемых объектов динамически выделяется из пула свободной оперативной памяти. Оперативная память не бесконечна, и поэтому свободная память рано или поздно исчерпывается. Это может привести к невозможности исполнения оператора new.
//
//Именно по этой причине одной из главных функций любой системы динамического распределения памяти является своевременное ее освобождение от неиспользуемых объектов.

//освобождение памяти
//Во многих языках программирования освобождение распределенной ранее памяти осуществляется вручную. Например, в языке С++ для этой цели служит оператор delete. Однако в Java применяется подход, называемый "сборка мусора".
//
//Сборка мусора освобождает память автоматически и работает следующим образом: если на объект отсутствуют ссылки из программы, то такой объект считается больше ненужным, и занимаемая им память возвращается в пул свободной. Эта освобожденная память может быть затем распределена для других объектов.
//
//Сборка мусора осуществляется лишь время от времени по ходу исполнения программы. Она не выполняется сразу же после обнаружения объектов, которые больше не используются. Обычно, во избежание снижения производительности, сборка мусора выполняется лишь при выполнении двух условий: существуют объекты, подлежащие удалению, и есть необходимость освободить занимаемую ими память.
//
//Сборка мусора требует определенных затрат времени. Исполнительная система Java при выполнении этой операции руководствуется принципом целесообразности. Следовательно, вы никогда не можете знать точно, когда именно произойдет сборка мусора.

//Метод finalize
//В Java предусмотрена возможность определить метод-финализатор – finalize(), который будет вызван перед окончательным удалением объекта из памяти. Он позволяет убедиться в том, что объект можно безболезненно удалить.
//
//Чтобы добавить в класс финализатор, достаточно переопределить в нем метод finalize(), унаследованный от класса Object. Исполняющая система Java вызовет этот метод перед фактическим удалением объекта. В теле метода finalize() следует предусмотреть действия, которые должны быть выполнены непосредственно перед удалением объекта.

public class PereopredMethodFinalize {

    protected void finalize() {
        //здесь указываеться код завершения
        //ключевое слово protected предотвращает доступ к методу за пределами класса
        //метод вызывается тогда, когда система сборки мусора принимает решение об освобождении памяти, занимаемой данным объектом
        //если объект в это время оказывается вне области видимости, то метод не будет вызван (например, если программа успеет завершиться до того, как будет запущена сборка мусора, то вызова метода не произойдет).

        //Поэтому нормальная работа программы не должна зависеть от того, вызван или нет метод finalize(). А для освобождения ресурсов, которые программе больше не нужны, следует использовать другие средства.
    }
}
