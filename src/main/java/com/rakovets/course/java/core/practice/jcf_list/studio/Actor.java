package com.rakovets.course.java.core.practice.jcf_list.studio;

public class Actor implements Comparable<Actor> {
    private final String firstName;
    private final String lastName;
    private int fee;
    private int age;

    public Actor(String firstName, String lastName, int age, int fee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.fee = fee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Actor{" +
                "name='" + firstName + " " + lastName + '\'' + ", age=" + age +
                ", cash=" + fee +
                '}';
    }

    public int compareTo(Actor actor) {
        return firstName.compareTo(actor.getFirstName());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + firstName.hashCode();
        result = prime * result + lastName.hashCode();
        result = prime * result + age;
        result = prime * result + fee;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Actor other = (Actor) obj;
        if (age != other.getAge())
            return false;
        if (fee != other.getFee())
            return false;
        if (!lastName.equals(other.lastName))
            return false;
        if (!firstName.equals(other.firstName))
            return false;
        return true;
    }
}
