package com.rakovets.course.java.core.practice.oop_principles.cats_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CatsTest {
    Cat cat = new Cat("Unidentified cat!");
    Persian persian = new Persian("Unidentified cat!");
    Siamese siamese = new Siamese("Unidentified");
    Sphynx sphynx = new Sphynx("Unidentified");
    Person user = new Person(0);

    static Stream<Arguments> provideArgumentsForSetAndGetNameMethodsClassCat() {
        return Stream.of(
                Arguments.of("Mr. Paw", "Mr. Paw"),
                Arguments.of("Big Cat", "Big Cat"),
                Arguments.of("Buddy", "Buddy")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSetAndGetNameMethodsClassCat")
    void testSetAndGetNameMethodsClassCat(String name, String expected) {
        cat.setName(name);
        String actual = cat.getName();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSetAndGetNameMethodsClassPersian() {
        return Stream.of(
                Arguments.of("Jasper", "Jasper"),
                Arguments.of("Bitcoin", "Bitcoin"),
                Arguments.of("Pizza", "Pizza")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSetAndGetNameMethodsClassPersian")
    void testSetAndGetNameMethodsClassPersian(String name, String expected) {
        persian.setName(name);
        String actual = persian.getName();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSetAndGetNameMethodsClassSiamese() {
        return Stream.of(
                Arguments.of("Simba", "Simba"),
                Arguments.of("Jupiter", "Jupiter"),
                Arguments.of("Schnitzel", "Schnitzel")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSetAndGetNameMethodsClassSiamese")
    void testSetAndGetNameMethodsClassSiamese(String name, String expected) {
        siamese.setName(name);
        String actual = siamese.getName();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForSetAndGetNameMethodsClassSphynx() {
        return Stream.of(
                Arguments.of("Skinhead", "Skinhead"),
                Arguments.of("Ozzy", "Ozzy"),
                Arguments.of("Salvador", "Salvador")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSetAndGetNameMethodsClassSphynx")
    void testSetAndGetNameMethodsClassSphynx(String name, String expected) {
        sphynx.setName(name);
        String actual = sphynx.getName();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMewMethodClassCat() {
        return Stream.of(
                Arguments.of("Cat: meow-meow")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewMethodClassCat")
    void testMewMethodClassCat(String expected) {
        String actualCats = "Cat: " + cat.mew();
        Assertions.assertEquals(expected, actualCats);
    }

    static Stream<Arguments> provideArgumentsForMewMethodClassPersian() {
        return Stream.of(
                Arguments.of("Persian: Meeeeow-meeeeeow")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewMethodClassPersian")
    void testMewMethodClassPersian(String expected) {
        String actualPersian = "Persian: " + persian.mew();
        Assertions.assertEquals(expected, actualPersian);
    }

    static Stream<Arguments> provideArgumentsForMewMethodClassSiamese() {
        return Stream.of(
                Arguments.of("Siamese: Mrr-meooow")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewMethodClassSiamese")
    void testMewMethodClassSiamese(String expected) {
        String actualSiamese = "Siamese: " + siamese.mew();
        Assertions.assertEquals(expected, actualSiamese);
    }

    static Stream<Arguments> provideArgumentsForMewMethodClassSphynx() {
        return Stream.of(
                Arguments.of("Sphynx: Meow-arrr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewMethodClassSphynx")
    void testMewMethodClassSphynx(String expected) {
        String actualSphynx = "Sphynx: " + sphynx.mew();
        Assertions.assertEquals(expected, actualSphynx);
    }

    static Stream<Arguments> provideArgumentsForPurrMethodClassCat() {
        return Stream.of(
                Arguments.of("Cat: purr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrMethodClassCat")
    void testPurrMethodClassCat(String expected) {
        String actual = "Cat: " + cat.purr();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurrMethodClassPersian() {
        return Stream.of(
                Arguments.of("Persian: Purr-purr-purr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrMethodClassPersian")
    void testPurrMethodClassPersian(String expected) {
        String actual = "Persian: " + persian.purr();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurrMethodClassSiamese() {
        return Stream.of(
                Arguments.of("Siamese: Purrr-purrr")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrMethodClassSiamese")
    void testPurrMethodClassSiamese(String expected) {
        String actual = "Siamese: " + siamese.purr();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForPurrMethodClassSphynx() {
        return Stream.of(
                Arguments.of("Sphynx: Purr-arghh")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrMethodClassSphynx")
    void testPurrMethodClassSphynx(String expected) {
        String actual = "Sphynx: " + sphynx.purr();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetAndSetHappinessMethods() {
        return Stream.of(
                Arguments.of(30, "30"),
                Arguments.of(40, "40"),
                Arguments.of(50, "50")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAndSetHappinessMethods")
    void testGetAndSetHappinessMethods(int happiness, String expected) {
        user.setHappiness(happiness);
        String actual = String.valueOf(user.getHappiness());
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForChangeHappinessMethod() {
        return Stream.of(
                Arguments.of(50, "80"),
                Arguments.of(20, "50"),
                Arguments.of(15, "45")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForChangeHappinessMethod")
    void testChangeHappinessMethod(int percentHappiness, String expected) {
        int happiness = 30;
        user.setHappiness(happiness);
        String actual = String.valueOf(user.changeHappiness(percentHappiness));
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMewOverloadMethodClassCat() {
        return Stream.of(
                Arguments.of(100, "Cat mew. User happiness: 50"),
                Arguments.of(90, "Cat mew. User happiness: 40"),
                Arguments.of(80, "Cat mew. User happiness: 30")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewOverloadMethodClassCat")
    void testMewOverloadMethodClassCat(int happiness, String expected) {
        user.setHappiness(happiness);
        cat.mew(user);
        String actual = "Cat mew. User happiness: " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForMewOverloadMethodClassPersian() {
        return Stream.of(
                Arguments.of(100, "Persian mew. User happiness: 150"),
                Arguments.of(90, "Persian mew. User happiness: 140"),
                Arguments.of(80, "Persian mew. User happiness: 130")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewOverloadMethodClassPersian")
    void testMewOverloadMethodClassPersian(int happiness, String expected) {
        user.setHappiness(happiness);
        persian.mew(user);
        String actual = "Persian mew. User happiness: " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForMewOverloadMethodClassSiamese() {
        return Stream.of(
                Arguments.of(100, "Siamese mew. User happiness: 140"),
                Arguments.of(90, "Siamese mew. User happiness: 130"),
                Arguments.of(80, "Siamese mew. User happiness: 120")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewOverloadMethodClassSiamese")
    void testMewOverloadMethodClassSiamese(int happiness, String expected) {
        user.setHappiness(happiness);
        siamese.mew(user);
        String actual = "Siamese mew. User happiness: " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForMewOverloadMethodClassSphynx() {
        return Stream.of(
                Arguments.of(100, "Sphynx mew. User happiness: 70"),
                Arguments.of(90, "Sphynx mew. User happiness: 60"),
                Arguments.of(80, "Sphynx mew. User happiness: 50")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMewOverloadMethodClassSphynx")
    void testMewOverloadMethodClassSphynx(int happiness, String expected) {
        user.setHappiness(happiness);
        sphynx.mew(user);
        String actual = "Sphynx mew. User happiness: " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForPurrOverloadMethodClassCat() {
        return Stream.of(
                Arguments.of(20, "Cat purr. User happiness: 70"),
                Arguments.of(30, "Cat purr. User happiness: 80"),
                Arguments.of(40, "Cat purr. User happiness: 90")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrOverloadMethodClassCat")
    void testPurrOverloadMethodClassCat(int happiness, String expected) {
        user.setHappiness(happiness);
        cat.purr(user);
        String actual = "Cat purr. User happiness: " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForPurrOverloadMethodClassPersian() {
        return Stream.of(
                Arguments.of(20, "Persian purr. User happiness: 90"),
                Arguments.of(30, "Persian purr. User happiness: 100"),
                Arguments.of(40, "Persian purr. User happiness: 110")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrOverloadMethodClassPersian")
    void testPurrOverloadMethodClassPersian(int happiness, String expected) {
        user.setHappiness(happiness);
        persian.purr(user);
        String actual = "Persian purr. User happiness: " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForPurrOverloadMethodClassSiamese() {
        return Stream.of(
                Arguments.of(20, "Siamese purr. User happiness: 60"),
                Arguments.of(30, "Siamese purr. User happiness: 70"),
                Arguments.of(40, "Siamese purr. User happiness: 80")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrOverloadMethodClassSiamese")
    void testPurrOverloadMethodClassSiamese(int happiness, String expected) {
        user.setHappiness(happiness);
        siamese.purr(user);
        String actual = "Siamese purr. User happiness: " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForPurrOverloadMethodClassSphynx() {
        return Stream.of(
                Arguments.of(20, "Sphynx purr. User happiness: -10"),
                Arguments.of(30, "Sphynx purr. User happiness: 0"),
                Arguments.of(40, "Sphynx purr. User happiness: 10")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPurrOverloadMethodClassSphynx")
    void testPurrOverloadMethodClassSphynx(int happiness, String expected) {
        user.setHappiness(happiness);
        sphynx.purr(user);
        String actual = "Sphynx purr. User happiness: " + user.getHappiness();
        Assertions.assertEquals(actual, expected);
    }
}
