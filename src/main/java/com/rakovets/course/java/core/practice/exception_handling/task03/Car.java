package com.rakovets.course.java.core.practice.exception_handling.task03;

public class Car {
    public void carCheck() throws OwnClassHeirException {
        throw new OwnClassHeirException("Engine error");
    }
}
