package com.rakovets.course.javabasics.practice.generics;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class GenericTests {

    @Test
    void getMaxOfTest() {
        Math<Double> test = new Math();
        Double result = test.getMaxOf(36.0, 2.0, 3.0);
        Assertions.assertEquals(36.0, result.doubleValue());
      // Assertions.assertEquals(44.0, test.getMaxOf(36.0, 44.0, 3.0));
       // Assertions.assertEquals(54.0, test.getMaxOf(36.0, 2., 54.0));

    }



}
