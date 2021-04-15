package com.rakovets.course.java.core.practice.generic_types.obscure;

public class Obscure<T> {
    private T parameterObscure;

    public Obscure(T parameterObscure) {
        this.parameterObscure = parameterObscure;
    }

    public T getParameterObscure() {
        return parameterObscure;
    }

    public boolean isPresent() {
        return parameterObscure != null;
    }

    public boolean isEmpty() {
        return parameterObscure == null;
    }

    public T orElse(T currentParameterObscure) {
        if (parameterObscure != null) {
            return parameterObscure;
        } else {
            return currentParameterObscure;
        }
    }

    public T orElseThrow() throws Exception {
        try {
            if (parameterObscure == null) {
                throw new Exception("NullPointerException");
            }
        }
            catch (Exception e){
                System.out.println(e.getMessage());
        }
        return parameterObscure;
    }
}
