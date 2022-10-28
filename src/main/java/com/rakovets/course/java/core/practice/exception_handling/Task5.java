package com.rakovets.course.java.core.practice.exception_handling;

public class Task5 {
    public String[] getArray(String namesList) throws NullStringException {
        String[] names;
        try {
            names = namesList.split(" ");
            if (namesList == "") {
                throw new RuntimeException("В строке пусто");
            }
        } catch (RuntimeException e) {
            throw new NullStringException(e.getMessage());
        }
        return names;
    }
}
