import com.rakovets.course.java.core.practice.string.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {

    //TEST_TASK_1
    static Stream<Arguments> concatProviderArguments() {
        return Stream.of(
                Arguments.of("HelloJava", "Hello", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", ""),
                Arguments.of(null, "Hello", null),
                Arguments.of(null, null, "Java")
        );
    }

    @ParameterizedTest
    @MethodSource("concatProviderArguments")
    void getConcatResult(String expectedString, String str1, String str2) {
        // WHEN
        String actualString = StringUtil.getConcatResult(str1, str2);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //TEST_TASK_2
    static Stream<Arguments> getIndexProviderArguments() {
        return Stream.of(
                Arguments.of(-1, null, "v"),
                Arguments.of(2, "Java", "v"),
                Arguments.of(-1, "Hello", "x"),
                Arguments.of(-1, "", "p"),
                Arguments.of(-1, "Hello", "0"),
                Arguments.of(1, "103", "0")
                //   Arguments.of(-1, "Hello", '0'),
                //   Arguments.of(-1, null, '0')
        );
    }

    @ParameterizedTest
    @MethodSource("getIndexProviderArguments")
    void getIndex(int expectedInt, String str1, char x) {
        // WHEN
        int actualInt = StringUtil.getIndex(str1, x);

        // THAT
        Assertions.assertEquals(expectedInt, actualInt);
    }

    //TEST_TASK_3: Определить, являются ли две строки одинаковыми учитывая регистр.
    static Stream<Arguments> isSameProviderArguments() {
        return Stream.of(
                Arguments.of(true, "Bulbasaur", "Bulbasaur"),
                Arguments.of(false, "Bulbasaur", null),
                Arguments.of(false, null, "Bulbasaur"),
                Arguments.of(false, null, null),
                Arguments.of(false, "Bulbasaur", "Pikachu"),
                Arguments.of(false, "BULBASAUR", "bulbasaur"),
                Arguments.of(false, "bulbasaur", "BULBASAUR"),
                Arguments.of(false, "Pikachu", "bulbasaur"),
                Arguments.of(false, "", "bulbasaur"),
                Arguments.of(false, "Pikachu", ""),
                Arguments.of(true, "", "")
        );
    }

    @ParameterizedTest
    @MethodSource("isSameProviderArguments")
    void isSame(boolean expectedBoolean, String str1, String str2) {
        // WHEN
        boolean actualBoolean = StringUtil.isSame(str1, str2);

        // THAT
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    //TASK_4: В строке удалить пробелы в начале и конце. Сделать что бы вся строка состояла из прописных букв.
    static Stream<Arguments> cutSpacesLowerCaseProviderArguments() {
        return Stream.of(
                Arguments.of("EMPEROR", " emperor "),
                Arguments.of("EMPEROR", "emperor "),
                Arguments.of("EMPEROR", "      emperor"),
                Arguments.of("EMPEROR", "emperor     "),
                Arguments.of("EMPEROR", "      emperor      "),
                Arguments.of("EMPEROR", " eMPEROr "),
                Arguments.of(null, null),
                Arguments.of("EMPEROR OF MINDKIND", "   EMpEROr of minDkinD   "),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("cutSpacesLowerCaseProviderArguments")
    void cutSpacesLowerCase(String expectedString, String str1) {
        // WHEN
        String actualString = StringUtil.cutSpacesLowerCase(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //TASK_5: Из строки извлечь подстроку начиная с 10 символа. Новая строка должна быть не более 23 символов.
    static Stream<Arguments> getTenIndexProviderArguments() {
        return Stream.of(
                Arguments.of(null, "Tau"),
                Arguments.of(null, null),
                Arguments.of("echanicus", "Adeptus Mechanicus"),
                Arguments.of("s", "Mechanicus"),
                Arguments.of("h", "Kelermorph"),
                Arguments.of("startes, are superhuman", "Adeptus Astartes, are superhuman warriors who fight for the Imperium of Man"),
                Arguments.of(null, "", "")
        );
    }

    @ParameterizedTest
    @MethodSource("getTenIndexProviderArguments")
    void getTenIndex(String expectedString, String str1) {
        // WHEN
        String actualString = StringUtil.getTenIndex(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //TASK_6: Заменить все грустные *emoji* `:(` в строке на весёлые `:)`.
    static Stream<Arguments> getReplaceProviderArguments() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of(":)", ":("),
                Arguments.of("Walking on lawns is bad :)", "Walking on lawns is bad :("),
                Arguments.of(":)::)(:)(", ":(::((:((")
        );
    }

    @ParameterizedTest
    @MethodSource("getReplaceProviderArguments")
    void getReplace(String expectedString, String str1) {
        // WHEN
        String actualString = StringUtil.getReplace(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //TASK_7:Написать метод принимающий 2 параметра(String, word), возвращающий true, если строка начинается и заканчивается этим словом, иначе false
    static Stream<Arguments> isWordStartAndLastProviderArguments() {
        return Stream.of(
                Arguments.of(false, null, null),
                Arguments.of(false, "business is business", null),
                Arguments.of(false, null, "business"),
                Arguments.of(true, "business is business", "business is business", "business"),
                Arguments.of(false, "that business is business", "business"),
                Arguments.of(false, "business is business, noob", "business"),
                Arguments.of(true, "", "")
        );
    }

    @ParameterizedTest
    @MethodSource("isWordStartAndLastProviderArguments")
    void isWordStartAndLast(boolean expectedBoolean, String str1, String word) {
        // WHEN
        boolean actualBoolean = StringUtil.isWordStartAndLast(str1, word);

        // THAT
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    //TASK_8: Определить, сколько гласных букв в предложении.
    static Stream<Arguments> getVowelsProviderArguments() {
        return Stream.of(
                Arguments.of(33, "The Adeptus Astartes are one of the most elite and feared fighting forces in the Imperium of Man"),
                Arguments.of(-1, null),
                Arguments.of(0, "sntns wtht vwls"),
                Arguments.of(0, "24233234324"),
                Arguments.of(5, "FOR THE EMPEROR!!!"),
                Arguments.of(0, "")
        );
    }

    @ParameterizedTest
    @MethodSource("getVowelsProviderArguments")
    void getVowels(int expectedInt, String str1) {
        // WHEN
        int actualInt = StringUtil.getVowels(str1);

        // THAT
        Assertions.assertEquals(expectedInt, actualInt);
    }

    //TASK_9: Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
    static Stream<Arguments> getNumberOfDotsCommasExclamationMarksProviderArguments() {
        return Stream.of(
                Arguments.of(6, "Bulbasaur! He has red eyes with white pupils, pointed, ear-like structures on top of its head, " +
                        "and a short, blunt snout with a wide mouth."),
                Arguments.of(-1, null),
                Arguments.of(0, "On Bulbasaur's back is a green plant bulb"),
                Arguments.of(0, "123456"),
                Arguments.of(5, "BULBASAUR, I CHOOSE YOU!!!."),
                Arguments.of(0, "")
        );
    }

    @ParameterizedTest
    @MethodSource("getNumberOfDotsCommasExclamationMarksProviderArguments")
    void getNumberOfDotsCommasExclamationMarks(int expectedInt, String str1) {
        // WHEN
        int actualInt = StringUtil.getNumberOfDotsCommasExclamationMarks(str1);

        // THAT
        Assertions.assertEquals(expectedInt, actualInt);
    }

    //task_10: Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
    static Stream<Arguments> isPalindromeProviderArguments() {
        return Stream.of(
                Arguments.of(false, null),
                Arguments.of(false, "Дзирайя"),
                Arguments.of(true, "топот"),
                Arguments.of(true, "а роза упала на лапу Азора"),
                Arguments.of(false, "123456"),
                Arguments.of(true, "12321")
        );
    }

    @ParameterizedTest
    @MethodSource("isPalindromeProviderArguments")
    void isPalindrome(boolean expectedBoolean, String str1) {
        // WHEN
        boolean actualBoolean = StringUtil.isPalindrome(str1);

        // THAT
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }

    //TASK_11: Разбить строку на равные части по n символов и сохранить отдельные части в массив. Вывести этот массив.
    static Stream<Arguments> partsToArrayProviderArguments() {
        return Stream.of(
                Arguments.of(new String[]{"abcd", "efgh", "ijkl"}, "abcdefghijkl", 4),
                Arguments.of(null, null, 3),
                Arguments.of(null, "Venusaur is a squat, quadrupedal Pokémon with bumpy, blue-green skin", 0),
                Arguments.of(new String[]{"s"}, "s", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("partsToArrayProviderArguments")
    void partsToArray(String[] expectedString, String str1, int n) {
        // WHEN
        String[] actualString = StringUtil.partsToArray(str1, n);

        // THAT
        Assertions.assertArrayEquals(expectedString, actualString);
    }

    //TASK_12: Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
    static Stream<Arguments> wordsCountProviderArguments() {
        return Stream.of(
                Arguments.of(14, "Venusaur uses its flower to catch the sun's rays to convert them into energy"),
                Arguments.of(-1, null),
                Arguments.of(9, "Frenzy Plant was     its signature   move in   the past."),
                Arguments.of(-1, "")
                );
    }

    @ParameterizedTest
    @MethodSource("wordsCountProviderArguments")
    void wordsCount(int expectedInt, String str1) {
        // WHEN
        int actualInt = StringUtil.wordsCount(str1);

        // THAT
        Assertions.assertEquals(expectedInt, actualInt);
    }

    //TASK_13: Дано имя, фамилия и отчество. Вернуть инициалы в формате Ф.И.О.
    // Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
    static Stream<Arguments> getInitialsProviderArguments() {
        return Stream.of(
                Arguments.of("G S V", "Sergey Grinkevich Vitalyevich"),
                Arguments.of(null, null),
                Arguments.of(null, ""),
                Arguments.of("L E J", "el lion jonson")
       );
    }

    @ParameterizedTest
    @MethodSource("getInitialsProviderArguments")
    void getInitials(String  expectedString, String str1) {
        // WHEN
        String  actualString = StringUtil.getInitials(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //TASK_14:  Вернуть строку, которая содержит все имеющиеся в тексте цифры.
    static Stream<Arguments> getDigitsProviderArguments() {
        return Stream.of(
                Arguments.of("1", "1st Legion of the Emperor!"),
                Arguments.of(null, null),
                Arguments.of(null, ""),
                Arguments.of("123", "123"),
                Arguments.of("", "Heretics must burn!")
        );
    }

    @ParameterizedTest
    @MethodSource("getDigitsProviderArguments")
    void getDigits(String  expectedString, String str1) {
        // WHEN
        String  actualString = StringUtil.getDigits(str1);

        // THAT
        Assertions.assertEquals(expectedString, actualString);
    }

    //TASK_16: Заданы два массива строк. Определить, является ли содержимое этих массивов идентичным. Порядок расположения элементов значения не имеет.
    static Stream<Arguments> matchStringArraysProviderArguments() {
        return Stream.of(
                Arguments.of(true, new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}),
                Arguments.of(true, new String[]{"a", "b", "c"}, new String[]{"b", "a", "c"}),
                Arguments.of(false, new String[]{"A", "B", "C"}, new String[]{"a", "b", "c"}),
                Arguments.of(false, null, new String[]{"a", "b", "c"}),
                Arguments.of(false, new String[]{"a", "b", "c"},  null)
        );
    }

    @ParameterizedTest
    @MethodSource("matchStringArraysProviderArguments")
    void matchStringArrays(boolean expectedBoolean, String[] str1, String[] str2) {
        // WHEN
        boolean actualBoolean = StringUtil.matchStringArrays(str1, str2);

        // THAT
        Assertions.assertEquals(expectedBoolean, actualBoolean);
    }
}
