package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.exception.PenaltyAlreadyExistException;
import com.rakovets.course.java.core.practice.jcf_set.exception.PersonAlreadyExistsException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class TaxServiceTest {
    private Penalty speedGdansk;
    private Penalty speedGdynia;
    private Penalty techInspectionGdynia;
    private Penalty techInspectionGdansk;
    private TaxService taxService;

    @BeforeEach
    public void setUp() {
        taxService = new TaxService();
        speedGdansk = new Penalty("Speed", "Gdansk");
        speedGdynia = new Penalty("Speed", "Gdynia");
        techInspectionGdynia = new Penalty("Technical Inspection", "Gdynia");
        techInspectionGdansk = new Penalty("Technical Inspection", "Gdansk");
        Map<Integer, Set<Penalty>> taxPayers = new HashMap<>();
        taxPayers.put(25, new HashSet<>(Arrays.asList(speedGdansk, speedGdynia)));
        taxPayers.put(35, new HashSet<>(Arrays.asList(speedGdynia, techInspectionGdansk)));
        taxPayers.put(45, new HashSet<>(List.of(techInspectionGdynia)));
        taxService.getTaxPayers().putAll(taxPayers);
    }

    @Test
    public void testUniquePenalties() {
        Penalty speedGdyniaRepeat = new Penalty("Speed", "Gdynia");
        Set<Penalty> set = new HashSet<>(Set.of(speedGdynia));
        int expected = 1;

        set.add(speedGdyniaRepeat);
        int actual = set.size();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddNewPerson() {
        Set<Penalty> expected = Collections.EMPTY_SET;

        taxService.addPerson(55);
        Set<Penalty> actual = taxService.getTaxPayersByPersonalCode(55);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddExistPerson() {
        Assertions.assertThrows(PersonAlreadyExistsException.class, () -> taxService.addPerson(25));
    }

    @Test
    public void testGetInfoExistingPerson() {
        Set<Penalty> expected = Set.of(techInspectionGdynia);

        Set<Penalty> actual = taxService.getPersonInfo(45);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetInfoNewPerson() {
        Set<Penalty> expected = Collections.EMPTY_SET;

        Set<Penalty> actual = taxService.getPersonInfo(30);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddNewPenaltyExistPerson() {
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia, techInspectionGdansk);
        Penalty expectedPenalty = techInspectionGdansk;

        Penalty actualPenalty = taxService.addPenalty(25, techInspectionGdansk);
        Set<Penalty> actual = taxService.getTaxPayersByPersonalCode(25);

        Assertions.assertEquals(expectedPenalty, actualPenalty);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddExistingPenaltyExistPerson() {
        Assertions.assertThrows(PenaltyAlreadyExistException.class, () -> taxService.addPenalty(25, speedGdansk));
    }

    @Test
    public void testAddNewPersonWithAddPenaltyMethod() {
        Set<Penalty> expected = Set.of(speedGdansk);
        Penalty expectedPenalty = speedGdansk;

        Penalty actualPenalty = taxService.addPenalty(50, speedGdansk);
        Set<Penalty> actual = taxService.getTaxPayersByPersonalCode(50);

        Assertions.assertEquals(expectedPenalty, actualPenalty);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddNewPenaltiesExistingPerson() {
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia, techInspectionGdynia);
        Set<Penalty> expectedNewPenalties = Set.of(techInspectionGdynia);

        Set<Penalty> actualNewPenalties = taxService.addPenalties(25, Set.of(techInspectionGdynia));
        Set<Penalty> actual = taxService.getTaxPayersByPersonalCode(25);

        Assertions.assertEquals(expectedNewPenalties, actualNewPenalties);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddExistingPenaltiesExistingPerson() {
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia);
        Set<Penalty> expectedNewPenalties = Collections.EMPTY_SET;

        Set<Penalty> actualNewPenalties = taxService.addPenalties(25, Set.of(speedGdynia));
        Set<Penalty> actual = taxService.getTaxPayersByPersonalCode(25);

        Assertions.assertEquals(expectedNewPenalties, actualNewPenalties);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddExistingAndNewPenaltiesExistingPerson() {
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia, techInspectionGdansk);
        Set<Penalty> expectedNewPenalties = Set.of(techInspectionGdansk);

        Set<Penalty> actualNewPenalties = taxService.addPenalties(25, Set.of(speedGdynia, speedGdansk, techInspectionGdansk));
        Set<Penalty> actual = taxService.getTaxPayersByPersonalCode(25);

        Assertions.assertEquals(expectedNewPenalties, actualNewPenalties);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddNewPersonWithAddPenaltiesMethod() {
        Set<Penalty> expected = Set.of(speedGdansk);
        Set<Penalty> expectedNewPenalties = Set.of(speedGdansk);

        Set<Penalty> actualNewPenalties = taxService.addPenalties(50, Set.of(speedGdansk));
        Set<Penalty> actual = taxService.getTaxPayersByPersonalCode(50);

        Assertions.assertEquals(expectedNewPenalties, actualNewPenalties);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTaxPayers() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdansk, speedGdynia), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia));

        Map<Integer, Set<Penalty>> actual = taxService.getTaxPayers();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTaxPayersEmpty() {
        taxService = new TaxService();
        Map<Integer, Set<Penalty>> expected = Collections.EMPTY_MAP;

        Map<Integer, Set<Penalty>> actual = taxService.getTaxPayers();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTaxPayersByPersonalCode() {
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia);

        Set<Penalty> actual = taxService.getTaxPayersByPersonalCode(25);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTaxPayersByPersonalCodeNotExist() {
        Assertions.assertNull(taxService.getTaxPayersByPersonalCode(40));
    }

    @Test
    public void testGetTaxPayersByPenaltyType() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdansk, speedGdynia), 35, Set.of(speedGdynia));

        Map<Integer, Set<Penalty>> actual = taxService.getTaxPayersByPenaltyType("Speed");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTaxPayersByPenaltyTypeNotExist() {
        Map<Integer, Set<Penalty>> expected = Collections.EMPTY_MAP;

        Map<Integer, Set<Penalty>> actual = taxService.getTaxPayersByPenaltyType("Alcohol Intoxication");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTaxPayersByCity() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdansk), 35, Set.of(techInspectionGdansk));

        Map<Integer, Set<Penalty>> actual = taxService.getTaxPayersByCity("Gdansk");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetTaxPayersByCityNotExist() {
        Map<Integer, Set<Penalty>> expected = Collections.EMPTY_MAP;

        Map<Integer, Set<Penalty>> actual = taxService.getTaxPayersByCity("Sopot");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemovePenalty() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdansk), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia));

        taxService.removePenalty(25, speedGdynia);
        Map<Integer, Set<Penalty>> actual = taxService.getTaxPayers();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveNotExistPenalty() {
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia);

        taxService.removePenalty(25, techInspectionGdansk);
        Set<Penalty> actual = taxService.getTaxPayersByPersonalCode(25);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemovePenaltyNotExistPerson() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdynia, speedGdansk), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia));

        taxService.removePenalty(40, techInspectionGdansk);
        Map<Integer, Set<Penalty>> actual = taxService.getTaxPayers();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReplacePenaltyInformation() {
        Set<Penalty> expected = Set.of(techInspectionGdynia);

        taxService.replacePenaltyInformation(25, Set.of(techInspectionGdynia));
        Set<Penalty> actual = taxService.getTaxPayersByPersonalCode(25);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReplacePenaltyInformationNotExistPerson() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdynia, speedGdansk), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia), 40, Set.of(techInspectionGdynia));

        taxService.replacePenaltyInformation(40, Set.of(techInspectionGdynia));
        Map<Integer, Set<Penalty>> actual = taxService.getTaxPayers();

        Assertions.assertEquals(expected, actual);
    }
}
