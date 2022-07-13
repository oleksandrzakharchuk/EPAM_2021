package oop_6.objectClass;

public class EmployeeToString {
   // public String toString() {
       // return "Employee [name=" + name
         //       + ", salary=" + salary
          //      + ", hireDay=" + hireDay
          //      + "]";
        //Данный метод можно усовершенствовать: без жесткого кодирования имени класса в методе toString(), вызовем метод getClass().getName() и получим строку, содержащую имя класса:
    }
  //  public String toString() {
    //    return getClass().getName()
     //           + " [name=" + name
     //           + ", salary=" + salary
     //           + ", hireDay=" + hireDay
      //          +"]";
   // }
    //В такой реализации метод toString() работает и с подклассами. Программист, создающий подкласс, должен определить свой собственный метод toString() и добавить поля подкласса. Если в суперклассе используется вызов getClass().getName(), подкласс просто вызывает метод super.toString().

   // class Manager extends Employee {
        // …
      //  public String toString()    {
       //     return super.toString()
        //            + " [bonus=" + bonus
       //             + "]";
    //    }
        //Теперь строковое представление объекта класса Manager выводится следующим образом: Manager [name=…, salary=…, hireDay=…] [bonus=…]
        //
        // Настоятельно рекомендуется переопределять метод toString() в каждом создаваемом классе.

//} нюансы работы с методом toString().
//
// Cоединение со строкой: Если объект объединяется со строкой с помощью операции +, компилятор языка Java автоматически вызывает метод toString(), чтобы получить представление о его текущем состоянии.
//Manager boss = new Manager ("John", 1000, 2020, 04, 01, 200)
 //   String message = "The current position is = " + boss;

///Если объект был передан в качестве параметра в один из методов вывода (например, println()), то для переданного объекта будет автоматически вызван метод toString().
    //Manager boss = new Manager ("John", 1000, 2020, 04, 01)
//System.out.println(boss); // It is the same as System.out.println(boss.toSring())

//Метод toString() – отличное средство протоколирования. Многие классы из стандартной библиотеки определяют метод toString() так, что вы можете получать полезную информацию о состоянии объекта.
//System.out.println("The current position is " + boss);

//Однако чуть позже будет продемонстрировано, что существует еще более удачное решение:
//
//Logger.global.info("The current position is " + boss);
