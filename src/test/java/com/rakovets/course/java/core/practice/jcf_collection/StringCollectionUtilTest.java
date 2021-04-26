package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.string_collection_util.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StringCollectionUtilTest {

    @Test
    static Stream<Arguments> resetWordsByLengthProviderArguments() {
        return Stream.of(
                Arguments.of("[good, *, in, spring]", 3),
                Arguments.of("[*, day, in, spring]", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("resetWordsByLengthProviderArguments")
    public void resetWordsByLengthTest(String expectedString, int wordLength) {
        Collection<String> collection = new ArrayList<>(Arrays.asList("good", "day", "in", "spring"));
        String actualString = StringCollectionUtil.resetWordsByLength(collection, wordLength).toString();
        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    static Stream<Arguments> removeWordsByLengthProviderArguments() {
        return Stream.of(
                Arguments.of("[good, in, spring]", 3),
                Arguments.of("[day, in, spring]", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("removeWordsByLengthProviderArguments")
    public void removeWordsByLengthTest(String expectedString, int wordLength) {
        Collection<String> collection = new ArrayList<>(Arrays.asList("good", "day", "in", "spring"));
        String actualString = StringCollectionUtil.removeWordsByLength(collection, wordLength).toString();
        Assertions.assertEquals(expectedString, actualString);
    }
}
