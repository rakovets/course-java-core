package com.rakovets.course.java.core.practice.jcf_set;

import java.util.*;

public class TaxService {
    private final Map<Integer, Set<Penalty>> taxPayers = new HashMap<>();

    public Set<Penalty> addPerson(int personalCode, Set<Penalty> penalties) {
        if (taxPayers.containsKey(personalCode)) {
            addPenalties(personalCode, penalties);
        } else {
            taxPayers.put(personalCode, penalties);
        }
        return getTaxPayersByPersonalCode(personalCode);
    }

    public Penalty addPenalty(int personalCode, Penalty penalty) {
        if (!taxPayers.containsKey(personalCode)) {
            addPerson(personalCode, Set.of(penalty));
            return penalty;
        }
        Set<Penalty> penalties = getTaxPayersByPersonalCode(personalCode);
        return penalties.add(penalty) ? penalty : null;
    }

    public Set<Penalty> addPenalties(int personalCode, Set<Penalty> penalties) {
        if (!taxPayers.containsKey(personalCode)) {
            addPerson(personalCode, penalties);
            return penalties;
        }
        Set<Penalty> existingPenalties = getTaxPayersByPersonalCode(personalCode);
        Set<Penalty> newPenalties = new HashSet<>();
        for (Penalty penalty : penalties) {
            if (!existingPenalties.contains(penalty)) {
                newPenalties.add(penalty);
            }
        }
        existingPenalties.addAll(penalties);
        return newPenalties;
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
        if (!taxPayers.containsKey(personalCode)) {
            return;
        }
        Set<Penalty> penalties = getTaxPayersByPersonalCode(personalCode);
        penalties.remove(penalty);
    }

    public void replacePenaltyInformation(int personalCode, Set<Penalty> penalties) {
        if (!taxPayers.containsKey(personalCode)) {
            addPerson(personalCode,penalties);
            return;
        }
        taxPayers.put(personalCode, penalties);
    }
}
