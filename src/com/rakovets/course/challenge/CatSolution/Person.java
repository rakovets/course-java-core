package com.rakovets.course.challenge.CatSolution;

public class Person {
    private int happiness;
    public Person(int happiness) {
        this.happiness = happiness;
        normalize();
    }

    public int getHappiness() { return this.happiness; }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
        normalize();
    }

    public int takeHappiness(int happiness) {
        this.happiness += happiness;
        normalize();
        return this.happiness;
    }

    private void normalize() {
        if (this.happiness >100) {
            this.happiness = 100;
        } else if (this.happiness < 0) {
            this.happiness = 0;
        }
    }

}
