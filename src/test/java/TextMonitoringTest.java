

import com.rakovets.course.java.core.practice.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TextMonitoringTest {
    TextMonitoring textMonitoring = new TextMonitoring();

    @BeforeEach
    public void init() {
        textMonitoring.researchText("Java C++ Java, JAVA, Python, Java");
    }

    @Test
    static Stream<Arguments> researchTextTestProviderArguments() {
        return Stream.of(
                Arguments.of(3, "Java"),
                Arguments.of(1, "C++"),
                Arguments.of(1, "JAVA"),
                Arguments.of(1, "Python")
        );
    }

    @ParameterizedTest
    @MethodSource("researchTextTestProviderArguments")
    public void researchTextTest(int expectedValue, String key) {
        Assertions.assertEquals(expectedValue, textMonitoring.getMap().get(key));
    }

    @Test
    static Stream<Arguments> getCountUniqueWordsTestProviderArguments() {
        return Stream.of(
                Arguments.of(4, "Java C++ Java, JAVA, Python, Java"),
                Arguments.of(1, "C++"),
                Arguments.of(0, " "),
                Arguments.of(1, "Java-Java")
        );
    }

    @ParameterizedTest
    @MethodSource("getCountUniqueWordsTestProviderArguments")
    public void getCountUniqueWordsTest(int expectedValue, String text) {
        textMonitoring.researchText(text);
        Assertions.assertEquals(expectedValue, textMonitoring.getCountUniqueWords());
    }

    @Test
    static Stream<Arguments> getFrequencyWordTestProviderArguments() {
        return Stream.of(
                Arguments.of(3, "Java"),
                Arguments.of(1, "C++"),
                Arguments.of(1, "JAVA"),
                Arguments.of(1, "Python")
        );
    }

    @ParameterizedTest
    @MethodSource("getFrequencyWordTestProviderArguments")
    public void getFrequencyWordTest(int expectedValue, String text) {
        Assertions.assertEquals(expectedValue, textMonitoring.getFrequencyWord(text));
    }

    @Test
    static Stream<Arguments> getFrequencyWordsTestProviderArguments() {
        return Stream.of(
                Arguments.of("[JAVA=1, C++=1, Python=1, Java=3]", true),
                Arguments.of("[Java=3, Python=1, C++=1, JAVA=1]", false)

        );
    }

    @ParameterizedTest
    @MethodSource("getFrequencyWordsTestProviderArguments")
    public void getFrequencyWordsTest(String expectedValue, boolean status) {
        Map<String, Integer> map = textMonitoring.getFrequencyWords(status);
        Assertions.assertEquals(expectedValue, map.entrySet().toString());
    }

    @Test
    static Stream<Arguments> getUniqueWordsTestProviderArguments() {
        return Stream.of(
                Arguments.of("[JAVA, Java, C++, Python]")

        );
    }

    @ParameterizedTest
    @MethodSource("getUniqueWordsTestProviderArguments")
    public void getUniqueWordsTest(String expectedValue) {
        Set<String> setWords = textMonitoring.getUniqueWords();
        Assertions.assertEquals(expectedValue, setWords.toString());
    }

}
