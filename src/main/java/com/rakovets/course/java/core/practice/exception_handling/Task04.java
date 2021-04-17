package com.rakovets.course.java.core.practice.exception_handling;

/* создать собственный класс-исключение - наследник класса `RuntimeException`
        * создать метод, выбрасывающий это исключение
        * вызвать этот метод
        * отловить это исключение
        * вывести `stack trace` в Standard Output
        * добавить в конструктор своего класса возможность указания сообщения*/


public class Task04 {
    public static void main(String[] args) {
        try {
            exception();
        } catch (ClassForTask04 e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void exception() throws ClassForTask04{
        throw new ClassForTask04("MyException");
    }
}

