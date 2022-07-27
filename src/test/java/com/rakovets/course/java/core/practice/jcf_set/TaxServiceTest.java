package com.rakovets.course.java.core.practice.jcf_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

class TaxServiceTest {
    static Fine pdd = new Fine(100, "PDD");
    static Fine alcohol = new Fine(250, "alcohol");
    TaxService taxService;

    @BeforeEach
    void init() {
        taxService = new TaxService(10);

        Person ivan = new Person("Ivan", "Ivanov", 1, "Minsk", pdd);
        Person petr = new Person("Petr", "Petrov", 2, "Minsk", alcohol);
        Person sveta = new Person("Sveta", "Svetikova", 3, "Brest", pdd);

        taxService.data.add(ivan);
        taxService.data.add(petr);
        taxService.data.add(sveta);
    }

    static Stream<Arguments> getInfoByIdProviderArguments() {
        return Stream.of(
                Arguments.of(1, new Person("Ivan", "Ivanov", 1, "Minsk", pdd)),
                Arguments.of(0, null),
                Arguments.of(3, new Person("Sveta", "Svetikova", 3, "Brest", pdd))
        );
    }

    @ParameterizedTest
    @MethodSource("getInfoByIdProviderArguments")
    void getInfoByIdTest(int id, Person expected) {
        Person actual = taxService.getInfoById(id);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getInfoByFine() {
        Set<Person> expected = new LinkedHashSet<>(List.of(
                new Person("Ivan", "Ivanov", 1, "Minsk", pdd),
                new Person("Sveta", "Svetikova", 3, "Brest", pdd)
        ));

        Set<Person> actual = taxService.getInfoByFine(pdd);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getInfoByCity() {
        Set<Person> expected = new LinkedHashSet<>();
        taxService.data.clear();
        Person ivan = new Person("Ivan", "Ivanov", 1, "Minsk", pdd);
        Person petr = new Person("Petr", "Petrov", 2, "Minsk", alcohol);
        Person inna = new Person("Inna", "Innova", 2, "Brest", pdd);
        taxService.data.add(ivan);
        taxService.data.add(petr);
        taxService.data.add(inna);
        expected.add(ivan);
        expected.add(petr);

        Set<Person> actual = taxService.getInfoByCity("Minsk");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNewPerson() {
        Person expected = new Person("Inna", "Innova", 4, "Brest", pdd);

        taxService.data.add(expected);
        Person actual = taxService.getNewPerson();

        Assertions.assertEquals(expected, actual);
    }
}
