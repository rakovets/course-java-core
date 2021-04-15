package com.rakovets.course.java.core.practice.generic_types;

public class Obscure <T> {
    private T field;

    public Obscure(T field){
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public boolean isPresent(){
        return field != null;
    }

    public boolean isEmpty(){
        return field == null;
    }

    public T orElse(T value){
        return field == null ? value : field;

    }


    }
}
