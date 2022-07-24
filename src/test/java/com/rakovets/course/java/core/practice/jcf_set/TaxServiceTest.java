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
    private final TaxService taxService = new TaxService();

    @BeforeEach
    public void setUp() {
        Map<Integer, Set<Penalty>> taxPayers = new HashMap<>();
        taxPayers.put(25, new HashSet<>(Arrays.asList(speedGdansk, speedGdynia)));
        taxPayers.put(35, new HashSet<>(Arrays.asList(speedGdynia, techInspectionGdansk)));
        taxPayers.put(45, new HashSet<>(List.of(techInspectionGdynia)));
        taxService.addMap(taxPayers);
    }

    @Test
    public void testUniquePenalties() {
        Set <Penalty> set = new HashSet<>(Set.of(speedGdynia));
        Penalty speedGdyniaRepeat = new Penalty("Speed", "Gdynia");
        set.add(speedGdyniaRepeat);
        Assertions.assertEquals(1,set.size());
    }

    @Test
    public void testAddPerson() {
        Assertions.assertEquals(techInspectionGdansk, taxService.addPenalty(25, techInspectionGdansk));
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia, techInspectionGdansk);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testAddPenalties() {
        Assertions.assertEquals(Set.of(techInspectionGdynia), taxService.addPenalties(25, Set.of(techInspectionGdynia, speedGdynia)));
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia, techInspectionGdynia);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testGetTaxPayers() {
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdansk, speedGdynia), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }

    @Test
    public void testGetTaxPayersByPersonalCode() {
        Set<Penalty> expected = Set.of(speedGdansk, speedGdynia);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPersonalCode(25));
    }

    @Test
    public void testGetTaxPayersByPenaltyType() {
        Map<Integer, Set<Penalty>> expected  =Map.of(25,Set.of (speedGdansk,speedGdynia),35,Set.of(speedGdynia));
        Assertions.assertEquals(expected, taxService.getTaxPayersByPenaltyType("Speed"));
    }

    @Test
    public void testGetTaxPayersByCity() {
        Map<Integer, Set<Penalty>> expected  =Map.of(25,Set.of (speedGdansk),35,Set.of(techInspectionGdansk));
        Assertions.assertEquals(expected, taxService.getTaxPayersByCity("Gdansk"));
    }

    @Test
    public void testAddPersonExist() {
        Set<Penalty> expected = Set.of(techInspectionGdynia, techInspectionGdansk);
        Assertions.assertEquals(expected, taxService.addPerson(45, Set.of(techInspectionGdansk)));
    }

    @Test
    public void testAddPersonNotExist() {
        Set<Penalty> expected = Set.of(techInspectionGdansk);
        Assertions.assertEquals(expected, taxService.addPerson(55, Set.of(techInspectionGdansk)));
    }

    @Test
    public void testRemovePenalty() {
        taxService.removePenalty(25, speedGdynia);
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(speedGdansk), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }

    @Test
    public void testReplacePenaltyInformation() {
        taxService.replacePenaltyInformation(25, Set.of(techInspectionGdynia));
        Map<Integer, Set<Penalty>> expected = Map.of(25, Set.of(techInspectionGdynia), 35, Set.of(speedGdynia, techInspectionGdansk), 45, Set.of(techInspectionGdynia));
        Assertions.assertEquals(expected, taxService.getTaxPayers());
    }
}
