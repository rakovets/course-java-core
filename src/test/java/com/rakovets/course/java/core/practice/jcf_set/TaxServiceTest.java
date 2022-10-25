package com.rakovets.course.java.core.practice.jcf_set;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxServiceTest {
    LinkedHashSet<Person> taxPayer = new LinkedHashSet<>();
    TaxService taxService = new TaxService(taxPayer);

    static Stream<Arguments> provideArgumentsForAddNewTaxPayer() {
        return Stream.of(
                Arguments.of(new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985),
                        new TaxService(new LinkedHashSet<>(Set.of(
                                new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985)))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAddNewTaxPayer")
    void addNewTaxPayer(Person person, TaxService expected) {
        taxService.addNewTaxPayer(person);

        TaxService actual = new TaxService(taxService.getDatabase());

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAddFineType() {
        return Stream.of(
                Arguments.of(FineType.FINE181, 23041985, new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811, FineType.FINE181)), 23041985))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAddFineType")
    void addFineType(FineType fine, int idTaxPayer, Person expected) {
        taxService.addNewTaxPayer(new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985));
        taxService.addFineType(fine, idTaxPayer);

        Person actual = taxService.showByID(idTaxPayer);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForDeleteFineType() {
        return Stream.of(
                Arguments.of(FineType.FINE181, 23041985, new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForDeleteFineType")
    void deleteFineType(FineType fine, int idTaxPayer, Person expected) {
        taxService.addNewTaxPayer(new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985));
        taxService.deleteFineType(fine, idTaxPayer);

        Person actual = taxService.showByID(idTaxPayer);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForShowById() {
        return Stream.of(
                Arguments.of(23041985, new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985)),
                Arguments.of(8022000, new Person("Liza Benitsrvich", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE1815)), 8022000)),
                Arguments.of(10091999, new Person("Kate Komleva", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE181, FineType.FINE1811)), 10091999))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForShowById")
    void getShowById(int idTaxPayer, Person expected) {
        taxService.addNewTaxPayer(new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985));
        taxService.addNewTaxPayer(new Person("Liza Benitsrvich", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE1815)), 8022000));
        taxService.addNewTaxPayer(new Person("Kate Komleva", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE181, FineType.FINE1811)), 10091999));

        Person actual = taxService.showByID(idTaxPayer);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForShowByCity() {
        return Stream.of(
                Arguments.of(City.Minsk, new ArrayList<>(Arrays.asList(
                        new Person("Liza Benitsrvich", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE1815)), 8022000),
                        new Person("Kate Komleva", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE181, FineType.FINE1811)), 10091999))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForShowByCity")
    void getShowByCity(City city, List<Person> expected) {
        taxService.addNewTaxPayer(new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985));
        taxService.addNewTaxPayer(new Person("Liza Benitsrvich", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE1815)), 8022000));
        taxService.addNewTaxPayer(new Person("Kate Komleva", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE181, FineType.FINE1811)), 10091999));

        List<Person> actual = taxService.showByCity(city);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForShowByFineType() {
        return Stream.of(
                Arguments.of(FineType.FINE1815, new ArrayList<>(Arrays.asList(
                        new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985),
                        new Person("Liza Benitsrvich", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE1815)), 8022000))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForShowByFineType")
    void getShowByFineType(FineType fineType, List<Person> expected) {
        taxService.addNewTaxPayer(new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985));
        taxService.addNewTaxPayer(new Person("Liza Benitsrvich", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE1815)), 8022000));
        taxService.addNewTaxPayer(new Person("Kate Komleva", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE181, FineType.FINE1811)), 10091999));

        List<Person> actual = taxService.showByFineType(fineType);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForUpdateInfoAboutTaxPayer() {
        return Stream.of(
                Arguments.of(23041985, City.Minsk, new Person("Georg Shpendel", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForUpdateInfoAboutTaxPayer")
    void getUpdateInfoAboutTaxPayer(int idTaxPayer, City city, Person expected) {
        taxService.addNewTaxPayer(new Person("Georg Shpendel", City.Mogilev, new ArrayList<>(Arrays.asList(FineType.FINE1815, FineType.FINE1811)), 23041985));
        taxService.addNewTaxPayer(new Person("Liza Benitsrvich", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE1815)), 8022000));
        taxService.addNewTaxPayer(new Person("Kate Komleva", City.Minsk, new ArrayList<>(Arrays.asList(FineType.FINE181, FineType.FINE1811)), 10091999));
        taxService.updateInfoAboutTaxPayer(idTaxPayer,city, taxService.getDatabase());

        Person actual = taxService.showByID(idTaxPayer);

        assertEquals(expected, actual);
    }
}
