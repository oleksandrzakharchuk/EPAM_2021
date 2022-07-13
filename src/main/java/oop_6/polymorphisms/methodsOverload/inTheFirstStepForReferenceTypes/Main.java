package oop_6.polymorphisms.methodsOverload.inTheFirstStepForReferenceTypes;
//В этом примере описаны два метода с именем doJob(), со ссылочными параметрами типа String и Object. Когда методы вызываются, то им передается ссылка на строку, которая определяется типами String и Object. Поэтому в этом случае получается точное соответствие типов аргументов и параметров.

//public class Main {
    //private static Object str;

   /* static void doJob(String s) {  System.out.println("String");  }
    static void doJob(Object o) {  System.out.println("Object");  }
    public static void main(String[] args) {
        String ss = "abcd";
        Object obj = str;
        doJob(str);
        doJob(obj);
    }
}*/
//String
//
//Object

//При разрешении перегрузки для ссылочных типов решающую роль играет не тип объекта, а тип ссылки на объект.