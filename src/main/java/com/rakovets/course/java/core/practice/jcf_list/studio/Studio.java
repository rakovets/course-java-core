package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    List<Actor> listActors = new ArrayList<>();

    void fire(List<Actor> listActors) {
        int feeActor = 0;
        double maxFee = listActors.get(0).getFee();
        for (int i = 0; i < listActors.size(); i++) {
            if (maxFee < listActors.get(i).getFee()) {
                feeActor = i;
            }
        }
        listActors.remove(feeActor);
    }

    @Override
    public String toString() {
        return "Studio{" +
                "list of Actors=" + listActors +
                '}';
    }

    public List<Actor> getList() {
        return listActors;
    }
}
