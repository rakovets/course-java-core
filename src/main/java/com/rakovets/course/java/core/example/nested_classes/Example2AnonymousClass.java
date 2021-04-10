package com.rakovets.course.java.core.example.nested_classes;

import com.rakovets.course.java.core.example.nested_classes.service.Invokable;

public class Example2AnonymousClass {
    public static void main(String[] args) {
        Invokable invokableStandardOutput = new Invokable() {
            @Override
            public void invoke(String string) {
                System.out.println(string);
            }
        };
        invokableStandardOutput.invoke("Test");
        Invokable invokableStandardOutputImproved = new Invokable() {
            @Override
            public void invoke(String string) {
                System.out.println("Improved -> " + string);
            }
        };
        invokableStandardOutputImproved.invoke("Test");
    }
}
