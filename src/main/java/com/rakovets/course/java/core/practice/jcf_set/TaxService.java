package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public class TaxService {
    private SortedSet<Citizen> citizens;
    private SortedSet<Fine> fines;

    public TaxService(SortedSet<Citizen> citizens, SortedSet<Fine> fines) {
        this.citizens = citizens;
        this.fines = fines;
    }

    public Citizen getCitizenById(int citizenId) {
        for (Citizen citizen : citizens) {
            if (citizen.getId() == citizenId) {
                return citizen;
            }
        }
        throw new NumberFormatException("Citizen does not exist");
    }

    public Set<Citizen> getCitizensByCity(String city) {
        Set<Citizen> citizensByCity = new HashSet<>();
        for (Citizen citizen : citizens) {
            if (citizen.getLocationCity() == city) {
                citizensByCity.add(citizen);
            }
        }
        return citizensByCity;
    }

    public Set<Citizen> getCitizensByFineArticle(double articleId) {
        Set<Citizen> citizensWithFire = new HashSet<>();
        for (Fine fine : fines) {
            if (fine.getArticle() == articleId) {
                citizensWithFire.add(getCitizenById(fine.getCitizenId()));
            }
        }
        return citizensWithFire;
    }

    public Set<Fine> getFinesByCitizenId(int citizenId) {
        Set<Fine> finesByCitizenId = new HashSet<>();
        for (Fine fine : fines) {
            if (fine.getCitizenId() == citizenId) {
                finesByCitizenId.add(fine);
            }
        }
        return finesByCitizenId;
    }

    public Fine getFineById(int fineId) {
        for (Fine fine : fines) {
            if (fine.getFineId() == fineId) {
                return fine;
            }
        }
        throw new NumberFormatException("Fine does not exist");
    }

    public void removeFineById(int fineId) {
        Iterator<Fine> iterator = fines.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFineId() == fineId) {
                iterator.remove();
                break;
            }
        }
    }

    public void changeCitizenLocationCity(int citizenId, String city) {
        getCitizenById(citizenId).setLocationCity(city);
    }

    public void changeFinePaid(int fineId, boolean isPaid) {
        getFineById(fineId).setIsPaid(isPaid);
    }

    public Citizen getLastCitizen() {
        return getCitizens().last();
    }

    public Fine getLastFine() {
        return getFines().last();
    }

    public SortedSet<Citizen> getCitizens() {
        return citizens;
    }

    public SortedSet<Fine> getFines() {
        return fines;
    }

    @Override
    public String toString() {
        return "TaxService{" + "citizens=" + citizens + '}';
    }
}
