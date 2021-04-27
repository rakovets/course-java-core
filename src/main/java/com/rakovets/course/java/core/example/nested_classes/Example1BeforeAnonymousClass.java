package com.rakovets.course.java.core.example.nested_classes;

import com.rakovets.course.java.core.example.nested_classes.service.Invokable;
import com.rakovets.course.java.core.example.nested_classes.service.impl.InvokableStandardOutput;
import com.rakovets.course.java.core.example.nested_classes.service.impl.InvokableStandardOutputImproved;

public class Example1BeforeAnonymousClass {
    public static void main(String[] args) {
        Invokable invokableStandardOutput = new InvokableStandardOutput();
        invokableStandardOutput.invoke("Test");
        Invokable invokableStandardOutputImproved = new InvokableStandardOutputImproved();
        invokableStandardOutputImproved.invoke("Test");
    }
}
