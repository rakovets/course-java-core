package com.rakovets.course.java.core.practice.oop.principles;

public class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    public  String mew(){
        return "Мяу";
    }

    public void mew(Person person){
        person.changeHappiness(-10);
    }

    public String purr(){
        return "Мур";
    }

    public void purr(Person person){
        person.changeHappiness(+10);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


}
