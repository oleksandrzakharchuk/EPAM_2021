package class_5.initialization_block.learnMainStaticMethod;

import java.util.Locale;

public class StaticBlockInitialization_Student {
    // поскольку он вызываеться первым его всегда располагают  в самом начале обявления  класса
    // попытка статической инициализации чего-то такого уникального которое можно сделать один раз. В процессе инициализации происходит ошибка и в дальнейшем приложение расчитывает на то что эти данные проинициализированны и хочет ими пользоваться НО они не получили никакого значения и никакого значения по умолчанию у нас для них НЕТ. По этому виртуальная машина останавливаеться с ерором  и предлагаеться программе исправить ту ошибку инициализации что бы она не возникала и тогда приложение сможет работать.
    //РЕШЕНИЕ:если в статичиском логическом блоке возникает ексепшин и он никаким образом не обрабатываеться там то он оборачиваеться в ExceptionInInitializerError --> значительно более серйозный чем ArithmeticException

    static {//выполнение блока кода
        // конфигурирование логгера, создание пула соединений для базы данных
        //инициализация статических полей
        //может обращаться к обычным полям класса так как он вызывается без объекта
        // где бы он не стоял он будет вызван самым первым
        //  если два статических блока они будут вызываться в порядке как они встречаются
        faculty = "MMF";
        //если генерируеться ексепшин
        int a = 1/0;//ExceptionInInitializerError-->ArithmeticException
       // Error--> ошибка статической инициализации
    }
    static String faculty;//не может обращаться к обычным полям класса и к текущему объекту
    // может быть вызван 2-й раз
    private long studentId;
    private String name = "";
    private int yearOfStudy;

    public StaticBlockInitialization_Student(long studentId) {
        this.studentId = studentId;
    }
    public static void convertFaculty(String head){
        System.out.println(head + " " + faculty.toLowerCase(Locale.ROOT));// чтобы избежать Null pointre eheption -->static String faculty=0; Инициализируем faculty в статическом поле
    }
}
//Exception in thread "main" java.lang.ExceptionInInitializerError
//	at class_5.initialization_block.learnMainStaticMethod.LearnMainStaticMethod.main(LearnMainStaticMethod.java:6)
//Caused by: java.lang.ArithmeticException: / by zero
//	at class_5.initialization_block.learnMainStaticMethod.StaticBlockInitialization_Student.<clinit>(StaticBlockInitialization_Student.java:16)
//


//два варианта порядка инициализации
// класса в значения по умолчанию.
//Инициализация полей класса выражениями.
//Выполнение статических блоков инициализации.
//Если команда запуска программы указывает именно этот класс для выполнения, то выполняется содержащийся в нем метод main. Этот метод

//исполнение конструкторов суперклассов – родительских классов.
//Инициализация полей экземпляра значениями по умолчанию или начальными значениями.
//Выполнение динамических блоков инициализации.
//Выполнение тела конструктора класса.