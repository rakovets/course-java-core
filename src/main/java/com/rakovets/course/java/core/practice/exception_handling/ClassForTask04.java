package com.rakovets.course.java.core.practice.exception_handling;
/* создать собственный класс-исключение - наследник класса `RuntimeException`
 * создать метод, выбрасывающий это исключение
 * вызвать этот метод
 * отловить это исключение
 * вывести `stack trace` в Standard Output
 * добавить в конструктор своего класса возможность указания сообщения*/

public class ClassForTask04 extends RuntimeException {
   private String text;

    ClassForTask04(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}
