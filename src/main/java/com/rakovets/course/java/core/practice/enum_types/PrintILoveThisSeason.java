package com.rakovets.course.java.core.practice.enum_types;

public class PrintILoveThisSeason {
    public void printILoveThisSeason(MySeasonEnum season) {
        String string = "Я люблю ";
        switch (season) {
            case Осень:
                System.out.println(string + MySeasonEnum.Осень);
            case Весна:
                System.out.println(string + MySeasonEnum.Весна);
            case Зима:
                System.out.println(string + MySeasonEnum.Зима);
            case Лето:
                System.out.println(string + MySeasonEnum.Лето);
        }
    }


}
