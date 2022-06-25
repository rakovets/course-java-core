package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();
    @Test
    void testJoinTwoStrings() {
        //Given
        String expected = "Done";
        //When
        String actual = stringUtil.joinTwoStrings("Do","ne");
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void  testFindIndex(){
        //Given
        int expected = 0;
        //When
        int actual = stringUtil.findIndex("distance","d");
        //Then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFindMissingCharIndex () {
        //Given
        int expected = -1;
        //When
        int actual = stringUtil.findIndex("distance", "l");
        //Then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFindMiddleIndex () {
        //Given
        int expected = 4;
        //When
        int actual = stringUtil.findIndex("distance","a");
        //Then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testCompareStrings (String string1, String string2, boolean expected){
        //When
       boolean actual = stringUtil.compareTwoStrings(string1, string2);
       //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCompareTwoStrings (){
        testCompareStrings("any","any", true);
    }

    @Test
    void testCompareTwoStringsDifferentRegister (){
        testCompareStrings("any","Any", false);
    }
    @Test
    void testCompareTwoStringsOneEmpty (){
        testCompareStrings("","any", false);
    }
    @Test
    void testCompareTwoStringsOneNull (){
        testCompareStrings("null","any", false);
    }

}
