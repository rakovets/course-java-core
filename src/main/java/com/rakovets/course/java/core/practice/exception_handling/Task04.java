package com.rakovets.course.java.core.practice.exception_handling;

/* создать собственный класс-исключение - наследник класса `RuntimeException`
 * создать метод, выбрасывающий это исключение
 * вызвать этот метод
 * отловить это исключение
 * вывести `stack trace` в Standard Output
 * добавить в конструктор своего класса возможность указания сообщения*/


import java.util.ArrayList;

public class Task04 {
    public static void phoneFinder(String model) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Nokia");
        arrayList.add("Samsung");

        if (!arrayList.contains(model)) {
            throw new PhoneNotAvailableException(model);
        } else {
            System.out.println(model);
        }
    }
}
