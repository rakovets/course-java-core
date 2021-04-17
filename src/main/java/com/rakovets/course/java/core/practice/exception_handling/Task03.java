package com.rakovets.course.java.core.practice.exception_handling;

//* создать собственный класс-исключение - наследник класса `Exception`
//* создать метод, выбрасывающий это исключение
//* вызвать этот метод
//* отловить это исключение
//* вывести `stack trace` в Standard Output
public class Task03 {
    public static void main(String[] args) {
        try {
            exception();
        } catch (ClassForTask03 e) {
            System.out.println(e.getStackTrace());
        }

    }

    public static void exception() throws ClassForTask03{
        throw new ClassForTask03();
    }
}
