package oop_6.polymorphisms.earlyBinding;
//В классе Main создается ссылка на суперкласс current, а инициализируется объектом подкласса. Затем через ссылку на объект и через имя подкласса вызывается статический метод getCategory().

public class Main {
    public static void main(String[] args) {
        Insurance current = new CarInsurance();
        System.out.println("category: " + current.getCategory());
        System.out.println("category: " + CarInsurance.getCategory());
    }
}
//category: Insurance
//category: CarInsurance

//Вызов варианта статического метода зависит не от типа объекта, а от типа ссылки на объект. В приведенном случае, какой именно будет вызван метод getCategory() зависит от типа ссылки объекта current, то есть типа Insurance.

