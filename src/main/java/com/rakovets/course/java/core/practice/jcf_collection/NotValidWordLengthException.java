package com.rakovets.course.java.core.practice.jcf_collection;

public class NotValidWordLengthException extends RuntimeException {
    NotValidWordLengthException() {
        super("Word length is not valid");
    }
}
