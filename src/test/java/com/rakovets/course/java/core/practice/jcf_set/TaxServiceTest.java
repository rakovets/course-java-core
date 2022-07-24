package com.rakovets.course.java.core.practice.jcf_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TaxServiceTest {
    private final static Penalty SPEED_GDANSK = new Penalty("Speed", "Gdansk");
    private final static Penalty SPEED_GDYNIA = new Penalty("Speed", "Gdynia");
    private final static Penalty TECH_INSPECTION_GDYNIA = new Penalty("Technical Inspection", "Gdynia");
    private final static Penalty TECH_INSPECTION_GDANSK = new Penalty("Technical Inspection", "Gdansk");
    private TaxService taxService = new TaxService();

    @BeforeEach
    public void setUp() {
        Map<Integer, Set<Penalty>> taxPayers = new HashMap<>();
        taxPayers.put(25, new HashSet<>(Arrays.asList(SPEED_GDANSK, SPEED_GDYNIA)));
        taxPayers.put(35, new HashSet<>(Arrays.asList(SPEED_GDYNIA, TECH_INSPECTION_GDANSK)));
        taxPayers.put(45, new HashSet<>(List.of(TECH_INSPECTION_GDYNIA)));
        taxService.getTaxPayers().putAll(taxPayers);
    }

    @Test
    public void testUniquePenalties() {
        Set<Penalty> set = new HashSet<>(Set.of(SPEED_GDYNIA));
        Penalty speedGdyniaRepeat = new Penalty("Speed", "Gdynia");
        set.add(speedGdyniaRepeat);
        Assertions.assertEquals(1, set.size());
    }

    @Test
    public void testAddNewPerson() {
        Assertions.assertEquals(Collections.EMPTY_SET, taxService.addOrGetPersonInfo(55));
        Assertions.assertEquals(Collections.EMPTY_SET, taxService.getTaxPayersByPersonalCode(55));
    }

    @Test
    public void testGetInfoExistingPerson() {
        Set<Penalty> expected = Set.of(TECH_INSPECTION_GDYNIA);
        Assertions.assertEquals(expected, taxService.addOrGetPersonInfo(45));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(45));
    }

    @Test
    public void testAddNewPenalty() {
        Assertions.assertEquals(TECH_INSPECTION_GDANSK, taxService.addPenalty(25, TECH_INSPECTION_GDANSK));
        Set<Penalty> expected = Set.of(SPEED_GDANSK, SPEED_GDYNIA, TECH_INSPECTION_GDANSK);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddExistingPenalty() {
        Assertions.assertNull(taxService.addPenalty(25, SPEED_GDANSK));
        Set<Penalty> expected = Set.of(SPEED_GDANSK, SPEED_GDYNIA);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddNewPersonWithAddPenaltyMethod() {
        Set<Penalty> expected = Set.of(SPEED_GDANSK);
        Assertions.assertEquals(SPEED_GDANSK, taxService.addPenalty(50, SPEED_GDANSK));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(50));
    }

    @Test
    public void testAddNewPenalties() {
        Assertions.assertEquals(Set.of(TECH_INSPECTION_GDYNIA), taxService.addPenalties(25, Set.of(TECH_INSPECTION_GDYNIA, SPEED_GDYNIA)));
        Set<Penalty> expected = Set.of(SPEED_GDANSK, SPEED_GDYNIA, TECH_INSPECTION_GDYNIA);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddExistingPenalties() {
        Set<Penalty> expected = Set.of(SPEED_GDANSK, SPEED_GDYNIA);
        Assertions.assertEquals(Collections.EMPTY_SET, taxService.addPenalties(25, Set.of(SPEED_GDYNIA, SPEED_GDANSK)));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddExistingAndNewPenalties() {
        Set<Penalty> expected = Set.of(SPEED_GDYNIA, SPEED_GDANSK, TECH_INSPECTION_GDANSK);
        Assertions.assertEquals(Set.of(TECH_INSPECTION_GDANSK), taxService.addPenalties(25, Set.of(SPEED_GDANSK, TECH_INSPECTION_GDANSK)));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddNewPersonWithAddPenaltiesMethod() {
        Set<Penalty> expected = Set.of(SPEED_GDANSK);
        Assertions.assertEquals(expected, taxService.addPenalties(50, Set.of(SPEED_GDANSK)));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(50));
    }

    @Test
    public void testGetTaxPayers() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(SPEED_GDANSK, SPEED_GDYNIA), 35, Set.of(SPEED_GDYNIA, TECH_INSPECTION_GDANSK), 45, Set.of(TECH_INSPECTION_GDYNIA));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }

    @Test
    public void testGetTaxPayersEmpty() {
        taxService = new TaxService();
        Assertions.assertEquals(Collections.EMPTY_MAP, taxService.getTaxPayers());
    }

    @Test
    public void testGetTaxPayersByPersonalCode() {
        Set<Penalty> expected = Set.of(SPEED_GDANSK, SPEED_GDYNIA);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testGetTaxPayersByPersonalCodeNotExist() {
        Assertions.assertNull(taxService.getTaxPayersByPersonalCode(40));
    }

    @Test
    public void testGetTaxPayersByPenaltyType() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(SPEED_GDANSK, SPEED_GDYNIA), 35, Set.of(SPEED_GDYNIA));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPenaltyType("Speed"));
    }

    @Test
    public void testGetTaxPayersByPenaltyTypeNotExist() {
        Assertions.assertEquals(Collections.EMPTY_MAP, taxService.getTaxPayersByPenaltyType("Alcohol Intoxication"));
    }

    @Test
    public void testGetTaxPayersByCity() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(SPEED_GDANSK), 35, Set.of(TECH_INSPECTION_GDANSK));
        Assertions.assertEquals(expected, taxService.getTaxPayersByCity("Gdansk"));
    }

    @Test
    public void testGetTaxPayersByCityNotExist() {
        Assertions.assertEquals(Collections.EMPTY_MAP, taxService.getTaxPayersByCity("Sopot"));
    }

    @Test
    public void testRemovePenalty() {
        taxService.removePenalty(25, SPEED_GDYNIA);
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(SPEED_GDANSK), 35, Set.of(SPEED_GDYNIA, TECH_INSPECTION_GDANSK), 45, Set.of(TECH_INSPECTION_GDYNIA));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }

    @Test
    public void testRemoveNotExistPenalty() {
        taxService.removePenalty(25, TECH_INSPECTION_GDANSK);
        Set<Penalty> expected = Set.of(SPEED_GDANSK, SPEED_GDYNIA);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testRemovePenaltyNotExistPerson() {
        taxService.removePenalty(40, TECH_INSPECTION_GDANSK);
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(SPEED_GDYNIA, SPEED_GDANSK), 35, Set.of(SPEED_GDYNIA, TECH_INSPECTION_GDANSK), 45, Set.of(TECH_INSPECTION_GDYNIA));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }

    @Test
    public void testReplacePenaltyInformation() {
        taxService.replacePenaltyInformation(25, Set.of(TECH_INSPECTION_GDYNIA));
        Set<Penalty> expected = Set.of(TECH_INSPECTION_GDYNIA);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testReplacePenaltyInformationNotExistPerson() {
        taxService.replacePenaltyInformation(40, Set.of(TECH_INSPECTION_GDYNIA));
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(SPEED_GDYNIA, SPEED_GDANSK), 35, Set.of(SPEED_GDYNIA, TECH_INSPECTION_GDANSK), 45, Set.of(TECH_INSPECTION_GDYNIA), 40, Set.of(TECH_INSPECTION_GDYNIA));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }
}
