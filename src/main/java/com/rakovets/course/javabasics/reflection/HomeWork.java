package com.rakovets.course.javabasics.reflection;

public class HomeWork {
    private int lessonNum;
    private int mark;
    private String lessonName;

    public HomeWork(int mark) {
        this.mark = mark;
    }

    public HomeWork(int lessonNum, String lessonName) {
        this.lessonNum = lessonNum;
        this.lessonName = lessonName;
    }

    public int getLessonNum() {
        return lessonNum;
    }

    public int getMark() {
        return mark;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonNum(int lessonNum) {
        this.lessonNum = lessonNum;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
}
