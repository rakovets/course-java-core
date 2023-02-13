package com.rakovets.course.java.core.practice.jcf_set.service.impl;

import com.rakovets.course.java.core.practice.jcf_set.Fine;
import com.rakovets.course.java.core.practice.jcf_set.FineType;
import com.rakovets.course.java.core.practice.jcf_set.Region;
import com.rakovets.course.java.core.practice.jcf_set.dao.FineDao;
import com.rakovets.course.java.core.practice.jcf_set.dao.impl.FineDaoImpl;
import com.rakovets.course.java.core.practice.jcf_set.service.FineService;

import java.util.Set;

public class FineServiceImpl implements FineService {
    private final static FineDao fineDao = new FineDaoImpl();

    @Override
    public boolean add(Fine fine) {
        return fineDao.add(fine);
    }

    @Override
    public Set<Fine> listAllFines() {
        return fineDao.listAllFines();
    }

    @Override
    public Set<Fine> listFinesByUserId(long id) {
        return fineDao.listFinesByUserId(id);
    }

    @Override
    public Set<Fine> listFinesByFineType(FineType fineType) {
        return fineDao.listFinesByFineType(fineType);
    }

    @Override
    public Set<Fine> listFinesByRegion(Region region) {
        return fineDao.listFinesByRegion(region);
    }

    @Override
    public boolean updateFine(Fine fine) {
        return fineDao.updateFine(fine);
    }

    @Override
    public boolean deleteFine(Fine fine) {
        return fineDao.deleteFine(fine);
    }
}
