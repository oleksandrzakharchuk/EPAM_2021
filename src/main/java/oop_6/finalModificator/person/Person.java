package oop_6.finalModificator.person;

import java.util.ArrayList;

public class Person {
    //в классе Person определено поле friends как неизменяемое (ссылка на коллекцию друзей, изначально пустую). Так же определены методы получения и добавления в коллекцию друзей.

    private final ArrayList friends = new ArrayList<>();
    public ArrayList getFriends() {
        return friends;
    }
    public void addFriend(Person friend) {//Добавление объектов типа Person в объект типа ArrayList. Поскольку метод addFriend() не меняет ссылку, а только изменяет состояние коллекции, то ошибки не происходит.
        friends.add(friend);
    }
}
