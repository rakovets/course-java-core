package com.rakovets.course.javabasics.practice.generics;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class GenericTests {

    @Test
    void getMaxOfTest() {
        Math<Double> test = new Math();

        Assertions.assertEquals(36.0, test.getMaxOf(36.0, 2.0, 3.0).doubleValue());
      // Assertions.assertEquals(44.0, test.getMaxOf(36.0, 44.0, 3.0));
       // Assertions.assertEquals(54.0, test.getMaxOf(36.0, 2., 54.0));

    }
    @Test

    void getMinOfTest(){
        Math<Double> test = new Math();
        Assertions.assertEquals(1.5, test.getMinOf(1.5, 12.0, 22.0, 33.0, 14.0).doubleValue());

    }


}
