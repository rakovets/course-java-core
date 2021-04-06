package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class TimeDemo {
    public static void main(String[] args) {
        Time time = new Time(5,15,45);
        System.out.printf("%2d:%2d:2d", time.getHours(), time.getMinutes(), time.getSeconds())
    }
}
//NOTE: Для каждого созданного класса, нужно создать демонстрационные/тестовые классы, которые демонстрируют/тестирую работу ВСЕХ конструкторов и методов.

  //      WARNING: ТОЛЬКО демонстрационные классы могут содержать вывод в *Standard Output* (консольный вывод).
