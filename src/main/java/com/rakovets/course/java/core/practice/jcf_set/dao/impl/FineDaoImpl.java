package com.rakovets.course.java.core.practice.jcf_set.dao.impl;

import com.rakovets.course.java.core.practice.jcf_set.Fine;
import com.rakovets.course.java.core.practice.jcf_set.FineType;
import com.rakovets.course.java.core.practice.jcf_set.Region;
import com.rakovets.course.java.core.practice.jcf_set.dao.FineDao;

import java.util.HashSet;
import java.util.Set;

public class FineDaoImpl implements FineDao {
    private static long id = 1l;
    private Set<Fine> finesSet = new HashSet<>();

    @Override
    public boolean add(Fine fine) {
        fine.setId(id++);
        finesSet.add(fine);
        return finesSet.contains(fine);
    }

    @Override
    public Set<Fine> listAllFines() {
        return finesSet;
    }

    @Override
    public Set<Fine> listFinesByUserId(long id) {
        Set<Fine> userFines = new HashSet<>();
        Fine[] fines = finesSet.toArray(new Fine[0]);
        for (Fine fine : fines) {
            if (fine.getUser().getId() == id) {
                userFines.add(fine);
            }
        }
        return userFines;
    }

    @Override
    public Set<Fine> listFinesByFineType(FineType fineType) {
        Set<Fine> typeFines = new HashSet<>();
        Fine[] fines = (Fine[]) finesSet.toArray();
        for (Fine fine : fines) {
            if (fine.getFineType() == fineType) {
                typeFines.add(fine);
            }
        }
        return typeFines;
    }

    @Override
    public Set<Fine> listFinesByRegion(Region region) {
        Set<Fine> regionFines = new HashSet<>();
        Fine[] fines = (Fine[]) finesSet.toArray();
        for (Fine fine : fines) {
            if (fine.getRegion() == region) {
                regionFines.add(fine);
            }
        }
        return regionFines;
    }

    @Override
    public boolean updateFine(Fine fine) {
        if (finesSet.contains(fine)) {
            finesSet.add(fine);
            return true;
        }
        return false;
    }

    public boolean deleteFine(Fine fine) {
        return finesSet.remove(fine);
    }
}
