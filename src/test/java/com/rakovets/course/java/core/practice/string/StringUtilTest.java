package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
@Test
void glueTest() {
    //GIVEN
    StringUtil stringUtil = new StringUtil();

    //WHEN
    String actual = stringUtil.glue ("123","456");

    //THEN
    Assertions.assertEquals ("123456", actual);
}

}
