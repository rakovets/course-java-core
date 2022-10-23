package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStringCollectionUtil {
    static Stream<Arguments> provideArgumentsForResetWordsByLength() {
        return Stream.of(Arguments.of(new ArrayList<String>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer")),
                                      new ArrayList<String>(Arrays.asList("*", "is", "*", "of", "fun", "for", "every", "*", "programmer"))));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForResetWordsByLength")
    void getResetWordsByLength(List<String> e, List<String> expected) {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();

        stringCollectionUtil.resetWordsByLength(e, 4);

        Assertions.assertEquals(expected, e);
    }
}
