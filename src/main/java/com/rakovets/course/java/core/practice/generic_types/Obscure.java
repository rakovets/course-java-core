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

    public T orElseThrow(){
        if (field == null){
            throw new NullPointerException("object cannot be null");
        }
        else
            return field;
    }

    public static <S> Obscure <S> of(S Str){
        return new Obscure<>(Str);
    }

    public static <S> Obscure <S> empty(){
        return new Obscure<>(null);
    }

    @Override
    public String toString() {
        return field + "";
    }
}




