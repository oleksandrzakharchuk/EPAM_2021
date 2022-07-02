package oop_6.encapsulation.pablic.secunda;

import oop_6.encapsulation.pablic.prima.Alfa;

public class Bete extends Alfa  {//если класс Bete наследует-расширяет(extends) класс Alfa то в методах подкласса Bete  protected метод класса  Alfa  будет доступен через собственный конструктор public Bete() {super();

    public Bete() {
        super();//конструктор класса class Bete обращаеться к конструктору класса Alfa через super();

    }
   // @Override
   // protected void commit() {
    //    super.commit();
   // }
    public void service(){
        //Alfa alfa = new Alfa();

    }


// если  убрать extends Alfa то создать обект неполучиться из за недоступности конструктора

      /*  alfa.action();*///вызов public метода action() из класса Alfa
//      alfa.exec();//будет невиден exec так как метод private, тоже самое касаеться полей и конструкторов
        // commit(); // или
       //this.commit();//доступен только внутри класса
        // Beta. Тоже самое и касаеться конструкторов

    }

