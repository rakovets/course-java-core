package com.rakovets.course.challenge.classes;

public class TimeRangeTest {
    public static void main(String[] args) {
        TimeRange FirstTime = new TimeRange(7856);
        System.out.println("Hour:" + FirstTime.getHour() + " Min:" + FirstTime.getMin() + " Sec:" + FirstTime.getSec());

        TimeRange SecondTime = new TimeRange(5, 26, 9);
        System.out.println("Hour:" + SecondTime.getHour() + " Min:" + SecondTime.getMin() + " Sec:" + SecondTime.getSec());

        System.out.println(SecondTime.convertTimeRangeToSeconds());
    }
}
