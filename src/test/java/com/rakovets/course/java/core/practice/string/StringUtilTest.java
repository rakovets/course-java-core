package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @BeforeEach
   /* void setUp(){
        String str1 = "123";
        String str2 = "345";
        StringUtil stringUtil = new StringUtil();
    } */

    @Test
    void glueTest (){
        //GIVEN
        String str1 = "123";
        String str2 = "345";
        StringUtil stringUtil = new StringUtil();

        // WHEN
        String actual = stringUtil.glue(str1,str2);

        //THEN
        Assertions.assertEquals("123345", actual);
    }
}
