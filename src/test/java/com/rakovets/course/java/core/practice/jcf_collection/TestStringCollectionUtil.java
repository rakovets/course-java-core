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
    static Stream<Arguments> resetWordsByLengthArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new String("mama"), new String("123"),
                                new String("4567"), new String("dad"), new String("Maksim"),
                                new String("Sunny"), new String("Kitty"), new String("Sun"))),
                        new ArrayList<>(Arrays.asList(new String("*"), new String("123"),
                                new String("*"), new String("dad"), new String("Maksim"),
                                new String("Sunny"), new String("Kitty"), new String("Sun")))
                ));
    }

    @ParameterizedTest
    @MethodSource("resetWordsByLengthArguments")
    public void getResetWordsByLength(List<String> line, List<String> expected) {
        StringCollectionUtil collection = new StringCollectionUtil();

        collection.resetWordsByLength(line, 4);

        Assertions.assertEquals(expected, line);
    }

    static Stream<Arguments> removeWordsByLengthArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new String("mama"), new String("123"),
                                new String("4567"), new String("dad"), new String("Maksim"),
                                new String("Sunny"), new String("Kitty"), new String("Sun"))),
                        new ArrayList<>(Arrays.asList(new String("123"), new String("dad"), new String("Maksim"),
                                new String("Sunny"), new String("Kitty"), new String("Sun")))
                ));
    }

    @ParameterizedTest
    @MethodSource("removeWordsByLengthArguments")
    public void getRemoveWordsByLength(List<String> line, List<String> expected) {
        StringCollectionUtil collection = new StringCollectionUtil();

        collection.removeWordsByLength(line, 4);

        Assertions.assertEquals(expected, line);
    }
}
