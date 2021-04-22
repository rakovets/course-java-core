package com.rakovets.course.java.core.practice.jcf_list.studio.model;

import java.util.List;

public class Studio {
    private List<Actor> actors;

    public Studio(List<Actor> actors){
        this.actors = actors;
    }

    public Studio(){

    }

    public List<Actor> fire(List<Actor> actors){
        int maxFee = 0;
        int maxFeeIndex = 0;
        for(int i = 0; i < actors.size(); i ++) {
            if (actors.get(i).getFee() > maxFee) {
                maxFee = actors.get(i).getFee();
                maxFeeIndex = i;
            }
        }
        actors.remove(maxFeeIndex);
        return actors;
    }

    public List<Actor> getActors() {
        return actors;
    }
}
