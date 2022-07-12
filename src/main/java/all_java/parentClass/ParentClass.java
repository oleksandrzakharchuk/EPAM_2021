package all_java.parentClass;

public class ParentClass {
    void parentMethod(int i) {
        System.out.println("parentMethod ParentClass" + i);
    }
}
class ChildClass extends ParentClass{
    public void parentMethod(int i) {
        System.out.println("parentMethod ChildClass" + i);
    }
    public void childMethod(int i) {
        System.out.println("childMethod ChildClass" + i);
    }
    public static void main(String args[]) {
        ParentClass quest = new ChildClass ();   // 1
        quest.parentMethod(1);   // 2
        //quest.childMethod(1);   // 3
       // ((ChildClass) quest).childMethod(1);   // 3
    }
}
//Correct:В строке 1 ошибки не будет, так как происходит безопасное преобразование вверх.
// Во второй строке вызывается полиморфный метод. Ошибка компиляции произойдет при попытке вызова метода, принадлежащего только подклассу, через ссылку на суперкласс, через которую он просто недоступен.