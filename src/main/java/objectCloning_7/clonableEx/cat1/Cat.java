package objectCloning_7.clonableEx.cat1;

/*public class Cat implements Cloneable {
    private int age;
    private String name;

    public Cat(int year, String name) {
        this.age = year;
        this.name = name;*/
  //  }

  //  public String toString() {
   //     return "Age = " + age + ", name = " + name;
   // }
/*}
    public Object clone() throws CloneNotSupportedException
    return super.clone();
    }
}
public class Main {
    public static void main(String[] arg) throws Exception {
        Cat mycat = new Cat(5, "Chita");
        Cat copyCat = (Cat) myCat.clone();
        System.out.println(copyCat);
    }
}*/
//Age = 5, name = Chita
//
//Для создания копии объекта необходимо переопределить метод clone() класса Object и указать, что класс реализует интерфейс-маркер Cloneable. В методе clone() класса Object уже реализован один из видов клонирования — поверхностное (создаются копии полей), потому здесь и используется обращение к нему (super.clone()). В результате получим копию исходного объекта