package com.rakovets.course.java.core.practice.jcf_list;

import java.util.List;

public class Studio {
    private List<Actor> listOfActors;

    public Studio(List<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public static List<Actor> fire(List<Actor> listOfActors) {
        int maxFee = 0;
        int index = 0;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getFee() > maxFee) {
                maxFee = listOfActors.get(i).getFee();
                index = i;
            }
        }
        listOfActors.remove(index);
        return listOfActors;
    }

}
