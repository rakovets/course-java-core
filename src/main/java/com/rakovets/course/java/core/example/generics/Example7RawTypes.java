package com.rakovets.course.java.core.example.generics;

import com.rakovets.course.java.core.example.generics.model.Box;

public class Example7RawTypes {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box rawBox = stringBox;
        rawBox.set(8); // warning: unchecked invocation to set(T)
    }
}
