package com.rakovets.course.java.core.practice.oop.principles;

public class Cat {
    public String name;
    //Конструктор
    public Cat(String name) {
        this.name = name;
    }
    // Методы
    public String mew() {
        return "Mew";
    }

    public String purr() {
        return "Purr";
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
