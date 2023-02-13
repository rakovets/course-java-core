package com.rakovets.course.java.core.practice.jcf_set.controller;

import com.rakovets.course.java.core.practice.jcf_set.Fine;
import com.rakovets.course.java.core.practice.jcf_set.FineType;
import com.rakovets.course.java.core.practice.jcf_set.Region;
import com.rakovets.course.java.core.practice.jcf_set.service.FineService;
import com.rakovets.course.java.core.practice.jcf_set.service.impl.FineServiceImpl;

import java.util.Set;

public class FineController {
    private static final FineService fineService = new FineServiceImpl();

    public boolean add(Fine fine) {
        return fineService.add(fine);
    }
    public Set<Fine> listAllFines() {
        return fineService.listAllFines();
    }

    public Set<Fine> listFinesByUserId(long id) {
        return fineService.listFinesByUserId(id);
    }

    public Set<Fine> listFinesByFineType(FineType fineType) {
        return fineService.listFinesByFineType(fineType);
    }

    public Set<Fine> listFinesByRegion(Region region) {
        return fineService.listFinesByRegion(region);
    }

    public boolean updateFine(Fine fine) {
        return fineService.updateFine(fine);
    }


    public boolean deleteFine(Fine fine) {
        return fineService.deleteFine(fine);
    }
}
