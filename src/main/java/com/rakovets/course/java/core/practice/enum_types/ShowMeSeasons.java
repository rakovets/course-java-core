package com.rakovets.course.java.core.practice.enum_types;

/**
 * Specification of task 1
 * Создать перечисление, содержащее названия времен года.
 * <p>
 * Specification of task 2
 * Создать переменную содержащую ваше любимое время года
 * и распечатать всю информацию о нем.
 * <p>
 * Specification of task 3
 * Создать метод, который принимает на вход переменную созданного вами enum типа.
 * Если значение равно Лето, выводим на консоль Я люблю лето и так далее.
 * Используем оператор switch.
 * <p>
 * Specification of task 4
 * Перечисление должно содержать переменную,
 * содержащую среднюю температуру в каждом времени года.
 * <p>
 * Specification of task 5
 * Добавить конструктор принимающий на вход среднюю температуру.
 * <p>
 * Specification of task 6
 * Создать метод getDescription(), возвращающий строку Холодное время года.
 * Переопределить метод getDescription() - для константы Лето метод должен возвращать Теплое время года.
 * <p>
 * Specification of task 7
 * В цикле распечатать все времена года, среднюю температуру и описание времени года.
 */

public class ShowMeSeasons {
    private final SeasonEnum seasonEnum;

    public ShowMeSeasons(SeasonEnum seasonEnum) {
        this.seasonEnum = seasonEnum;
    }

    public void print(SeasonEnum seasonEnum) {
        seasonEnum.print();
    }

    public String favouriteSeason(SeasonEnum seasonEnum) {
        String season = "";
        switch (seasonEnum) {
            case WINTER:
                season = "I love winter";
                break;
            case SPRING:
                season = "I love spring";
                break;
            case SUMMER:
                season = "I love summer";
                break;
            case FALL:
                season = "I love fall";
                break;
        }
        return season;
    }

    public String getDescription(SeasonEnum seasonEnum) {
        String howIsItOutside = "";
        switch (seasonEnum) {
            case FALL:
            case WINTER:
            case SPRING:
                howIsItOutside = "Cold season";
                break;
            case SUMMER:
                howIsItOutside = "Warm season";
                break;
        }
        return howIsItOutside;
    }

    public void arraySeason() {
        for (SeasonEnum seasonEnum : SeasonEnum.values()) {
            System.out.println(seasonEnum + " " + seasonEnum.getTemperature() + " " + getDescription(seasonEnum));
        }
    }
}
