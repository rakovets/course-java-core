package com.rakovets.course.java.core.practice.generics;

import java.util.Objects;

public class Obscure<T> {
    protected T object;

    /**
     * Constructor.
     *
     * @param object the object being passed.
     */
    public Obscure(T object) {
        this.object = object;
    }

    /**
     * Checks for the existence of an object.
     *
     * @return true - object exists, false - object does not exist.
     */
    public boolean isPresent() {
        return object != null;
    }

    /**
     * Checks if the object is not null.
     *
     * @return true - object is null, false - object is not null.
     */
    public boolean isEmpty() {
        return object == null;
    }

    /**
     * Takes an object of a generic type.
     * <p>The method returns a generic type object that is stored in the Obscure.
     * <p>If it doesn't exist, the method returns default object.
     *
     * @param defaultObject generic type object.
     * @return the result of a boolean comparison where,
     * if true, returns the obscure object, and if false, returns the default object.
     */
    public T orElse(T defaultObject) {
        return isPresent() ? object : defaultObject;
    }

    /**
     * If the object exists, then the method returns the object.
     *
     * @return the object that passed the check.
     * @throws Exception fires when object is null.
     */
    public T orElseThrow(Exception exception) throws Exception {
        if (isPresent()) {
            return object;
        } else {
            throw exception;
        }
    }

    /**
     * This method takes an object of a generic type.
     *
     * @param obscure generic type object.
     * @param <T>     generic type object.
     * @return a generic Obscure object.
     */

    public static <T> Obscure<T> of(T obscure) {
        return new Obscure<>(obscure);
    }

    /**
     * Returns an empty object.
     *
     * @param <T> generic type object.
     * @return an empty Obscure object of a generic type.
     */
    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Obscure<?> obscure = (Obscure<?>) o;

        return object.equals(obscure.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    public T getObject() {
        return object;
    }
}
