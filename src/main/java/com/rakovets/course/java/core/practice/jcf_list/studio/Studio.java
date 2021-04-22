package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    List<Actor> list = new ArrayList<>();

    void fire(List<Actor> list) {
        int indexExpensiveActor = 0;
        int maxPrice = list.get(0).getFee();
        for (int i = 0; i < list.size(); i++) {
            if (maxPrice < list.get(i).getFee()) {
                indexExpensiveActor = i;
            }
        }
        list.remove(indexExpensiveActor);
    }

    @Override
    public String toString() {
        return "Studio{" +
                "list=" + list +
                '}';
    }

    public List<Actor> getList() {
        return list;
    }
}
