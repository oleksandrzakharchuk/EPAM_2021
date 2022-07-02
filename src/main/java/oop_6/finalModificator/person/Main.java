package oop_6.finalModificator.person;

public class Main {
    public static void main(String[] args) {
        Person man1 = new Person();
        Person man2 = new Person();
        Person man3 = new Person();
        man3.addFriend(man1);
        man3.addFriend(man2);
        System.out.println(man3.getFriends());
        //[oop_6.finalModificator.person.Person@5dfcfece,
        // oop_6.finalModificator.person.Person@23ceabc1]
    }
}
