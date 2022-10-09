package com.rakovets.course.java.core.practice.enum_types;

public enum SeasonsEnum {
    WINTER(-4),
    SPRING(7),
    SUMMER(18) {
        @Override
        public String getDescription() {
            return "Warm season.";
        }
    },
    AUTUMN(7);

    int averageTemperature;

    SeasonsEnum(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        return "Cold seasons";
    }

    public String favoriteSeason(SeasonsEnum favoriteSeason) {
        String infoSeason = "UnknownSeason";

        switch (favoriteSeason) {
            case WINTER:
                infoSeason = "I love winter!";
                break;
            case SPRING:
                infoSeason = "I love spring!";
                break;
            case SUMMER:
                infoSeason = "I love summer!";
                break;
            case AUTUMN:
                infoSeason = "I love autumn!";
                break;
            default:
                break;
        }

        return infoSeason;
    }

    public static void main(String[] args) {
        SeasonsEnum favoriteSeason = SeasonsEnum.SUMMER;

        System.out.println(favoriteSeason + " " + favoriteSeason.averageTemperature + " "
                + favoriteSeason.getDescription());

        System.out.println(favoriteSeason.favoriteSeason(favoriteSeason));

        for (SeasonsEnum season : SeasonsEnum.values()) {
            System.out.println(season + " " + season.averageTemperature + " " + season.getDescription());
        }
    }
}
