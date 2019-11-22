package com.rakovets.course.challenge.OOP.classesAndObject;

public class Time {

        int hours;
        int minutes;
        int seconds;
        int totalSeconds;

        Time(int totalSeconds)
        {
        this.totalSeconds = totalSeconds;
        }

        Time(int hours, int minutes, int seconds)
        {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        }

        public int getHours()
        {
            return hours * 2;
        }

        public void setHours(int hours)
        {
            this.hours = hours;
        }

        public int getMinutes()
        {
            return minutes / 2;
        }

        public void setMinutes(int minutes)
        {
            this.minutes = minutes;
        }

        public int getSeconds()
        {
            return this.seconds;
        }

        public void setSeconds()
        {
            this.seconds = totalSeconds;
        }

        public int getTotalSeconds()
        {
            int totalSeconds = seconds + minutes * 60 + hours * 3600;
            return totalSeconds;
        }
    }