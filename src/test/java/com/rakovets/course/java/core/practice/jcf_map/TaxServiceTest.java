package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_set.tax_service.TaxOffice;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.Taxpayer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class TaxServiceTest {
    Set<Taxpayer> taxpayers = new LinkedHashSet<>();
    TaxOffice taxOffice = new TaxOffice(taxpayers);

    static Stream<Arguments> provideArgumentsForConstructorTaxpayerClass() {
        return Stream.of(
                Arguments.of(1001, "Fine_type_1", "Brest",
                        "{Cod ID taxpayer: 1001, fines: [Fine_type_1], city: Brest}"),
                Arguments.of(1002, "Fine_type_2", "Vitebsk",
                        "{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}"),
                Arguments.of(1003, "Fine_type_3", "Gomel",
                        "{Cod ID taxpayer: 1003, fines: [Fine_type_3], city: Gomel}"),
                Arguments.of(1004, "Fine_type_4", "Grodno",
                        "{Cod ID taxpayer: 1004, fines: [Fine_type_4], city: Grodno}"),
                Arguments.of(1005, "Fine_type_5", "Minsk",
                        "{Cod ID taxpayer: 1005, fines: [Fine_type_5], city: Minsk}"),
                Arguments.of(1006, "Fine_type_6", "Mogilev" ,
                        "{Cod ID taxpayer: 1006, fines: [Fine_type_6], city: Mogilev}")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForConstructorTaxpayerClass")
        void testConstructorTaxpayerClass(int codId, String fines, String city, String expected) {
        Taxpayer actual = new Taxpayer(codId, fines, city);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetMethodsTaxpayerClass () {
        return Stream.of(
                Arguments.of(1001, "Fine_type_1", "Brest",
                        "1001 [Fine_type_1] Brest"),
                Arguments.of(1002, "Fine_type_2", "Vitebsk",
                        "1002 [Fine_type_2] Vitebsk"),
                Arguments.of(1003, "Fine_type_3", "Gomel",
                        "1003 [Fine_type_3] Gomel"),
                Arguments.of(1004, "Fine_type_4", "Grodno",
                        "1004 [Fine_type_4] Grodno"),
                Arguments.of(1005, "Fine_type_5", "Minsk",
                        "1005 [Fine_type_5] Minsk"),
                Arguments.of(1006, "Fine_type_6", "Mogilev" ,
                        "1006 [Fine_type_6] Mogilev")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMethodsTaxpayerClass")
    void testGetMethodsTaxpayerClass(int codId, String fines, String city, String expected) {
        Taxpayer taxpayer = new Taxpayer(codId, fines, city);
        String actual = taxpayer.getCodId() + " " + taxpayer.getFines() + " " + taxpayer.getCity();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForConstructorTaxOfficeClass() {
        return Stream.of(
                Arguments.of("[{Cod ID taxpayer: 1001, fines: [Fine_type_1], city: Brest}, " +
                        "{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}, " +
                        "{Cod ID taxpayer: 1003, fines: [Fine_type_3], city: Gomel}, " +
                        "{Cod ID taxpayer: 1004, fines: [Fine_type_4], city: Grodno}, " +
                        "{Cod ID taxpayer: 1005, fines: [Fine_type_5], city: Minsk}, " +
                        "{Cod ID taxpayer: 1006, fines: [Fine_type_6], city: Mogilev}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForConstructorTaxOfficeClass")
    void testConstructorTaxOfficeClass(String expected) {
        taxpayers.add(new Taxpayer(1001, "Fine_type_1", "Brest"));
        taxpayers.add(new Taxpayer(1002, "Fine_type_2", "Vitebsk"));
        taxpayers.add(new Taxpayer(1003, "Fine_type_3", "Gomel"));
        taxpayers.add(new Taxpayer(1004, "Fine_type_4", "Grodno"));
        taxpayers.add(new Taxpayer(1005, "Fine_type_5", "Minsk"));
        taxpayers.add(new Taxpayer(1006, "Fine_type_6", "Mogilev"));

        Set<Taxpayer> actual = taxpayers;

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForAddFineTaxOfficeClass() {
        return Stream.of(
                Arguments.of(1001, "Fine_type_2",
                        "[{Cod ID taxpayer: 1001, fines: [Fine_type_1, Fine_type_2], city: Brest}, " +
                        "{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}, " +
                        "{Cod ID taxpayer: 1003, fines: [Fine_type_3], city: Gomel}, " +
                        "{Cod ID taxpayer: 1004, fines: [Fine_type_4], city: Grodno}, " +
                        "{Cod ID taxpayer: 1005, fines: [Fine_type_5], city: Minsk}, " +
                        "{Cod ID taxpayer: 1006, fines: [Fine_type_6], city: Mogilev}]"),
                Arguments.of(1003, "Fine_type_4",
                        "[{Cod ID taxpayer: 1001, fines: [Fine_type_1], city: Brest}, " +
                        "{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}, " +
                        "{Cod ID taxpayer: 1003, fines: [Fine_type_3, Fine_type_4], city: Gomel}, " +
                        "{Cod ID taxpayer: 1004, fines: [Fine_type_4], city: Grodno}, " +
                        "{Cod ID taxpayer: 1005, fines: [Fine_type_5], city: Minsk}, " +
                        "{Cod ID taxpayer: 1006, fines: [Fine_type_6], city: Mogilev}]"),
                Arguments.of(1006, "Fine_type_1",
                        "[{Cod ID taxpayer: 1001, fines: [Fine_type_1], city: Brest}, " +
                        "{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}, " +
                        "{Cod ID taxpayer: 1003, fines: [Fine_type_3], city: Gomel}, " +
                        "{Cod ID taxpayer: 1004, fines: [Fine_type_4], city: Grodno}, " +
                        "{Cod ID taxpayer: 1005, fines: [Fine_type_5], city: Minsk}, " +
                        "{Cod ID taxpayer: 1006, fines: [Fine_type_6, Fine_type_1], city: Mogilev}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAddFineTaxOfficeClass")
    void testAddFineOfficeClass(int codIdTaxpayer, String fine, String expected) {
        taxpayers.add(new Taxpayer(1001, "Fine_type_1", "Brest"));
        taxpayers.add(new Taxpayer(1002, "Fine_type_2", "Vitebsk"));
        taxpayers.add(new Taxpayer(1003, "Fine_type_3", "Gomel"));
        taxpayers.add(new Taxpayer(1004, "Fine_type_4", "Grodno"));
        taxpayers.add(new Taxpayer(1005, "Fine_type_5", "Minsk"));
        taxpayers.add(new Taxpayer(1006, "Fine_type_6", "Mogilev"));

        taxOffice.addFine(codIdTaxpayer, fine);
        Set<Taxpayer> actual = taxpayers;

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForRemoveFineTaxOfficeClass() {
        return Stream.of(
                Arguments.of(1001, "Fine_type_2",
                        "[{Cod ID taxpayer: 1001, fines: [Fine_type_1, Fine_type_6], city: Brest}, " +
                        "{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}, " +
                        "{Cod ID taxpayer: 1003, fines: [Fine_type_3], city: Gomel}, " +
                        "{Cod ID taxpayer: 1004, fines: [Fine_type_4, Fine_type_1], city: Grodno}, " +
                        "{Cod ID taxpayer: 1005, fines: [Fine_type_5], city: Minsk}, " +
                        "{Cod ID taxpayer: 1006, fines: [Fine_type_6], city: Mogilev}]"),
                Arguments.of(1004, "Fine_type_4",
                        "[{Cod ID taxpayer: 1001, fines: [Fine_type_1, Fine_type_2, Fine_type_6], city: Brest}, " +
                        "{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}, " +
                        "{Cod ID taxpayer: 1003, fines: [Fine_type_3], city: Gomel}, " +
                        "{Cod ID taxpayer: 1004, fines: [Fine_type_1], city: Grodno}, " +
                        "{Cod ID taxpayer: 1005, fines: [Fine_type_5], city: Minsk}, " +
                        "{Cod ID taxpayer: 1006, fines: [Fine_type_6], city: Mogilev}]"),
                Arguments.of(1006, "Fine_type_6",
                        "[{Cod ID taxpayer: 1001, fines: [Fine_type_1, Fine_type_2, Fine_type_6], city: Brest}, " +
                        "{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}, " +
                        "{Cod ID taxpayer: 1003, fines: [Fine_type_3], city: Gomel}, " +
                        "{Cod ID taxpayer: 1004, fines: [Fine_type_4, Fine_type_1], city: Grodno}, " +
                        "{Cod ID taxpayer: 1005, fines: [Fine_type_5], city: Minsk}, " +
                        "{Cod ID taxpayer: 1006, fines: [No fines], city: Mogilev}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForRemoveFineTaxOfficeClass")
    void testRemoveFineOfficeClass(int codIdTaxpayer, String fine, String expected) {
        taxpayers.add(new Taxpayer(1001, "Fine_type_1", "Brest"));
        taxOffice.addFine(1001, "Fine_type_2");
        taxOffice.addFine(1001, "Fine_type_6");
        taxpayers.add(new Taxpayer(1002, "Fine_type_2", "Vitebsk"));
        taxpayers.add(new Taxpayer(1003, "Fine_type_3", "Gomel"));
        taxpayers.add(new Taxpayer(1004, "Fine_type_4", "Grodno"));
        taxOffice.addFine(1004, "Fine_type_1");
        taxpayers.add(new Taxpayer(1005, "Fine_type_5", "Minsk"));
        taxpayers.add(new Taxpayer(1006, "Fine_type_6", "Mogilev"));

        taxOffice.removeFine(codIdTaxpayer, fine);
        Set<Taxpayer> actual = taxpayers;

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForShowInfoByCodIdTaxOfficeClass() {
        return Stream.of(
                Arguments.of(1002, "{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}"),
                Arguments.of(1001, "{Cod ID taxpayer: 1001, fines: [Fine_type_1], city: Brest}"),
                Arguments.of(1004, "{Cod ID taxpayer: 1004, fines: [Fine_type_4], city: Grodno}"),
                Arguments.of(1006, "{Cod ID taxpayer: 1006, fines: [Fine_type_6], city: Mogilev}"),
                Arguments.of(1003, "{Cod ID taxpayer: 1003, fines: [Fine_type_3], city: Gomel}")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForShowInfoByCodIdTaxOfficeClass")
    void testShowInfoByCodIdTaxOfficeClass(int codId, String expected) {
        taxpayers.add(new Taxpayer(1001, "Fine_type_1", "Brest"));
        taxpayers.add(new Taxpayer(1002, "Fine_type_2", "Vitebsk"));
        taxpayers.add(new Taxpayer(1003, "Fine_type_3", "Gomel"));
        taxpayers.add(new Taxpayer(1004, "Fine_type_4", "Grodno"));
        taxpayers.add(new Taxpayer(1005, "Fine_type_5", "Minsk"));
        taxpayers.add(new Taxpayer(1006, "Fine_type_6", "Mogilev"));

        String actual = taxOffice.showInfoByCodId(codId);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForShowInfoByFineTaxOfficeClass() {
        return Stream.of(
                Arguments.of("Fine_type_2",
                        "[{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}, " +
                        "{Cod ID taxpayer: 1005, fines: [Fine_type_2], city: Minsk}]"),
                Arguments.of("Fine_type_4",
                        "[{Cod ID taxpayer: 1001, fines: [Fine_type_4], city: Brest}, " +
                        "{Cod ID taxpayer: 1004, fines: [Fine_type_4], city: Grodno}]"),
                Arguments.of("Fine_type_1",
                        "[{Cod ID taxpayer: 1003, fines: [Fine_type_1], city: Gomel}, " +
                        "{Cod ID taxpayer: 1006, fines: [Fine_type_1], city: Mogilev}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForShowInfoByFineTaxOfficeClass")
    void testShowInfoByFineTaxOfficeClass(String fine, String expected) {
        taxpayers.add(new Taxpayer(1001, "Fine_type_4", "Brest"));
        taxpayers.add(new Taxpayer(1002, "Fine_type_2", "Vitebsk"));
        taxpayers.add(new Taxpayer(1003, "Fine_type_1", "Gomel"));
        taxpayers.add(new Taxpayer(1004, "Fine_type_4", "Grodno"));
        taxpayers.add(new Taxpayer(1005, "Fine_type_2", "Minsk"));
        taxpayers.add(new Taxpayer(1006, "Fine_type_1", "Mogilev"));

        Set<Taxpayer> actual = taxOffice.showInfoByFine(fine);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForShowInfoByCityTaxOfficeClass() {
        return Stream.of(
                Arguments.of("Brest",
                        "[{Cod ID taxpayer: 1001, fines: [Fine_type_1], city: Brest}, " +
                        "{Cod ID taxpayer: 1004, fines: [Fine_type_4], city: Brest}, " +
                        "{Cod ID taxpayer: 1006, fines: [Fine_type_6], city: Brest}]"),
                Arguments.of("Vitebsk",
                        "[{Cod ID taxpayer: 1002, fines: [Fine_type_2], city: Vitebsk}]"),
                Arguments.of("Minsk",
                        "[{Cod ID taxpayer: 1003, fines: [Fine_type_3], city: Minsk}, " +
                        "{Cod ID taxpayer: 1005, fines: [Fine_type_5], city: Minsk}]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForShowInfoByCityTaxOfficeClass")
    void testShowInfoByCityTaxOfficeClass(String city, String expected) {
        taxpayers.add(new Taxpayer(1001, "Fine_type_1", "Brest"));
        taxpayers.add(new Taxpayer(1002, "Fine_type_2", "Vitebsk"));
        taxpayers.add(new Taxpayer(1003, "Fine_type_3", "Minsk"));
        taxpayers.add(new Taxpayer(1004, "Fine_type_4", "Brest"));
        taxpayers.add(new Taxpayer(1005, "Fine_type_5", "Minsk"));
        taxpayers.add(new Taxpayer(1006, "Fine_type_6", "Brest"));

        Set<Taxpayer> actual = taxOffice.showInfoByCity(city);

        Assertions.assertEquals(expected, actual.toString());
    }
}
