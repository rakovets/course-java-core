package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
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
                Arguments.of("MOntEcarlo", 4),
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

    static Stream<Arguments> provideArgumentsForNumberOfPunctuationMarks() {
        return Stream.of(
                Arguments.of("Montecarlo, alcantara!? to mutch...", 6),
                Arguments.of("!asdwe!asdadqwed!/asdasd", 3),
                Arguments.of("Mntcrl", 0)

        );
    }
    @ParameterizedTest(name = "Text - ''{0}'', Expected: ''{1}''")
    @MethodSource("provideArgumentsForNumberOfPunctuationMarks")
    void numberOfPunctuationMarksTest (String text, int expected){
        // WHEN
        int actual = stringUtil.numberOfPunktuationMarks(text);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPalindromChekOut() {
        return Stream.of(
                Arguments.of("deed", true),
                Arguments.of("Do geese see God",true),
                Arguments.of("Mntcrl", false)

        );
    }
    @ParameterizedTest(name = "Text - ''{0}'', Expected: ''{1}''")
    @MethodSource("provideArgumentsForPalindromChekOut")
    void palindromChekOutTest (String text, boolean expected){
        // WHEN
        boolean actual = stringUtil.palindromChekOut(text);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSplitText() {
        return Stream.of(
                Arguments.of("OneTwoThreeFourFiveSixSeven", 3, new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven"}),
                Arguments.of("123456",1, new String[]{"1", "2", "3", "4", "5", "6"}),
                Arguments.of("12345", 2, new String[]{"12", "34", "5 "})
        );
    }
    @ParameterizedTest(name = "Text - ''{0}'', NumberOfChars - ''{2}'', Expected: ''{2}''")
    @MethodSource("provideArgumentsForSplitText")
    void splitTextTest (String text, int numberSymbols, String[] expected){
        // WHEN
        String[] actual = stringUtil.splitText(text,numberSymbols);
        //THEN
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    static Stream<Arguments> provideArgumentsForNumberOfWords() {
        return Stream.of(
                Arguments.of("She sells sea shells on the sea shore", 8),
                Arguments.of("1111 2222 3333 4444 5555 6666", 0),
                Arguments.of("I am", 2),
                Arguments.of("My present 4 you", 3)
        );
    }
    @ParameterizedTest(name = "Text - ''{0}'', Expected: ''{1}''")
    @MethodSource("provideArgumentsForNumberOfWords")
    void numberOfWordsTest (String text, int expected){
        // WHEN
        int actual = stringUtil.numberOfWords(text);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetFirstLetters() {
        return Stream.of(
                Arguments.of("Bozhen Davydov", "BD"),
                Arguments.of("bozhen Davydov", "BD"),
                Arguments.of("Bozhen davydov", "BD"),
                Arguments.of("bozhen davydov", "BD")
        );
    }
    @ParameterizedTest(name = "Text - ''{0}'', Expected: ''{1}''")
    @MethodSource("provideArgumentsForGetFirstLetters")
    void getFirstLettersTest (String text, String expected){
        // WHEN
        String actual = stringUtil.getFirstLetters(text);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetAllNumbers() {
        return Stream.of(
                Arguments.of("Bozhen12 Davy4dov5", "1245"),
                Arguments.of("12 bozhen3 Dav4ydo5v6", "123456"),
                Arguments.of("12 34 56 78", "12345678")
        );
    }
    @ParameterizedTest(name = "Text - ''{0}'', Expected: ''{1}''")
    @MethodSource("provideArgumentsForGetAllNumbers")
    void getAllNumbersTest (String text, String expected){
        // WHEN
        String actual = stringUtil.getAllNumbers(text);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetUniqueSymbols() {
        return Stream.of(
                Arguments.of("radio", "video", "rave"),
                Arguments.of("RADIO", "radio", "RADIOradio"),
                Arguments.of("information", "motivation", "frnvt")
        );
    }
    @ParameterizedTest(name = "FirsWord - ''{0}'', SecondWord - ''{1}'', Expected: ''{2}''")
    @MethodSource("provideArgumentsForGetUniqueSymbols")
    void getUniqueSymbolsTest(String firstWord, String secondWord, String expected) {
        // WHEN
        String actual = stringUtil.getUniqueSymbols(firstWord, secondWord);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForIsSameArrays() {
        return Stream.of(
                Arguments.of(new String[]{"1", "2", "3", "4"}, new String[]{"1", "2", "3", "4"}, true),
                Arguments.of(new String[]{"1", "3", "2", "4"}, new String[]{"1", "2", "3", "4"}, true),
                Arguments.of(new String[]{"1", "2", "4", "4"}, new String[]{"1", "4", "2", "4"}, true),
                Arguments.of(new String[]{"1", "2", "3", "4"}, new String[]{"1", "2", "3", "5"}, false)
        );
    }
    @ParameterizedTest(name = "FirsArray - ''{0}'', SecondArray - ''{1}'', Expected: ''{2}''")
    @MethodSource("provideArgumentsForIsSameArrays")
    void isSameArraysTest(String[] arrOnes, String[] arrTwos, boolean expected) {
        // WHEN
        boolean actual = stringUtil.isSameArrays(arrOnes, arrTwos);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForReplaceSameSymbols() {
        return Stream.of(
                Arguments.of("Jaaaavvaaaaaaa", "Java"),
                Arguments.of("AAAbbbsssstttttrrraaccccccttionnnn", "Abstraction"),
                Arguments.of("11111122222333333444444455555", "12345")
        );
    }
    @ParameterizedTest(name = "Str - ''{0}'', Expected: ''{1}''")
    @MethodSource("provideArgumentsForReplaceSameSymbols")
    void replaceSameSymbolsTest(String str, String expected) {
        // WHEN
        String actual = stringUtil.replaceSameSymbols(str);
        //THEN
        Assertions.assertEquals(expected, actual);
    }
}

