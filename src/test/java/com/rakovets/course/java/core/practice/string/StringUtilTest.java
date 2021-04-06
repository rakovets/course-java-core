package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    static StringUtil stringUtil;

    @BeforeAll
    static void beForAll() {
        stringUtil = new StringUtil();
    }

@Test

    void concatenateTest() {

        String actual = stringUtil.stringConcatenate("123", "3424");
    Assertions.assertEquals("1233424", actual);
    }
}
