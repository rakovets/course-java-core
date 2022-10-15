package com.rakovets.course.java.core.practice.enum_types;

public class PrintILoveThisSeason {
    public void printILoveThisSeason(MySeasonEnum season) {
        final String ILove = "Я люблю ";
        switch (season) {
            case Осень:
                System.out.println(ILove + MySeasonEnum.Осень);
            case Весна:
                System.out.println(ILove + MySeasonEnum.Весна);
            case Зима:
                System.out.println(ILove + MySeasonEnum.Зима);
            case Лето:
                System.out.println(ILove + MySeasonEnum.Лето);
        }
    }


}
