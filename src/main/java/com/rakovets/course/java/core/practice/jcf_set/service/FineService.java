package com.rakovets.course.java.core.practice.jcf_set.service;

import com.rakovets.course.java.core.practice.jcf_set.Fine;
import com.rakovets.course.java.core.practice.jcf_set.FineType;
import com.rakovets.course.java.core.practice.jcf_set.Region;

import java.util.Set;

public interface FineService {
    boolean add(Fine fine);
    Set<Fine> listAllFines();
    Set<Fine> listFinesByUserId(long id);
    Set<Fine> listFinesByFineType(FineType fineType);
    Set<Fine> listFinesByRegion(Region region);
    boolean updateFine(Fine fine);
    boolean deleteFine(Fine fine);
}
