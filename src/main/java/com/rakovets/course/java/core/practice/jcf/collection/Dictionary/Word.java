package com.rakovets.course.java.core.practice.jcf.collection.Dictionary;

public class Word {
    private final String translation;

    public Word(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
