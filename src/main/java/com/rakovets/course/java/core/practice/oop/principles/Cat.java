package com.rakovets.course.java.core.practice.oop.principles;

public class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    public  String mew(){
        return "May";
    }

    public void mew(Person person){
        person.changeHappiness(-15);
    }

    public String purr(){
        return "Myp";
    }

    public void purr(Person person){
        person.changeHappiness(+15);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


}
