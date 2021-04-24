

import com.rakovets.course.java.core.practice.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.stream.Stream;


public class StringCollectionUtilTest {
    private ArrayList<String> arrayList = new ArrayList<>();

    @BeforeEach
    public void init() {
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("C");
        arrayList.add("Java");
        arrayList.add("Ruby");
        arrayList.add("Python");
    }


    @Test
    static Stream<Arguments> resetWordsByLengthTestProviderArguments() {
        return Stream.of(
                Arguments.of("[Java, C++, *, Java, Ruby, Python]", 1),
                Arguments.of("[*, C++, C, *, *, Python]", 4),
                Arguments.of("[Java, *, C, Java, Ruby, Python]", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("resetWordsByLengthTestProviderArguments")
    public void resetWordsByLengthTest(String expectedValue, int lenght) {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        arrayList = stringCollectionUtil.resetWordsByLength(arrayList, lenght);
        Assertions.assertEquals(expectedValue, arrayList.toString());
    }

    @Test
    static Stream<Arguments> removeWordsByLengthTestProviderArguments() {
        return Stream.of(
                Arguments.of("[Java, C, Java, Ruby, Python]", 3),
                Arguments.of("[Java, C++, Java, Ruby, Python]", 1),
                Arguments.of("[C++, C, Python]", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("removeWordsByLengthTestProviderArguments")
    public void removeWordsByLengthTest(String expectedValue, int length) {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        arrayList = stringCollectionUtil.removeWordsByLength(arrayList, length);
        Assertions.assertEquals(expectedValue, arrayList.toString());
    }
}
