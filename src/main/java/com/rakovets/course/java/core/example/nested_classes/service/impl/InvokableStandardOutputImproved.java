package com.rakovets.course.java.core.example.nested_classes.service.impl;

import com.rakovets.course.java.core.example.nested_classes.service.Invokable;

public class InvokableStandardOutputImproved implements Invokable {
    @Override
    public void invoke(String string) {
        System.out.println("Improved -> "+ string);
    }
}
