package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.tax_service.*;
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

    @DisplayName("Test removePerson(), removes Person from TaxService")
    @Test
    void removePersonTest() {
        belarusTexService.removePerson(dzmitryRakovets);

        Assertions.assertFalse(belarusTexService.getPersonData().contains(dzmitryRakovets));
    }

    @DisplayName("Test addFine(), adds Fine to Person")
    @Test
    void addFineTest() {
        belarusTexService.addFine(dzmitryRakovets, Fines.ADMINISTRATIVE, 1500, "07.02.2023, " +
                "too many unreviewed homeworks");
        int result = 0;
        for (Fine ignored : dzmitryRakovets.getFines()) {
            result++;
        }

        Assertions.assertEquals(3 ,result);
    }

    @DisplayName("Test removeFine(), removes Fine from Person by id")
    @Test
    void removeFineTest() {
        belarusTexService.removeFine("DzmitryKrasiuk@0");
        int result = 0;
        for (Fine ignored : dzmitryKrasiuk.getFines()) {
            result++;
        }

        Assertions.assertEquals(1, result);
    }

    @DisplayName("Test showFineById(), returns Fine by id, equals")
    @Test
    void showFineByIdTest1() {
        Assertions.assertEquals("DzmitryKrasiuk@0",
                belarusTexService.showFineById("DzmitryKrasiuk@0").getId());
    }

    @DisplayName("Test showFineById(), returns Fine by id, not equals")
    @Test
    void showFineByIdTest2() {
        Assertions.assertNotEquals("DzmitryKrasiuk@1",
                belarusTexService.showFineById("DzmitryKrasiuk@0").getId());
    }

    @DisplayName("Test showFinesByType(), returns Fines by Type for all Persons, equals")
    @Test
    void showFinesByTypeTest1() {
        int expected = 0;
        int result = 0;
        for (Person person : belarusTexService.getPersonData()) {
            for (Fine fine : person.getFines()) {
                if (fine.getType() == Fines.DRIVING) {
                    expected++;
                }
            }
        }

        for (Fine ignored : belarusTexService.showFinesByType(Fines.DRIVING)) {
            result++;
        }

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test showFinesByType(), returns Fines by Type for all Persons, equals")
    @Test
    void showFinesByTypeTest2() {
        int expected = 0;
        int result = 0;
        for (Person person : belarusTexService.getPersonData()) {
            for (Fine fine : person.getFines()) {
                if (fine.getType() == Fines.ADMINISTRATIVE) {
                    expected++;
                }
            }
        }

        for (Fine ignored : belarusTexService.showFinesByType(Fines.ADMINISTRATIVE)) {
            result++;
        }

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test showFinesByType(), returns Fines by Type for all Persons,not equals")
    @Test
    void showFinesByTypeTest3() {
        int expected = 0;
        int result = 0;
        for (Person person : belarusTexService.getPersonData()) {
            for (Fine fine : person.getFines()) {
                if (fine.getType() == Fines.ADMINISTRATIVE) {
                    expected++;
                }
            }
        }

        for (Fine ignored : belarusTexService.showFinesByType(Fines.DRIVING)) {
            result++;
        }

        Assertions.assertNotEquals(expected, result);
    }

    @DisplayName("Test showFinesByCity(), returns Fines by City for all Persons, equals")
    @Test
    void showFinesByCityTest1() {
        Assertions.assertEquals(dzmitryKrasiuk.getFines(),
                belarusTexService.showFinesByCity(Cities.HOMIEL));
    }

    @DisplayName("Test showFinesByCity(), returns Fines by City for all Persons, not equals")
    @Test
    void showFinesByCityTest2() {
        Assertions.assertNotEquals(dzmitryKrasiuk.getFines(),
                belarusTexService.showFinesByCity(Cities.MINSK));
    }

    @DisplayName("Test showAllFines(), returns all Fines")
    @Test
    void showAllFinesTest() {
        belarusTexService.showAllFines();

        Assertions.assertEquals(4, belarusTexService.showAllFines().size());
    }

    @DisplayName("Test personInfoRenew(), changes Person parameters - name, surname, city, equals")
    @Test
    void personInfoRenewTest1() {
        belarusTexService.personInfoRenew(dzmitryRakovets, "Dmitry", "Rakovets", Cities.HOMIEL);

        Assertions.assertEquals("Dmitry", dzmitryRakovets.getName());
    }

    @DisplayName("Test personInfoRenew(), changes Person parameters - name, surname, city, not equals")
    @Test
    void personInfoRenewTest2() {
        belarusTexService.personInfoRenew(dzmitryRakovets, "Dmitry", "Rakovets", Cities.HOMIEL);

        Assertions.assertNotEquals("Dzmitry", dzmitryRakovets.getName());
    }

    @DisplayName("Test fineInfoRenew(), changes Fine parameters - type, sum, details, equals")
    @Test
    void fineInfoRenewTest1() {
        belarusTexService.fineInfoRenew("DzmitryKrasiuk@0", Fines.DRIVING, 5,
                belarusTexService.showFineById("DzmitryKrasiuk@0").getFineDetails());

        Assertions.assertEquals(5, belarusTexService.showFineById("DzmitryKrasiuk@0").getSum());
    }

    @DisplayName("Test fineInfoRenew(), changes Fine parameters - type, sum, details, not equals")
    @Test
    void fineInfoRenewTest2() {
        belarusTexService.fineInfoRenew("DzmitryKrasiuk@0", Fines.DRIVING, 5,
                belarusTexService.showFineById("DzmitryKrasiuk@0").getFineDetails());

        Assertions.assertNotEquals(15, belarusTexService.showFineById("DzmitryKrasiuk@0").getSum());
    }
}
