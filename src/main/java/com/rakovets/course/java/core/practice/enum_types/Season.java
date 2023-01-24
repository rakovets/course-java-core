package com.rakovets.course.java.core.practice.enum_types;

public class Season implements SeasonDescription {
    private final Seasons FAVORITE_SEASON;

    public Season(Seasons seasons) {
        this.FAVORITE_SEASON = seasons;
    }

    @Override
    public String getDescription(Seasons season) {
        String result;

        if(season == Seasons.SUMMER) {
            result = "It's hot time of year.";
        } else {
            result = SeasonDescription.super.getDescription(season);
        }

        return result;
    }

    public Seasons getFAVORITE_SEASON() {
        return FAVORITE_SEASON;
    }
}
