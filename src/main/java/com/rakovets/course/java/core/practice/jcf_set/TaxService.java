package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.exception.PenaltyAlreadyExistException;
import com.rakovets.course.java.core.practice.jcf_set.exception.PersonAlreadyExistsException;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class TaxService {
    private final Map<Integer, Set<Penalty>> taxPayers = new HashMap<>();

    public void addPerson(int personalCode) {
        if (!taxPayers.containsKey(personalCode)) {
            taxPayers.put(personalCode, new HashSet<>());
        } else {
            throw new PersonAlreadyExistsException("This person has already been entered into the TaxSystem!");
        }
    }

    public Set<Penalty> getPersonInfo(int personalCode) {
        if (!taxPayers.containsKey(personalCode)) {
            return Collections.EMPTY_SET;
        }
        return getTaxPayersByPersonalCode(personalCode);
    }

    public Penalty addPenalty(int personalCode, Penalty penalty) {
        if (taxPayers.containsKey(personalCode)) {
            Set<Penalty> penalties = getTaxPayersByPersonalCode(personalCode);
            if (penalties.add(penalty)) {
                return penalty;
            } else {
                throw new PenaltyAlreadyExistException("This penalty has already been entered into the TaxSystem!");
            }
        } else {
            taxPayers.put(personalCode, Set.of(penalty));
            return penalty;
        }
    }

    public Set<Penalty> addPenalties(int personalCode, Set<Penalty> penalties) {
        if (taxPayers.containsKey(personalCode)) {
            Set<Penalty> existingPenalties = getTaxPayersByPersonalCode(personalCode);
            Set<Penalty> newPenalties = new HashSet<>();
            for (Penalty penalty : penalties) {
                if (!existingPenalties.contains(penalty)) {
                    newPenalties.add(penalty);
                }
            }
            existingPenalties.addAll(penalties);
            return newPenalties;
        } else {
            taxPayers.put(personalCode, penalties);
            return penalties;
        }
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
        Set<Penalty> penalties = getTaxPayersByPersonalCode(personalCode);
        if (!taxPayers.containsKey(personalCode)) {
            return;
        }
        penalties.remove(penalty);
    }

    public void replacePenaltyInformation(int personalCode, Set<Penalty> penalties) {
        if (!taxPayers.containsKey(personalCode)) {
            addPenalties(personalCode, penalties);
            return;
        }
        taxPayers.put(personalCode, penalties);
    }
}
