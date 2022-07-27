package com.rakovets.course.java.core.practice.jcf_set;

import static java.lang.System.*;

public interface Printable {
    /**
     * Prints the database to the console.
     *
     * @param taxService database.
     */
    default void printDataBase(TaxService taxService) {
        for (Person datum : taxService.data) {
            out.println(datum);
        }
    }
}
