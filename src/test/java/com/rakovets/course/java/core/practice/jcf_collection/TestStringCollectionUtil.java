package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;

public class TestStringCollectionUtil {
    static Stream<Arguments> provideArgumentsForResetWordsByLength() {
        return Stream.of(Arguments.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer", 4),
                Arguments.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer", 3));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForResetWordsByLength")
    void getResetWordsByLength(List<String> e, int n) {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        //List<String> actual = e.rest;
    }
}
