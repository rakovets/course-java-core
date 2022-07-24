package com.rakovets.course.java.core.practice.jcf_set;

import java.util.*;

public class TaxService {
    private final Map<Integer, Set<Penalty>> taxPayers = new HashMap<>();

    public Set<Penalty> addPerson(int personalCode, Set<Penalty> set) {
        if (taxPayers.containsKey(personalCode)) {
            addPenalties(personalCode, set);
            return getTaxPayersByPersonalCode(personalCode);
        } else {
            taxPayers.put(personalCode, set);
            return getTaxPayersByPersonalCode(personalCode);
        }
    }

    public void addMap(Map<Integer, Set<Penalty>> map) {
        taxPayers.putAll(map);
    }

    public Penalty addPenalty(int personalCode, Penalty penalty) {
        Set<Penalty> set = getTaxPayersByPersonalCode(personalCode);
        return set.add(penalty) ? penalty : null;
    }

    public Set<Penalty> addPenalties(int personalCode, Set<Penalty> penalties) {
        Set<Penalty> existing = getTaxPayersByPersonalCode(personalCode);
        Set<Penalty> result = new HashSet<>();
        for (Penalty penalty : penalties) {
            if (!existing.contains(penalty)) {
                result.add(penalty);
            }
        }
        existing.addAll(penalties);
        return result;
    }

    public Map<Integer, Set<Penalty>> getTaxPayers() {
        return taxPayers;
    }

    public Set<Penalty> getTaxPayersByPersonalCode(int personalCode) {
        return taxPayers.get(personalCode);
    }

    public Map<Integer, Set<Penalty>> getTaxPayersByPenaltyType(String typePenalty) {
        Map<Integer, Set<Penalty>> taxPayersByTypePenalty = new HashMap<>();
        for (Map.Entry<Integer, Set<Penalty>> entry : taxPayers.entrySet()) {
            Set<Penalty> personPenalties = new HashSet<>();
            for (Penalty penalty : entry.getValue()) {
                if (Objects.equals(penalty.getTypePenalty(), typePenalty)) {
                    personPenalties.add(penalty);
                }
            }
            if (!personPenalties.isEmpty()) {
                taxPayersByTypePenalty.put(entry.getKey(), personPenalties);
            }
        }
        return taxPayersByTypePenalty;
    }

    public Map<Integer, Set<Penalty>> getTaxPayersByCity(String city) {
        Map<Integer, Set<Penalty>> taxPayersByCity = new HashMap<>();
        for (Map.Entry<Integer, Set<Penalty>> entry : taxPayers.entrySet()) {
            Set<Penalty> personPenalties = new HashSet<>();
            for (Penalty penalty : entry.getValue()) {
                if (Objects.equals(penalty.getCity(), city)) {
                    personPenalties.add(penalty);
                }
            }
            if (!personPenalties.isEmpty()) {
                taxPayersByCity.put(entry.getKey(), personPenalties);
            }
        }
        return taxPayersByCity;
    }

    public void removePenalty(int personalCode, Penalty penalty) {
        Set<Penalty> set = getTaxPayersByPersonalCode(personalCode);
        set.remove(penalty);
    }

    public void replacePenaltyInformation(int personalCode, Set<Penalty> penalty) {
        taxPayers.put(personalCode, penalty);
    }
}
