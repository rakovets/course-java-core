package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    static Stream<Arguments> provideArgumentsForStringGluing() {
        return Stream.of(
                Arguments.of("asd", "dsa", "asddsa"),
                Arguments.of("11w", "221", "11w221"),
                Arguments.of("0 0", "-_-", "0 0-_-"),
                Arguments.of("   ", "   ", "      "),
                Arguments.of("asd", "!!!", "asd!!!")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForStringGluing")
    void testStringGluing(String str1, String str2, String expected) {
        String actual = stringUtil.stringGluing(str1, str2);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForFindingIndex() {
        return Stream.of(
                Arguments.of("asdfgh", 'z', -1),
                Arguments.of("11wasd2aasd", '2', 6),
                Arguments.of("asd  fgh", 'f', 5),
                Arguments.of("Boom-Boom!", '-', 4),
                Arguments.of("Tip top", ' ', 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFindingIndex")
    void testFindingIndex(String str, char symbol, int expected) {
        int actual = stringUtil.findingIndex(str, symbol);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForStringComparison() {
        return Stream.of(
                Arguments.of("Hi, Jack", "Hi, Jack!", false),
                Arguments.of("Hi Jack", "Hi jack", false),
                Arguments.of("Hi, Jack!", "Hi, Jack!", true),
                Arguments.of("oOoOoOoOo", "oOoOoOoOo", true),
                Arguments.of("135792468asd", "135792468asd", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForStringComparison")
    void testStringComparison(String str1, String str2, boolean expected) {
        boolean actual = stringUtil.stringComparison(str1, str2);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForRemoveSpaceAndUpperCase() {
        return Stream.of(
                Arguments.of(" In a hole  ", "IN A HOLE"),
                Arguments.of("  in The    ", "IN THE"),
                Arguments.of("    gRoUnD  ", "GROUND"),
                Arguments.of(" there lIVED", "THERE LIVED"),
                Arguments.of("a hoBBit.   ", "A HOBBIT.")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForRemoveSpaceAndUpperCase")
    void testRemoveSpaceAndUpperCase(String str, String expected) {
        String actual = stringUtil.removeSpaceAndUpperСase(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForRemoveSubstring() {
        return Stream.of(
                Arguments.of("Infinite space!", 'n', 's', "nfinite "),
                Arguments.of("Hot-dog!", 'd', '!', "dog"),
                Arguments.of("Agrrrrrr", 'A', 'r', "Ag"),
                Arguments.of("dew600544a", '6', 'a', "600544"),
                Arguments.of("Not a good day!", 'g', '!', "good day")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForRemoveSubstring")
    void testExtractSubstring(String str, char n, char m, String expected) {
        String actual = stringUtil.removeSubstring(str, n, m);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForReplaceSmile() {
        return Stream.of(
                Arguments.of(":(:(:(", ":):):)"),
                Arguments.of(":(Smile:(", ":)Smile:)"),
                Arguments.of("Good morning!:(:)", "Good morning!:):)"),
                Arguments.of("(asd:(", "(asd:)"),
                Arguments.of("(((:())", "(((:)))")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReplaceSmile")
    void testReplaceSmile(String str, String expected) {
        String actual = stringUtil.replaceSmile(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSearchWordInText() {
        return Stream.of(
                Arguments.of("Hi, Rick! Hi", "Hi", true),
                Arguments.of("Hi Rick! hi", "HI", true),
                Arguments.of("Stay cool, stay cool.", "cool", false),
                Arguments.of("This is Sparta!", "Sparta", false),
                Arguments.of("okay, okay, okay", "okay", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSearchWordInText")
    void testSearchWordInText(String text, String word, boolean expected) {
        boolean actual = stringUtil.searchWordInText(text, word);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCountNumberEnglishVowels() {
        return Stream.of(
                Arguments.of("But eyes are blind. You have to look with the heart.", 19),
                Arguments.of("Who cares for you? You're nothing but a pack of cards!", 18),
                Arguments.of("Imagination is the only weapon in the war against reality.", 23),
                Arguments.of("May the force be with you.", 10),
                Arguments.of("Life is like a box of chocolates, you never know what you’re gonna get.", 26)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCountNumberEnglishVowels")
    void testCountNumberEnglishVowels(String str, int expected) {
        int actual = stringUtil.countNumberEnglishVowels(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSymbolCounter() {
        return Stream.of(
                Arguments.of("???To be or not to be, that is the question.", 5),
                Arguments.of("Don’t.worry.be.happy!", 4),
                Arguments.of("!Take! !it! !easy!", 6),
                Arguments.of(",,,when the pigs fly...", 6),
                Arguments.of("Better ?!?!? than ?!?!?.", 11)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSymbolCounter")
    void testSymbolCounter(String str, int expected) {
        int actual = stringUtil.symbolCounter(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCheckPalindrome() {
        return Stream.of(
                Arguments.of("Race fast safe car", true),
                Arguments.of("Success is the child of audacity", false),
                Arguments.of("Pull up if I pull up", true),
                Arguments.of("102000201", true),
                Arguments.of("Palindrome", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCheckPalindrome")
    void testCheckPalindrome(String str, boolean expected) {
        boolean actual = stringUtil.checkPalindrome(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSplitStringApartOnNumberCharacters() {
        return Stream.of(
                Arguments.of("Change the world by being yourself", 3, "[Cha, nge,  th, e w, orl, d b, y b, ein, g y, our, sel, f]"),
                Arguments.of("Every moment is a fresh beginning", 5, "[Every,  mome, nt is,  a fr, esh b, eginn, ing]"),
                Arguments.of("Whatever you do, do it well", 7, "[Whateve, r you d, o, do i, t well]"),
                Arguments.of("What we think, we become", 4, "[What,  we , thin, k, w, e be, come]"),
                Arguments.of("Reality is wrong, dreams are for real", 6, "[Realit, y is w, rong, , dreams,  are f, or rea, l]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSplitStringApartOnNumberCharacters")
    void testSplitStringApartOnNumberCharacters(String str, int n, String expected) {
        String actual = stringUtil.splitStringApartOnNumberCharacters(str, n);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForWordCount() {
        return Stream.of(
                Arguments.of("Change the world by being yourself", 6),
                Arguments.of("Every moment is a fresh beginning", 6),
                Arguments.of("Whatever you do, do it well", 6),
                Arguments.of("What we think, we become", 5),
                Arguments.of("Reality is wrong, dreams are for real", 7)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForWordCount")
    void testWordCount(String str, int expected) {
        int actual = stringUtil.wordCount(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForWriteInitials() {
        return Stream.of(
                Arguments.of("AsumA Sarutobi", "AS"),
                Arguments.of("Zabuza Momochi", "ZM"),
                Arguments.of("Kakashi haTakE", "KH"),
                Arguments.of("Maito GAi", "MG"),
                Arguments.of("rOkKu Ri", "RR")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForWriteInitials")
    void testWriteInitials(String str, String  expected) {
        String actual = stringUtil.writeInitials(str);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForReturnNumber() {
        return Stream.of(
                Arguments.of("asd111", "111"),
                Arguments.of("a12aa v33v 2", "12332"),
                Arguments.of("100 b 2 asd2 aa", "10022"),
                Arguments.of("0asd asd OOOO", "0"),
                Arguments.of("He110 W0r1d!", "11001")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReturnNumber")
    void testReturnNumber(String str,String expected) {
        String actual = stringUtil.returnNumber(str);

        Assertions.assertEquals(expected, actual);
    }
}
