package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Person {
    private String personID;
    private String fullName;
    private String livingCity;
    private Penalty penaltyType;
    Set<Penalty> personPenalties;

    public Person(String personID, String fullName, String livingCity) {
        this.personID = personID;
        this.fullName = fullName;
        this.livingCity = livingCity;
        this.personPenalties = new LinkedHashSet<>();
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLivingCity() {
        return livingCity;
    }

    public void setLivingCity(String livingCity) {
        this.livingCity = livingCity;
    }

    public boolean addPenaltyType(Penalty penaltyType) {
        if (!personPenalties.contains(penaltyType)) {
            personPenalties.add(penaltyType);
            return true;
        } else {
            System.out.println("This penalty is already exists!");
            return false;
        }
    }

    public boolean removePenaltyType(Penalty penaltyType) {
        if (personPenalties.contains(penaltyType)) {
            personPenalties.remove(penaltyType);
            return true;
        }
        return false;
    }

    public void printListOfPenalties() {
        System.out.println(Arrays.toString(personPenalties.toArray()));
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", livingCity='" + livingCity + '\'' +
                ", personPenalties=" + personPenalties +
                '}';
    }
}
