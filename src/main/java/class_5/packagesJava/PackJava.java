package class_5.packagesJava;

//В Java пакеты (packages) используются для предотвращения конфликтов с названиями, для контроля доступа, для облегчения поиска, нахождения и использования классов, интерфейсов, перечислений и аннотаций.
//
//Любой класс Java относится к определенному пакету, который может быть неименованным (unnamed или default package), если оператор package отсутствует. Оператор package, помещаемый в начале исходного программного файла, определяет именованный пакет. Другими словами, определяет область в пространстве имен классов, в которой определяются имена классов, содержащихся в этом файле. Действие оператора package указывает на месторасположение файла относительно корневого каталога проекта.

//package com.epam.eun.entity;

//При этом программный файл будет помещен в подкаталог с названием com.epam.eun.entity. Имя пакета при обращении к классу из другого пакета присоединяется к имени класса

// --> com.epam.eun.entity.Student.

//В проектах пакеты именуются следующим образом:

//com.epam -->Обратный Интернет-адрес производителя или заказчика программного обеспечения, а именно для www.epam.com,

//eun -->Имя проекта (обычно сокращенное), например, eun.

//entity.Student --> Пакеты, определяющие собственно приложение.
//
//Общая форма файла, содержащего исходный код Java, может быть следующая:
//
//одиночный оператор package (необязательно, но крайне желательно)
//любое количество операторов import (необязательно)
//одиночный открытый (public) класс (необязательно)
//любое количество классов пакета (необязательно и нежелательно).
//При использовании классов, перед именем класса через точку надо добавлять полное имя пакета, к которому относится данный класс.

public class PackJava {
//Ниже приведен далеко не полный список пакетов реального приложения. Из названий пакетов можно определить, какие примерно классы в нем расположены, не заглядывая внутрь. При создании пакета всегда следует руководствоваться простым правилом: название пакета должно быть простым, но отражающим смысл, логику поведения и функциональность объединенных в нем классов.
//
//com.epam.eun
//com.epam.eun.administration.type
//com.epam.eun.administration.dbhelper
//com.epam.eun.common.type
//com.epam.eun.common.dbhelper.annboard
//com.epam.eun.common.dbhelper.course
//com.epam.eun.common.dbhelper.guestbook
//com.epam.eun.common.dbhelper.learnresult
//com.epam.eun.common.dbhelper.message
//com.epam.eun.common.dbhelper.news
//com.epam.eun.common.dbhelper.prepinfo
//com.epam.eun.common.dbhelper.statistic
//com.epam.eun.common.dbhelper.subjectmark
//com.epam.eun.common.dbhelper.subject
//com.epam.eun.common.dbhelper.test
//com.epam.eun.common.dbhelper.user
//com.epam.eun.common.menu
//com.epam.eun.common.object
//com.epam.eun.common.servlet
//com.epam.eun.common.tool
//com.epam.eun.consultation.type
//com.epam.eun.consultation.dbhelper
//com.epam.eun.consultation.object
//com.epam.eun.core.type
//com.epam.eun.core.dbhelper
//com.epam.eun.core.exception
//com.epam.eun.core.filter
//com.epam.eun.core.manager
//com.epam.eun.core.taglib

}
