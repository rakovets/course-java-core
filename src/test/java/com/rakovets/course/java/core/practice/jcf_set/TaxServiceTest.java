package com.rakovets.course.java.core.practice.jcf_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TaxServiceTest {
    private final Penalty speedGdansk = new Penalty("Speed", "Gdansk");
    private final Penalty speedGdynia = new Penalty("Speed", "Gdynia");
    private final Penalty techInspectionGdynia = new Penalty("Technical Inspection", "Gdynia");
    private final Penalty techInspectionGdansk = new Penalty("Technical Inspection", "Gdansk");
    private TaxService taxService = new TaxService();

    @BeforeEach
    public void setUp() {
        Map<Integer, Set<Penalty>> taxPayers = new HashMap<>();
        taxPayers.put(25, new HashSet<>(Arrays.asList(speedGdansk, speedGdynia)));
        taxPayers.put(35, new HashSet<>(Arrays.asList(speedGdynia, techInspectionGdansk)));
        taxPayers.put(45, new HashSet<>(List.of(techInspectionGdynia)));
        taxService.getTaxPayers().putAll(taxPayers);
    }

    @Test
    public void testUniquePenalties() {
        Set <Penalty> set = new HashSet<>(Set.of(speedGdynia));
        Penalty speedGdyniaRepeat = new Penalty("Speed", "Gdynia");
        set.add(speedGdyniaRepeat);
        Assertions.assertEquals(1,set.size());
    }

    @Test
    public void testAddNewPerson() {
        Assertions.assertEquals(Collections.EMPTY_SET, taxService.addOrGetPersonInfo(55));
        Assertions.assertEquals(Collections.EMPTY_SET,taxService.getTaxPayersByPersonalCode(55));
    }

    @Test
    public void testGetInfoExistingPerson() {
        Set<Penalty> expected = Set.of(techInspectionGdynia);
        Assertions.assertEquals(expected, taxService.addOrGetPersonInfo(45));
        Assertions.assertEquals(expected,taxService.getTaxPayersByPersonalCode(45));
    }

    @Test
    public void testAddNewPenalty() {
        Assertions.assertEquals(techInspectionGdansk, taxService.addPenalty(25, techInspectionGdansk));
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia, techInspectionGdansk);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddExistingPenalty() {
        Assertions.assertNull(taxService.addPenalty(25, speedGdansk));
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddNewPersonWithAddPenaltyMethod() {
        Set<Penalty> expected = Set.of(speedGdansk);
        Assertions.assertEquals(speedGdansk, taxService.addPenalty(50, speedGdansk));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(50));
    }

    @Test
    public void testAddNewPenalties() {
        Assertions.assertEquals(Set.of(techInspectionGdynia), taxService.addPenalties(25, Set.of(techInspectionGdynia, speedGdynia)));
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia, techInspectionGdynia);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddExistingPenalties() {
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia);
        Assertions.assertEquals(Collections.EMPTY_SET,taxService.addPenalties(25, Set.of( speedGdynia,speedGdansk)));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddExistingAndNewPenalties() {
        Set<Penalty> expected = Set.of(speedGdynia,speedGdansk, techInspectionGdansk);
        Assertions.assertEquals(Set.of(techInspectionGdansk),taxService.addPenalties(25, Set.of( speedGdansk, techInspectionGdansk)));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddNewPersonWithAddPenaltiesMethod() {
        Set<Penalty> expected = Set.of(speedGdansk);
        Assertions.assertEquals(expected, taxService.addPenalties(50, Set.of(speedGdansk)));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(50));
    }

    @Test
    public void testGetTaxPayers() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdansk, speedGdynia), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }

    @Test
    public void testGetTaxPayersEmpty() {
        taxService = new TaxService();
        Assertions.assertEquals(Collections.EMPTY_MAP,taxService.getTaxPayers());
    }

    @Test
    public void testGetTaxPayersByPersonalCode() {
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testGetTaxPayersByPersonalCodeNotExist() {
        Assertions.assertNull(taxService.getTaxPayersByPersonalCode(40));
    }

    @Test
    public void testGetTaxPayersByPenaltyType() {
        Map<Integer, Set<Penalty>> expected  =Map.of(25,Set.of (speedGdansk,speedGdynia),35,Set.of(speedGdynia));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPenaltyType("Speed"));
    }

    @Test
    public void testGetTaxPayersByPenaltyTypeNotExist() {
        Assertions.assertEquals(Collections.EMPTY_MAP,taxService.getTaxPayersByPenaltyType("Alcohol Intoxication"));
    }

    @Test
    public void testGetTaxPayersByCity() {
        Map<Integer, Set<Penalty>> expected  =Map.of(25,Set.of (speedGdansk),35,Set.of(techInspectionGdansk));
        Assertions.assertEquals(expected, taxService.getTaxPayersByCity("Gdansk"));
    }

    @Test
    public void testGetTaxPayersByCityNotExist() {
        Assertions.assertEquals(Collections.EMPTY_MAP, taxService.getTaxPayersByCity("Sopot"));
    }

    @Test
    public void testRemovePenalty() {
        taxService.removePenalty(25, speedGdynia);
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdansk), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }

    @Test
    public void testRemoveNotExistPenalty() {
        taxService.removePenalty(25, techInspectionGdansk);
        Set<Penalty> expected =  Set.of(speedGdansk,speedGdynia);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testRemovePenaltyNotExistPerson() {
        taxService.removePenalty(40, techInspectionGdansk);
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdynia,speedGdansk), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }

    @Test
    public void testReplacePenaltyInformation() {
        taxService.replacePenaltyInformation(25, Set.of(techInspectionGdynia));
        Set<Penalty> expected =  Set.of(techInspectionGdynia);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testReplacePenaltyInformationNotExistPerson() {
        taxService.replacePenaltyInformation(40, Set.of(techInspectionGdynia));
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdynia,speedGdansk), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia),40,Set.of(techInspectionGdynia));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }
}
