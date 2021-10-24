package com.rakovets.course.java.core.example.enum_types.model;

public enum Season {
    WINTER(12, 1, 2),
    SPRING(3, 4, 5),
    SUMMER(6, 7, 8),
    AUTUMN(9, 10, 11);

    private final int[] month = new int[3];

    Season(int first, int second, int third) {
        this.month[0] = first;
        this.month[1] = second;
        this.month[2] = third;
    }

    public static Season ofMonth(int month) {
        for (Season season : Season.values()) {
            for (int numberMonth : season.month) {
                if (month == numberMonth) {
                    return season;
                }
            }
        }
        throw new IllegalArgumentException("Enter integer number from [1, 12]");
    }
}
