package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
     void testConcatenate(){
        //GIVE
        StringUtil stringUtil = new StringUtil();
        String expected = "test";
        //WHEN
        String actual = stringUtil.concatenate("te", "st");
        //THEN
        Assertions.assertEquals(expected,actual);
    }
}
