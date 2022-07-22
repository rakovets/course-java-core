package com.rakovets.course.java.core.practice.jcf_set;

import java.util.*;

public class TaxService {
    Map<Integer, Set<Penalty>> taxPayers = new HashMap<>();

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

    public Penalty addPenalties(int personalCode, Penalty penalty) {
        Set<Penalty> set = taxPayers.get(personalCode);
        return set.add(penalty) ? penalty : null;
    }

    public Set<Penalty> addPenalties(int personalCode, Set<Penalty> penalties) {
        Set<Penalty> existing = taxPayers.get(personalCode);
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

    public List<Penalty> getTaxPayersByPenaltyType(String typePenalty) {
        List<Penalty> penalties = new ArrayList<>();
        for (Set<Penalty> set : taxPayers.values()) {
            penalties.addAll(set);
        }
        List<Penalty> result = new ArrayList<>();
        for (Penalty s : penalties) {
            if (Objects.equals(s.getTypePenalty(), typePenalty)) {
                result.add(s);
            }
        }
        return result;
    }

    public List<Penalty> getTaxPayersByCity(String city) {
        List<Penalty> penalties = new ArrayList<>();
        for (Set<Penalty> set : taxPayers.values()) {
            penalties.addAll(set);
        }
        List<Penalty> result = new ArrayList<>();
        for (Penalty s : penalties) {
            if (Objects.equals(s.getCity(), city)) {
                result.add(s);
            }
        }
        return result;
    }

    public void removePenalty(int personalCode, Penalty penalty) {
        Set<Penalty> set = getTaxPayersByPersonalCode(personalCode);
        set.remove(penalty);
    }

    public void replacePenaltyInformation(int personalCode, Set<Penalty> penalty) {
        taxPayers.put(personalCode, penalty);
    }
}
