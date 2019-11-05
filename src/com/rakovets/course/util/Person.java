package com.rakovets.course.util;

public class Person {
    int hapinness;

    public Person(int hapinness) {
        this.hapinness = hapinness;
    }

    void takeHapinness(int hapinness) {
        this.hapinness += hapinness;
        System.out.printf("Pleasure that person get %d and final hapinness is %d\n", hapinness, this.hapinness);
        if (this.hapinness < 0) {
            System.out.println("Cats drove man into depression");
        } else if(this.hapinness >= 50){
            System.out.println("Cats made man a happy");
        }
    }

    public int getHapinness() {
        return hapinness;
    }

    public void setHapinness(int hapinness) {
        this.hapinness = hapinness;
    }
}
