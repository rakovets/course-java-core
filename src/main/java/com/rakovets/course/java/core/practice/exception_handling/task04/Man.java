package com.rakovets.course.java.core.practice.exception_handling.task04;

public class Man {
    public void whatDoesAPersonDo() throws OwnClass {
        throw new OwnClass("do not work");
    }
}
