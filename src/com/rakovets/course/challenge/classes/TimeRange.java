package com.rakovets.course.challenge.classes;

public class TimeRange {
    private long sec;
    private long min;
    private long hour;

    TimeRange(long sec){
        this.hour = sec / 3600;
        this.min = sec % 3600 / 60;
        this.sec = sec % 60;
    }

    TimeRange(long hour, long min, long sec){
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    long convertTimeRangeToSeconds(){
        long second = this.hour * 3600 + this.min * 60 + this.sec;
        return second;
    }

    public long getHour() {
        return this.hour;
    }

    public long getMin() {
        return this.min;
    }

    public long getSec() {
        return this.sec;
    }
}
