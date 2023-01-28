package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ObscureTest {
    private Obscure<Double> obscureDouble;
    private Obscure<String> obscureString;
    private Obscure<Integer> obscureInteger;

    @Test
    public void isEmptyTest1() {
        obscureString = new Obscure<>("");

        Assertions.assertTrue(obscureString.isEmpty());
    }

    @Test
    public void isEmptyTest2() {
        obscureInteger = new Obscure<>(111111);

        Assertions.assertFalse(obscureInteger.isEmpty());
    }

    @Test
    public void isEmptyTest3() {
        obscureDouble = new Obscure<>(12.333);

        Assertions.assertFalse(obscureDouble.isEmpty());
    }

    @Test
    public void isEmptyTest4() {
        obscureString = new Obscure<>("12.333");

        Assertions.assertFalse(obscureString.isEmpty());
    }

    @Test
    public void isPresentTest1() {
        obscureString = new Obscure<>("Hello");

        Assertions.assertTrue(obscureString.isPresent());
    }

    @Test
    public void isPresentTest2() {
        obscureString = new Obscure<>(null);

        Assertions.assertFalse(obscureString.isPresent());
    }

    @Test
    public void isPresentTest3() {
        obscureInteger = new Obscure<>(2222);

        Assertions.assertTrue(obscureInteger.isPresent());
    }

    @Test
    public void isPresentTest4() {
        obscureDouble = new Obscure<>(11.22);

        Assertions.assertTrue(obscureDouble.isPresent());
    }

    @Test
    public void orElseTest1() {
        obscureString = new Obscure<>(null);
        String object = "11111";

        Assertions.assertEquals(object, obscureString.orElse(object));
    }

    @Test
    public void orElseTest2() {
        obscureInteger = new Obscure<>(null);
        Integer object = 1111;

        Assertions.assertEquals(object, obscureInteger.orElse(object));
    }

    @Test
    public void orElseTest3() {
        obscureString = new Obscure<>("Hello generic");
        String object = "11111";

        Assertions.assertEquals("Hello generic", obscureString.orElse(object));
    }

    @Test
    public void orElseTest4() {
        obscureInteger = new Obscure<>(298);
        Integer object = 1111;

        Assertions.assertEquals(298, obscureInteger.orElse(object));
    }

    @Test
    public void orElseTest5() {
        obscureDouble = new Obscure<>(2.8);
        Double object = 3.33;

        Assertions.assertEquals(2.8, obscureDouble.orElse(object));
    }

    @Test
    public void orElseTest6() {
        obscureDouble = new Obscure<>(null);
        Double object = 3.33;

        Assertions.assertEquals(3.33, obscureDouble.orElse(object));
    }

    @Test
    public void orElseThrow() {
        obscureString = new Obscure<>(null);

     //   obscureString.orElseThrow(NumberFormatException);


      //  Executable executable = () -> obscureString.orElseThrow();

     //   Assertions.assertThrows(NullPointerException.class, executable);
    }



}
