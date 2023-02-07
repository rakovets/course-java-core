package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.tax_service.Cities;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.Fines;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.Person;
import com.rakovets.course.java.core.practice.jcf_set.tax_service.TaxService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TaxServiceTest {
    private TaxService belarusTexService;
    private Person dzmitryKrasiuk;
    private Person dzmitryRakovets;
    private Person elenaBlinovskaya;

    @BeforeEach
    void init() {
        belarusTexService = new TaxService();
        dzmitryKrasiuk = new Person("Dzmitry", "Krasiuk", Cities.HOMIEL);
        dzmitryRakovets = new Person("Dzmitry", "Rakovets", Cities.MINSK);
        elenaBlinovskaya = new Person("Elena", "Blinovskaya", Cities.MINSK);

        belarusTexService.addPerson(dzmitryKrasiuk);
        belarusTexService.addPerson(dzmitryRakovets);

        belarusTexService.addFine(dzmitryKrasiuk, Fines.DRIVING, 15, "29.01.2023, " +
                "camera@116, breaking speed limit for 12 km/h");
        belarusTexService.addFine(dzmitryKrasiuk, Fines.DRIVING, 30, "31.01.2023, " +
                "camera@93, breaking speed limit for 23 km/h");
        belarusTexService.addFine(dzmitryRakovets, Fines.ADMINISTRATIVE, 120, "06.01.2023," +
                ", fine for something");
        belarusTexService.addFine(dzmitryRakovets, Fines.DRIVING, 30, "27.01.2023, " +
                "camera@201, breaking speed limit for 21 km/h");
    }

    @DisplayName("Test addPerson(), adds Person to TaxService")
    @Test
    void addPersonTest() {
        belarusTexService.addPerson(elenaBlinovskaya);

        Assertions.assertTrue(belarusTexService.getPersonData().contains(dzmitryRakovets));
    }

    @DisplayName("Test removePerson, removes Person from TaxService")
    @Test
    void removePersonTest() {
        belarusTexService.removePerson(dzmitryRakovets);

        Assertions.assertFalse(belarusTexService.getPersonData().contains(dzmitryRakovets));
    }

    @DisplayName("Test")
    @Test
    void addFineTest() {
        belarusTexService.showFineById("dzmitryRakovets@0");

        Assertions.assertFalse(belarusTexService.getPersonData().contains(dzmitryRakovets));
    }

    @DisplayName("Test")
    @Test
    void showFineByIdTest() {
        belarusTexService.showFineById("dzmitryRakovets@0");

        Assertions.assertFalse(belarusTexService.getPersonData().contains(dzmitryRakovets));
    }
}
