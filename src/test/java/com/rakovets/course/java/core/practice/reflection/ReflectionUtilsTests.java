package com.rakovets.course.java.core.practice.reflection;

import com.rakovets.course.java.core.practice.reflection.model.Bookstore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ReflectionUtilsTests {
    private ReflectionUtils reflectionUtils = new ReflectionUtils();
    private static Bookstore bookstoreObj = new Bookstore("Dracula", "Horror", 100.00, 1897);
    private static final Class bookstoreClass = bookstoreObj.getClass();

    static Stream<Arguments> provideArgumentsForGetFieldByClassFieldName() {
        return Stream.of(
                Arguments.of(bookstoreClass, "bookTitle",
                        "private java.lang.String com.rakovets.course.java.core." +
                                "practice.reflection.model.Bookstore.bookTitle"),
                Arguments.of(bookstoreClass, "genre",
                        "private java.lang.String com.rakovets.course.java.core." +
                                "practice.reflection.model.Bookstore.genre"),
                Arguments.of(bookstoreClass, "price",
                        "public double com.rakovets.course.java.core.practice." +
                                "reflection.model.Bookstore.price"),
                Arguments.of(bookstoreClass, "publicationYear",
                        "private int com.rakovets.course.java.core.practice." +
                                "reflection.model.Bookstore.publicationYear")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetFieldByClassFieldName")
    void testGetFieldByClassFieldName(Class className, String fieldName, String expected) throws NoSuchFieldException {
        String actual = (reflectionUtils.getFieldByClassFieldName(className, fieldName)).toString();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetMethodByClassMethodName() {
        return Stream.of(
                Arguments.of(bookstoreClass, "getBookTitle",
                        "public java.lang.String com.rakovets.course.java.core." +
                                "practice.reflection.model.Bookstore.getBookTitle()"),
                Arguments.of(bookstoreClass, "getGenre",
                        "private java.lang.String com.rakovets.course.java.core." +
                                "practice.reflection.model.Bookstore.getGenre()"),
                Arguments.of(bookstoreClass, "getPublicationYear",
                        "private int com.rakovets.course.java.core.practice." +
                                "reflection.model.Bookstore.getPublicationYear()"),
                Arguments.of(bookstoreClass, "getPrice",
                        "public double com.rakovets.course.java.core.practice.reflection." +
                                "model.Bookstore.getPrice()")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMethodByClassMethodName")
    void testGetMethodByClassMethodName(Class className, String methodName, String expected) throws NoSuchMethodException {
        String actual = (reflectionUtils.getMethodByClassMethodName(className, methodName)).toString();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetArrayAllMethodsByClass() {
        return Stream.of(
                Arguments.of(bookstoreClass,
                        List.of("private int com.rakovets.course.java.core.practice." +
                                        "reflection.model.Bookstore.getPublicationYear()",
                                "private java.lang.String com.rakovets.course.java." +
                                        "core.practice.reflection.model.Bookstore.getGenre()",
                                "private void com.rakovets.course.java.core.practice." +
                                        "reflection.model.Bookstore.setGenre(java.lang.String)",
                                "public double com.rakovets.course.java.core.practice." +
                                        "reflection.model.Bookstore.getPrice()",
                                "public java.lang.String com.rakovets.course.java.core." +
                                        "practice.reflection.model.Bookstore.getBookTitle()",
                                "public void com.rakovets.course.java.core.practice." +
                                        "reflection.model.Bookstore.setPrice(double)",
                                "public void com.rakovets.course.java.core.practice." +
                                        "reflection.model.Bookstore.setPublicationYear(int)"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetArrayAllMethodsByClass")
    void testGetArrayAllMethodsByClass(Class className, List<String> expected) {
        List<Method> listOfStrings = Arrays.asList(reflectionUtils.getArrayAllMethodsByClass(className));

        List<String> actual = new ArrayList<>();
        for (Method list : listOfStrings) {
            actual.add(list.toString());
        }
        Collections.sort(actual);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetClassMethod() {
        return Stream.of(
                Arguments.of("public void com.rakovets.course.java.core.practice." +
                                "reflection.model.Bookstore.setPrice(double)",
                        bookstoreClass, "setPrice", double.class),
                Arguments.of("private void com.rakovets.course.java.core.practice." +
                        "reflection.model.Bookstore.setGenre(java.lang.String)",
                        bookstoreClass, "setGenre", String.class),
                Arguments.of("public void com.rakovets.course.java.core.practice." +
                                "reflection.model.Bookstore.setPublicationYear(int)",
                        bookstoreClass, "setPublicationYear", int.class)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetClassMethod")
    final void testGetClassMethod(String expected, Class className, String methodName, Class... parameters) throws NoSuchMethodException {
        String actual = (reflectionUtils.getClassMethod(className, methodName, parameters)).toString();

        Assertions.assertEquals(expected, actual);
    }
}
