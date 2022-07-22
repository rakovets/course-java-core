package com.rakovets.course.java.core.practice.jcf_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TaxServiceTest {
    Penalty speedGdansk = new Penalty("Speed", "Gdansk");
    Penalty speedGdynia = new Penalty("Speed", "Gdynia");
    Penalty techInspectionGdynia = new Penalty("Technical Inspection", "Gdynia");
    Penalty techInspectionGdansk = new Penalty("Technical Inspection", "Gdansk");
    TaxService taxService = new TaxService();

    @BeforeEach
    public void setUp() {
        Map<Integer, Set<Penalty>> start = new <Integer, Set<Penalty>>HashMap();
        start.put(25, new HashSet<>(Arrays.asList(speedGdansk, speedGdynia)));
        start.put(35, new HashSet<>(Arrays.asList(speedGdynia, techInspectionGdansk)));
        start.put(45, new HashSet<>(List.of(techInspectionGdynia)));
        taxService.addMap(start);
    }

    @Test
    public void testAddPerson() {
        Assertions.assertEquals(techInspectionGdansk, taxService.addPenalties(25, techInspectionGdansk));
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
        List<Penalty> expected = List.of(speedGdansk, speedGdynia, speedGdynia);
        Assertions.assertEquals(expected, taxService.getTaxPayersByPenaltyType("Speed"));
    }

    @Test
    public void testGetTaxPayersByCity() {
        List<Penalty> expected = List.of(speedGdansk, techInspectionGdansk);
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
