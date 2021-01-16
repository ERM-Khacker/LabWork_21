package edu;

import java.util.HashSet;
import java.util.Objects;

//4. Работа с своим классом
//a.Создать класс User с полями name, old и phone
public class User {
    private String name;
    private Integer old;
    private Integer phone;

    public User(String name, Integer old, Integer phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

//  f.Переопределить в классе User метод hashcode, P.S(и equals, и toString, без этих методов все ломается) Указав в нем только обработку поля name.
//  g.Вывести пользователей на экран
//  h.Переопределить в классе User метод hashcode, Указав в нем все поля класса.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) && old.equals(user.old) && phone.equals(user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, old, phone);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", phone=" + phone +
                '}';
    }

    public static void main(String[] args) {
//      b.Создать userSet (HashSet<User>)
        HashSet<User> userSet = new HashSet<>();

//      c.Создать 2 экземпляра класса User с одинаковыми полями и 1 экземпляр отличающийся возрастом
        User user1 = new User("Test", 50, 332434234);
        User user2 = new User("Test", 50, 332434234);
        User user3 = new User("Test", 57, 332434234);

//      d.Добавить пользователей в userSet
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

//      e.Вывести пользователей на экран
        System.out.println(userSet);
    }
}
