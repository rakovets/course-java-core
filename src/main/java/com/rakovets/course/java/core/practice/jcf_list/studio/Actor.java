package com.rakovets.course.java.core.practice.jcf_list.studio;

public class Actor implements Comparable<Actor>{
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer fee;

    public Actor(String firstName, String lastName, int age, int fee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.fee = fee;
    }

    @Override
    public int compareTo(Actor actor) {
        return fee.compareTo(actor.getFee());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


}
