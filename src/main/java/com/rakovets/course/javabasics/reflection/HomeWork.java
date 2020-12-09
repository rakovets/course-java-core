package com.rakovets.course.javabasics.reflection;

public class HomeWork {
    private int lessonNumber;
    public int mark;
    private String lessonName;

    public HomeWork() {
    }

    public HomeWork(int mark) {
        this.mark = mark;
    }

    public HomeWork(int lessonNum, String lessonName) {
        this.lessonNumber = lessonNum;
        this.lessonName = lessonName;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public int getMark() {
        return mark;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonNum(int lessonNum) {
        this.lessonNumber = lessonNum;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
}
