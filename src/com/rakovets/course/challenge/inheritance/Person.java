package com.rakovets.course.challenge.inheritance;

public class Person {
    private int happiness;

    Person(int happiness){
        this.happiness = happiness;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    int takeHappiness(int happiness){
        this.happiness = this.happiness + happiness;
        if (this.happiness >= 0 && this.happiness <= 90){
            System.out.printf("man's  happiness is %d. Man is happy. \n", this.happiness);
        } else if (this.happiness >90) {
            System.out.printf("man's happiness is %d. Man is DZEN. \n", this.happiness);
        }   else {
            System.out.println("Man is DEPRESSION.");
        }
        return this.happiness;
    }


}
