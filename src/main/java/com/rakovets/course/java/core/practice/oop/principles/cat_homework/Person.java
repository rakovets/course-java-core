package com.rakovets.course.java.core.practice.oop.principles.cat_homework;

public class Person {
    private int happiness;

    public Person(int happiness) {
        if (happiness>= 0 && happiness<= 100) {
            this.happiness = happiness;
        }else if (happiness < 0) {
            this.happiness = 0;
        }else if (happiness > 100) {
            this.happiness = 100;
        }
    }

    public void changeHappiness( int percentHappiness) {
        if(happiness + percentHappiness >= 0 && happiness+percentHappiness <= 100) {
            happiness += percentHappiness;
        } else if (happiness + percentHappiness < 0) {
            happiness = 0 ;
        }else if (happiness + percentHappiness > 100) {
            happiness = 100 ;
        }
    }

    public int getHappiness () {
        return happiness;
    }

    public void setHappiness (int happiness) {
        if (happiness >= 0 && happiness <= 100) {
            this.happiness = happiness;
        }else if (happiness < 0) {
            this.happiness = 0;
        }else if (happiness > 100) {
            this.happiness = 100;
        }

    }




}
