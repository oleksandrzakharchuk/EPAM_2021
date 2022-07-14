package abstractСlasses.mainExample;
//Абстракция является одним из ключевых понятий языков объектно-ориентированного программирования, на которое опираются инкапсуляция, наследование и полиморфизм. Главная цель абстракции – снизить сложность программы, скрывая ненужные детали от пользователя.   //Абстракция заключается в том, что какую-либо сложную сущность можно рассматривать как единое целое, производить с ней определенные действия, не вдаваясь в детали внутреннего построения и функционирования.
//
//В качестве примера можно привести следующую ситуацию. Представьте, что водитель управляет автомобилем. В этот момент он не будет задумываться о химическом составе краски автомобиля, особенностях взаимодействия шестерёнок в коробке передач или влияния формы кузова на скорость (разве что, автомобиль стоит в глухой пробке и водителю абсолютно нечем заняться). Однако руль, педали, указатель поворота он будет использовать регулярно.
//
//Таким образом, абстрагирование – это способ выделить набор значимых характеристик объекта, исключая из рассмотрения незначимые. Абстракции позволяют провести декомпозицию предметной области на набор понятий и связей между ними.

//Существует понятие "степень абстракции", которая может быть высокой и низкой.

//Высокая степень
// Высокая степень абстрагирования дает только приблизительное описание объекта и не позволяет достоверно моделировать его поведение.
// Например, большинство детей рассматривает кошку как нечто мягкое и пушистое.

//Низкая степень абстрагирования делает модель очень сложной, перегруженной деталями, и потому непригодной для использования.
//
//Например, разобрав автомобиль до винтика, вы теряете представление, как это все соединить обратно.

//сли говорить об абстракции в отношении ООП, то она проявляется в описании классов. Другими словами, классы являются механизмом группирования и обобщения. При этом группирование достигается тем, что похожим объектам присваивается один класс, а обобщение достигается за счет иерархии классов. Важно понимать, что абстракция представляет не весь объект целиком, а только лишь его существенный набор характеристик:

//Pассмотрим, что дают абстрактные типы данных:
//
//Группировку родственных операций и данных.
//Упрощение за счет построения более высокого уровня абстракции.
//Возможность моделировать сущности реального мира.
//Изоляцию сложности или упрощение за счет сокрытия деталей реализации.
//Повышение удобочитаемости и понимаемости кода.
//Ограничение влияния изменений.
//Локальность изменений кода.


//Таким образом, абстрагирование – это способ выделить набор значимых характеристик объекта, исключая из рассмотрения незначимые. Абстрагирование помогает снизить сложность программы.

//В языке Java абстрактный класс – это класс, который объявлен с ключевым словом abstract и в котором могут быть описаны поля, а также методы с реализацией и без (абстрактные методы). Важно понимать, что абстрактные классы не могут быть использованы для создания экземпляров, но они могут быть суперклассами. Можно сказать, что это класс, который определяет обобщенную форму, используемую всеми его подклассами, то есть такой класс определяет общую природу поведения.

//https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html

//Абстрактный суперкласс
//
//Если абстрактный класс – это суперкласс, то подкласс обеспечивает реализацию всех абстрактных методов своего родительского класса.

//Абстрактный класс
//
//Если класс включает абстрактные методы, то он обязательно должен быть объявлен как абстрактный.

//Абстрактный подкласс
//
//Если подкласс не обеспечивает реализацию всех абстрактных методов своего родительского класса, то он также должен быть объявлен как абстрактный.

//Наследование абстрактного класса
//
//Абстрактный класс может расширять другой абстрактный класс, но не обязательно реализовывать абстрактные методы его суперкласса.

//Доступ к элементам
//
//Абстрактные методы и другие элементы абстрактного класса могут быть определены с любой видимостью, кроме private. Делать абстрактные методы закрытыми не имеет смысла, так как их никто не сможет реализовать.

//Состав абстрактного класса
//
//Абстрактные классы могут иметь поля, абстрактные методы и полностью реализованные методы.

//Требования к реализации
//
//При наследовании абстрактного класса, если подкласс является описанием конкретной сущности, то он должен реализовывать абстрактные методы своего суперкласса. Подкласс может переопределять абстрактные методы суперкласса с той же или менее ограничивающей видимостью.

//Если подкласс описывает конкретную/реальную сущность, то он должен реализовать все абстрактные методы суперкласса. Один абстрактный класс может наследоваться от другого и не реализовывать абстрактные методы суперкласса.


//Наследник абстрактного класса, реализующий не все его абстрактные методы, должен быть объявлен как абстрактный. Объект абстрактного класса создать нельзя.

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Student(777, "Jan", 9.41);//ссылку person можна проинициализировать только объектом подкласса(например Student)

        Teacher teacher = new Teacher(23, "Qarpia", "PHD");// создаем ссылку на объект teacher с пом конструктора teacher
        System.out.println(person);
        System.out.println(teacher);
    }
}
//Student{{personId = 777, lastName = 'Jan'} averageMark = 9.41}
//Teacher{{personId = 23, lastName = 'Qarpia'} academicRank = 'PHD'}