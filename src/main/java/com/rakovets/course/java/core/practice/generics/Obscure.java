package com.rakovets.course.java.core.practice.generics;

import java.util.Optional;

public class Obscure<T> {
    private T t;

    public Obscure(T t) {
        this.t = t;
    }

    public T get() {
        return Optional.ofNullable(t).get();
    }

    /**
     * The method determines whether an object of a generic type exists.
     *
     * @param object entry argument in the form of generic type
     * @return <ul>
     * <li>when a generic type object exists, then <code>true</code></li>
     * <li>when the generic type object does not exist <code>false</code></li>
     */
    public boolean isPresent(T object) {
        return Optional.ofNullable(object).isPresent();
    }

    /**
     * The method determines whether the generic type object is empty.
     *
     * @param object entry argument in the form of generic type
     * @return <ul>
     * <li>when generic type object is empty, then <code>true</code></li>
     * <li>when generic type object does not empty, then <code>false</code></li>
     */
    public boolean isEmpty(T object) {
        return Optional.ofNullable(object).isEmpty();
    }

    /**
     * The method returns a generic type object that is stored in the Obscure.
     * If it doesn't exist, the method returns default object.
     *
     * @param defaultObject entry argument in the form of generic type
     * @return generic type object that is stored in the Obscure / default object
     */
    public T orElse(T defaultObject) {
        return Optional.ofNullable(t).orElse(defaultObject);
    }

    /**
     * The method determines whether an object of a generic type exists.
     * If the generic type object exists, then it returns.
     * If the generic type object does not exist, then it throws the exception that is passed to the method.
     *
     * @param exception entry argument in the form of exception
     * @return generic type object / exception that is passed to the method
     */
    public T orElseThrow(Exception exception) throws Exception {
        return Optional.ofNullable(t).orElseThrow(() -> new Exception("Generic type object does not exist"));
    }

    public static <T> Obscure of(T t) {
        return new Obscure(t);
    }

    public static <T> Obscure empty() {
        return new Obscure<>(null);
    }
}
