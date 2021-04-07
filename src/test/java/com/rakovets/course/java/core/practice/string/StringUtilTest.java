package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
   static  StringUtil stringUtil;

   @BeforeEach
    void beforeEach (){
       stringUtil = new StringUtil();
   }

   static Stream<Arguments> provideArgumentsForGlue() {
       return Stream.of(
                Arguments.of("", "", ""),
                Arguments.of("", "123", "123"),
                Arguments.of("321", "", "321"),
                Arguments.of("321", "123", "321123")
            );
        }
    @ParameterizedTest(name = "Str1 - ''{0}'', Str2 ''{1}'', Expected: ''{2}''")
    @MethodSource("provideArgumentsForGlue")
    void glueTest (String str1, String str2, String expected){
        // WHEN
        String actual = stringUtil.glue(str1,str2);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForFindIndexOfSymbol() {
        return Stream.of(
                Arguments.of("C", "Coffee", 0),
                Arguments.of("f", "Coffee", 2),
                Arguments.of("e", "Coffee", 4),
                Arguments.of("c", "Coffee", -1)
        );
    }
    @ParameterizedTest(name = "Char - ''{0}'', Str - ''{1}'', Expected: ''{2}''")
    @MethodSource("provideArgumentsForFindIndexOfSymbol")
    void findIndexOfSymbolTest (char ch, String str2, int expected){
        // WHEN
        int actual = stringUtil.findIndexOfSymbol(ch,str2);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCompareLines() {
        return Stream.of(
                Arguments.of("Coffee", "Coffee", true),
                Arguments.of("coffee", "Coffee", false),
                Arguments.of("", "Coffee", false),
                Arguments.of("COFFEE", "Coffee", false)
        );
    }
    @ParameterizedTest(name = "Str1 - ''{0}'', Str - ''{1}'', Expected: ''{2}''")
    @MethodSource("provideArgumentsForCompareLines")
    void compareLinesTest (String str1, String str2, boolean expected){
        // WHEN
        boolean actual = stringUtil.compareLines(str1,str2);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCutAndLowerCase() {
        return Stream.of(
                Arguments.of("Coffee", "coffee"),
                Arguments.of(" Coffee ", "coffee"),
                Arguments.of(" Coffee", "coffee"),
                Arguments.of("Coffee ", "coffee"),
                Arguments.of(" coffee ", "coffee"),
                Arguments.of(" coffee", "coffee"),
                Arguments.of("coffee ", "coffee")
        );
    }
    @ParameterizedTest(name = "Str - ''{0}'', Expected: ''{1}''")
    @MethodSource("provideArgumentsForCutAndLowerCase")
    void cutAndLowerCaseTest (String str, String expected){
        // WHEN
        String  actual = stringUtil.cutAndLowerCase(str);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPieceExtraction() {
        return Stream.of(
                Arguments.of("Coffee", 3, 6, "fee"),
                Arguments.of(" Coffee", 3, 6, "ffe")

        );
    }
    @ParameterizedTest(name = "Str - ''{0}'', IndexBegin - ''{1}'', IndexEnd - ''{2}'', IndexEnd - ''{3}'',  Expected: ''{4}''")
    @MethodSource("provideArgumentsForPieceExtraction")
    void pieceExtractionTest (String str, int indexBegin, int indexEnd, String expected){
        // WHEN
        String  actual = stringUtil.pieceExtraction(str,indexBegin,indexEnd);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForReplaceEmoji() {
        return Stream.of(
                Arguments.of(":(Coffee", ":(", ":)", ":)Coffee"),
                Arguments.of("Coffee:(", ":(", ":)", "Coffee:)"),
                Arguments.of(":(Coffee:(", ":(", ":)", ":)Coffee:)")
        );
    }
    @ParameterizedTest(name = "Str - ''{0}'', Str2 - ''{1}'', Str3 - ''{2}'',  Expected: ''{3}''")
    @MethodSource("provideArgumentsForReplaceEmoji")
    void pieceExtractionTest (String str1, String str2, String str3, String expected){
        // WHEN
        String  actual = stringUtil.replaceEmoji(str1,str2, str3);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCorrectBegin() {
        return Stream.of(
                Arguments.of("I and you gonna drink coffee, just you and I", "I", true),
                Arguments.of("I and you gonna drink coffee or some tea?", "I", false),
                Arguments.of("Lets go to the zoo, just you and I", "I", false),
                Arguments.of("Lets go to the zoo", "I", false)
        );
    }
    @ParameterizedTest(name = "Text - ''{0}'', Word - ''{1}'', Expected: ''{2}''")
    @MethodSource("provideArgumentsForCorrectBegin")
    void correctBeginTest (String text, String word, boolean expected){
        // WHEN
        boolean actual = stringUtil.correctBegin(text, word);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForNumberOfEnglishVowelLetters() {
        return Stream.of(
                Arguments.of("Montecarlo", 4),
                Arguments.of("Mntcrl", 0)

        );
    }
    @ParameterizedTest(name = "Text - ''{0}'', Expected: ''{1}''")
    @MethodSource("provideArgumentsForNumberOfEnglishVowelLetters")
    void numberOfEnglishVowelLettersTest (String text, int expected){
        // WHEN
        int actual = stringUtil.numberOfEnglishVowelLetters(text);
        //THEN
        Assertions.assertEquals(expected, actual);
    }
}

