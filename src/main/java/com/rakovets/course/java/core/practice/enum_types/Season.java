package com.rakovets.course.java.core.practice.enum_types;

public class Season implements SeasonDescription {
    private final Seasons FAVORITE_SEASON;
    private final Seasons season;

    public Season(Seasons season) {
        this.FAVORITE_SEASON = Seasons.SPRING;
        this.season = season;
    }

    @Override
    public String getDescription() {
        String result;
        Seasons season = this.getSeason();

        if(season == Seasons.SUMMER) {
            result = "It's hot time of year.";
        } else {
            result = SeasonDescription.super.getDescription();
        }

        return result;
    }

    public Seasons getSeason() {
        return season;
    }

    public Seasons getFAVORITE_SEASON() {
        return FAVORITE_SEASON;
    }
}
