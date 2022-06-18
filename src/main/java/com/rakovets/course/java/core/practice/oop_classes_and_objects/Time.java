package com.rakovets.course.java.core.practice.oop_classes_and_objects;

/**
 * @author Anastasia Melnikova
 * @since 18.06.2022
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    final int SECONDS_TO_HOUR = 3600;
    final int SECONDS_TO_MINUTE = 60;

    /**
     * Конструктор. Переводит общее время в секундах соответсвенно в часы, минуты и секунды
     *
     * @param totalSeconds общее время в секундах
     */
    public Time(long totalSeconds) {
        this.hours = (int) totalSeconds / SECONDS_TO_HOUR;
        this.minutes = (int) (totalSeconds - this.hours * SECONDS_TO_HOUR) / SECONDS_TO_MINUTE;
        this.seconds = (int) totalSeconds - (this.hours * SECONDS_TO_HOUR + this.minutes * SECONDS_TO_MINUTE);
    }

    /**
     * Конструктор.
     *
     * @param hours   общее время в часах
     * @param minutes общее время в минутах
     * @param seconds общее время в секундах
     */
    public Time(int hours, int minutes, int seconds) {
        if (minutes >= 60 || seconds >= 60 || minutes <= 0 || seconds <= 0) {
            System.exit(0);
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * Метод для получения значения поля
     */
    public int getHours() {
        return hours;
    }

    /**
     * Метод для установки значения поля
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Метод для получения значения поля
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Метод для установки значения поля
     */
    public void setMinutes(int minutes) {
        if (minutes >= 60 || minutes <= 0) {
            System.exit(0);
        }
        this.minutes = minutes;

    }

    /**
     * Метод для получения значения поля
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Метод для установки значения поля
     */
    public void setSeconds(int seconds) {
        if (seconds >= 60 || seconds <= 0) {
            System.exit(0);
        }
        this.seconds = seconds;
    }

    /**
     * Возвращает общее время в секундах
     */
    public int getTotalSeconds() {
        return seconds + minutes * SECONDS_TO_MINUTE + hours * SECONDS_TO_HOUR;
    }
}
