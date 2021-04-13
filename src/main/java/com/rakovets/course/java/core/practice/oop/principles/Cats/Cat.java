package com.rakovets.course.java.core.practice.oop.principles.Cats;

public class Cat {
    String name;

    public Cat(String name){
        this.name = name;

    }
    public String mew(){
    String meow = "mew";
    return meow;
    }
    public String purr(){
        String phur = "purr";
        return phur;
    }

    public void mew(Person person){
        person.changeHappiness(20);

    }

    public void purr(Person person){
        person.changeHappiness(-20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
