package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T value;

    public Obscure (T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isPresent(){
        return value != null;
    }

    public boolean isEmpty(){
        return value == null;
    }

    public T orElse(T defaultValue) {
        return isPresent() ? value : defaultValue;
    }

    public T orElseThrow(Exception exception) throws Exception {
        if(isPresent()){
            return value;
        } else {
            throw exception;
        }
    }

    public  static <S> Obscure<S> of(S object){
        return new Obscure<S>(object);
    }

    public void setValue(T value) {
        this.value = value;
    }
}
