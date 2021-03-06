package class_5.packagesJava;
//package com.epam.eun.object;

//Таким образом, любой класс Java относится к определенному пакету. Оператор package, помещаемый в начале исходного программного файла, определяет именованный пакет.

public class CommonObject {
    //Класс начинается с указания того, что он принадлежит пакету, например, класс CommonObject принадлежит com.epam.eun.object. Это означает, что файл CommonObject.java находится в каталоге object.
    // Он, в свою очередь, находится в каталоге eun, и так далее. Нельзя переименовывать пакет, не переименовав каталог, в котором хранятся его классы. Чтобы получить доступ к классу из другого пакета, перед именем такого класса указывается имя пакета: com.epam.eun.object.CommonObject.
    //
    //Избежать таких длинных имен при создании объектов классов поможет ключевое слово import. import com.epam.eun.object.CommonObject; или import com.epam.eun.object.*;
    //Во втором варианте импортируется весь пакет, что означает возможность доступа к любому классу пакета, но только не к подпакету и его классам. В практическом программировании следует использовать индивидуальный import класса, чтобы при анализе кода была возможность быстро определить месторасположение используемого класса.
}
//Доступ к классу из другого пакета можно осуществить еще одним способом (не очень рекомендуемым): применение полного имени пакета при наследовании
//Такая запись используется, если в классе нужен доступ к классам, имеющим одинаковые имена.
//
//package com.epam.eun.usermng;

//public class UserStatistic extends com.epam.eun.object.CommonObject {

//При импорте класса из другого пакета рекомендуется всегда указывать полный путь с указанием имени импортируемого класса. Это позволяет в большом проекте легко найти определение класса, если возникает необходимость посмотреть исходный код класса.
//package com.epam.eun.action;
//import com.epam.eun.object.CommonObject;
//import com.epam.eun.usermng.UserStatistic;
//public class CreatorStatistic extends CommonObject {

//    public UserStatistic statistic;
//}
//Если пакет не существует, то его необходимо создать до первой компиляции.
//Если пакет не указан, класс добавляется в пакет без имени (unnamed). При этом unnamed-каталог не создается.

//Однако в реальных проектах классы вне пакетов не создаются, и не существует причин отступать от этого правила.