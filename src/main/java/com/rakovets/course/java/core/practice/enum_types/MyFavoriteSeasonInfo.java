package com.rakovets.course.java.core.practice.enum_types;

public class MyFavoriteSeasonInfo implements FavoriteSeason {
    private final Seasons FAVORITE_SEASON;

    public MyFavoriteSeasonInfo(Seasons seasons) {
        this.FAVORITE_SEASON = seasons;
    }

    public String favoriteSeasonInfo() {
        String favoriteSeasonInfo;

        favoriteSeasonInfo = "Spring is a transition season between the winter and summer seasons. The days get \n" +
                "longer and nights get shorter, the temperatures are milder, and flowers bloom. There is a warm \n" +
                "wind in the spring season in the air. Spring typically begins in March and usually lasts until \n" +
                "May or June.";

        return favoriteSeasonInfo;
    }

    public Seasons getFAVORITE_SEASON() {
        return FAVORITE_SEASON;
    }
}
