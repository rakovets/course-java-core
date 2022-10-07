package com.rakovets.course.java.core.practice.strings;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StringUtilTest {
    @Test
    void gluingText() {
        // GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        // WHEN
        String actual1 = stringUtil.gluingText("123", "456");
        String actual2 = stringUtil.gluingText("Tik", "Tok");
        String actual3 = stringUtil.gluingText("хлеб", "соль");

        //THEN
        Assertions.assertEquals("123456", actual1);
        Assertions.assertEquals("TikTok", actual2);
        Assertions.assertEquals("хлебсоль", actual3);
    }

    @Test
    void indexSymbol() {
        // GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        // WHEN
        int actual1 = stringUtil.indexSymbol("fake", 'e');
        int actual2 = stringUtil.indexSymbol("Boom-boom!", '-');
        int actual3 = stringUtil.indexSymbol("music", 'a');
        //THEN
        Assertions.assertEquals("3", actual1);
        Assertions.assertEquals("4", actual2);
        Assertions.assertEquals("-1", actual3);
    }

    @Test
    void identicalString() {
        // GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        // WHEN
        boolean actual1 = stringUtil.identicalString("123", "123");
        boolean actual2 = stringUtil.identicalString("123", "321");
        boolean actual3 = stringUtil.identicalString("123", "12");

        //THEN
        Assertions.assertEquals(true, actual1);
        Assertions.assertEquals(false, actual2);
        Assertions.assertEquals(false, actual3);
    }

    @Test
    void formattedString() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String actual1 = stringUtil.formattedString("CATcat ");
        String actual2 = stringUtil.formattedString(" HuMan ");
        String actual3 = stringUtil.formattedString("SUNNY");

        //THEN
        Assertions.assertEquals("catcat", actual1);
        Assertions.assertEquals("human", actual2);
        Assertions.assertEquals("sunny", actual3);
    }

    @Test
    void substring() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String actual1 = stringUtil.substring("Sunshine!", 'n', '!');
        String actual2 = stringUtil.substring("Wonderland", 'n', 'l');
        String actual3 = stringUtil.substring("123456789", '2', '8');

        //THEN
        Assertions.assertEquals("shine", actual1);
        Assertions.assertEquals("der", actual2);
        Assertions.assertEquals("34567", actual3);
    }

    @Test
    void changeSmile() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String actual = stringUtil.changeSmile(":(");

        //THEN
        Assertions.assertEquals(":)", actual);
    }

    @Test
    void sameStartEnd() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        boolean actual1 = stringUtil.sameStartEnd("Cat go home", "home");
        boolean actual2 = stringUtil.sameStartEnd("To be or not to be", "be");
        boolean actual3 = stringUtil.sameStartEnd("red white red", "red");

        //THEN
        Assertions.assertEquals(false, actual1);
        Assertions.assertEquals(false, actual2);
        Assertions.assertEquals(true, actual3);
    }

    @Test
    void numberEnglishVowels() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        int actual1 = stringUtil.numberEnglishVowels("Lays");
        int actual2 = stringUtil.numberEnglishVowels("Pepsi");
        int actual3 = stringUtil.numberEnglishVowels("Coca-colA");

        //THEN
        Assertions.assertEquals("2", actual1);
        Assertions.assertEquals("2", actual2);
        Assertions.assertEquals("4", actual3);
    }

    @Test
    void numberPunctuation() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        int actual1 = stringUtil.numberPunctuation("klcv,nddf.db");
        int actual2 = stringUtil.numberPunctuation("dn,,advs???");
        int actual3 = stringUtil.numberPunctuation(".,:(?!?)");

        //THEN
        Assertions.assertEquals("2", actual1);
        Assertions.assertEquals("5", actual2);
        Assertions.assertEquals("8", actual3);
    }

    @Test
    void palindrome() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        boolean actual1 = stringUtil.palindrome("sos");
        boolean actual2 = stringUtil.palindrome("cola");
        boolean actual3 = stringUtil.palindrome("level");

        //THEN
        Assertions.assertEquals(true, actual1);
        Assertions.assertEquals(false, actual2);
        Assertions.assertEquals(true, actual3);

    }

    @Test
    void brokenLine() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String[] actual1 = stringUtil.brokenLine("Terminator", 2);
        String[] actual2 = stringUtil.brokenLine("Terminator", 3);
        String[] actual3 = stringUtil.brokenLine("Terminator", 5);

        //THEN
        Assertions.assertEquals("[Te rm in at or]", actual1);
        Assertions.assertEquals("[Ter min ato r]", actual2);
        Assertions.assertEquals("[Termi nator]", actual3);
    }

    @Test
    void wordCount() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        int actual1 = stringUtil.wordCount("Тварь ли я дрожащая или   право имею");
        int actual2 = stringUtil.wordCount("Кабы не выло зимы");
        int actual3 = stringUtil.wordCount("Знаешь ли ты, вдоль ночных дорог");

        //THEN
        Assertions.assertEquals("7", actual1);
        Assertions.assertEquals("4", actual2);
        Assertions.assertEquals("6", actual3);
    }

    @Test
    void writeInitials() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String actual1 = stringUtil.writeInitials("Elena Shalokha");
        String actual2 = stringUtil.writeInitials("Bred Pitt");
        String actual3 = stringUtil.writeInitials("Angelina Jolie");

        //THEN
        Assertions.assertEquals("ES", actual1);
        Assertions.assertEquals("BP", actual2);
        Assertions.assertEquals("AJ", actual3);
    }

    @Test
    void returnNumber() {
        //GIVEN
        com.rakovets.course.java.core.practice.strings.StringUtil stringUtil = new com.rakovets.course.java.core.practice.strings.StringUtil();
        //WHEN
        String actual1 = stringUtil.returnNumber("I have 2 apples, 4 orange and 5 bananas");
        String actual2 = stringUtil.returnNumber("I have 1 apples, 1 orange and 1 bananas");
        String actual3 = stringUtil.returnNumber("I have 9 apples, 8 orange");

        //THEN
        Assertions.assertEquals("245", actual1);
        Assertions.assertEquals("111", actual2);
        Assertions.assertEquals("98", actual3);
    }
}