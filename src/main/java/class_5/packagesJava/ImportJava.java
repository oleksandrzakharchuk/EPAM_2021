package class_5.packagesJava;

//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.*;//не рекомендуеться прибегать по причине доступности до всех классов пакета, делает программу хуже читаемой, особенно если касаеться импорта классов из пакетов, которые сделаны самим разработчиком и находяться в данном проекте

//лучший вариант - каждому импорту своя строчка
//import java.io.FileNotFoundException;
//import java.io.FileReader; или вариант прописывания импорта перед кадждым FileReader прописывать импорт
//java.io reader = new java.io.FileReader("path"); своеобразный импорт без ключевого слова import

import java.io.FileNotFoundException;

public class ImportJava {
    public static void main(String[] args) {

    //ключевое слово import необходимо для получения доступа для pablic class, interferes из других пакетов.
    // package by.epam.learn.advanced --> в данном случае мы находимся в пакете и напрямую без всяких импортов нам доступны классы которые размещены в этом пакете с любым уровнем видимости а также классы из пакета java learn
    // если нам нужны стандартные классы из другого пакета либо какие-либо классы из других пакетов нашего приложения либо из библиотек jar файлов подключенным к нашему проекту то нам необходимо использовать import

    //если нам необходим FailReader

      //  java.io.FileReader reader;

        try {
            java.io.FileReader reader = new java.io.FileReader("path");//import java.io.FileReader;
        } catch (FileNotFoundException e) {        //import java.io.FileNotFoundException;
            e.printStackTrace();
        }
    }
}
