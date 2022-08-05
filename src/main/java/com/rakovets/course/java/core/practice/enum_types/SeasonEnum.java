package com.rakovets.course.java.core.practice.enum_types;

public enum SeasonEnum {
    WINTER(-15),
    SPRING(10),
    SUMMER(20) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    AUTUMN(8);

    private final int temperature;

    public final static SeasonEnum summer = SeasonEnum.SUMMER;

    SeasonEnum(int temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return "Cold season";
    }

    public static String myFavoriteTimeYear () {
        return "My favorite time of the year: " + summer
                + ". Average temperature at this time of year: " + SeasonEnum.SUMMER.temperature + " degrees.";
    }

    public static String displayText(SeasonEnum season){
        String text = "I love ";
        switch (season) {
            case WINTER:
                text += SeasonEnum.WINTER;
                break;
            case SPRING:
                text += SeasonEnum.SPRING;
                break;
            case SUMMER:
                text += SeasonEnum.SUMMER;
                break;
            case AUTUMN:
                text += SeasonEnum.AUTUMN;
                break;
            default:
                text = "Тhere is no such season of the year";
                break;
        }
        return text + "!";
    }

    public static void informationSeason() {
        for (SeasonEnum season : SeasonEnum.values()) {
            System.out.println(season + " average temperature " + season.temperature + " C " + season.getDescription());
        }
    }
}
