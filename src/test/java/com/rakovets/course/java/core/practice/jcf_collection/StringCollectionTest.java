package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;

public class StringCollectionTest {
    // Original collection:
    List<String> originalArraylist1 = List.of("this", "is", "lots", "of", "fun", "every", "Java", "programmer");
    List<String> originalArraylist2 = List.of("Hello", "word", "Java", "test", "Minsk");
    List<String> originalArraylist3 = List.of("123", " 1 ", "***", ".!.", "!");

    // Expected collection after fix:
    List<String> expectedArrayList1 = List.of("*", "is", "*", "of", "fun", "every", "*", "programmer");
    List<String> expectedArrayList2 = List.of("*", "*", "*", "*", "*", "Minsk");
    List<String> expectedArrayList3 = List.of("*", "*", "*", "*", "!");

    static Stream<Arguments> provideArgumentsForResetWordsByLength(
            List<String> originalArraylist1,
            List<String> expectedArrayList1,
            List<String> originalArraylist2,
            List<String> expectedArrayList2,
            List<String> originalArraylist3,
            List<String> expectedArrayList3
    ) {
        return Stream.of(
                Arguments.of(originalArraylist1, 4, expectedArrayList1),
                Arguments.of(originalArraylist2, 4, expectedArrayList2),
                Arguments.of(originalArraylist3, 3, expectedArrayList3)
        );
    }

    @ParameterizedTest(name = "Length - {1}")
    @MethodSource("provideArgumentsForResetWordsByLength")
    void resetWordsByLengthTest(List<String> arrayList, int lengthWord, List<String> expected) {
        List<String> actual = StringCollectionUtil.resetWordsByLength(arrayList, lengthWord);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    // Expected collection after remove:
    List<String> expectedArrayList4 = List.of("is","of", "fun", "every", "programmer");
    List<String> expectedArrayList5 = List.of("Minsk");
    List<String> expectedArrayList6 = List.of("!");

    static Stream<Arguments> provideArgumentsForRemoveWordsByLength(
            List<String> originalArraylist1,
            List<String> expectedArrayList4,
            List<String> originalArraylist2,
            List<String> expectedArrayList5,
            List<String> originalArraylist3,
            List<String> expectedArrayList6
    ) {
        return Stream.of(
                Arguments.of(originalArraylist1, 4, expectedArrayList4),
                Arguments.of(originalArraylist2, 4, expectedArrayList5),
                Arguments.of(originalArraylist3, 3, expectedArrayList6)
        );
    }

    @ParameterizedTest(name = "Length - {1}")
    @MethodSource("provideArgumentsForRemoveWordsByLength")
    void removeWordsByLengthTest(List<String> arrayList, int lengthWord, List<String> expected) {
        List<String> actual = StringCollectionUtil.removeWordsByLength(arrayList, lengthWord);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
