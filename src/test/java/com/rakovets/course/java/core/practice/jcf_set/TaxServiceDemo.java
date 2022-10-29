package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.Enum.City;
import com.rakovets.course.java.core.practice.jcf_set.Enum.FineType;


import java.util.*;

public class TaxServiceDemo {
    public static void main(String[] args) {
        Set<Fine> fineDataBase = new HashSet<>();
        HashSet<Taxpayer> taxpayerDataBase = new HashSet<>();
        TaxService taxService = new TaxService(taxpayerDataBase);

        Fine fine1 = new Fine(FineType.PROPERTY_DAMAGE, 1011);
        Fine fine2 = new Fine(FineType.NON_PROPERTY_DAMAGE,1012);
        Fine fine3 = new Fine(FineType.FAILURE_TO_COMPLY_WITH_CIVIL_LAW,1013);
        Fine fine4 = new Fine(FineType.FAILURE_TO_COMPLY_WITH_CONTRACTUAL_OBLIGATIONS, 1014);
        Fine fine5 = new Fine(FineType.NON_PROPERTY_DAMAGE,1015);
        fineDataBase.add(fine1);
        fineDataBase.add(fine2);
        fineDataBase.add(fine3);
        fineDataBase.add(fine4);

        Taxpayer mark = new Taxpayer("Mark Bukovski ",120381,new HashSet<>(List.of(new Fine(FineType.PROPERTY_DAMAGE,1011))), City.KRASNOYARSK);
        Taxpayer alex = new Taxpayer("Alex Smith",19034,new HashSet<>(List.of(new Fine(FineType.NON_PROPERTY_DAMAGE,1012))), City.OMSK);
        Taxpayer aydin = new Taxpayer("Aydin Pamuk",856823,new HashSet<>(List.of(new Fine(FineType.FAILURE_TO_COMPLY_WITH_CONTRACTUAL_OBLIGATIONS,1014))), City.IRKUTSK);
        Taxpayer olga = new Taxpayer("Olga Kurelenko",532876,new HashSet<>(List.of(new Fine(FineType.FAILURE_TO_COMPLY_WITH_CIVIL_LAW,1013))), City.NOVOSIBIRSK);
        taxpayerDataBase.add(mark);
        taxpayerDataBase.add(alex);
        taxpayerDataBase.add(aydin);

        System.out.println(taxService.showInfById(19034));
        System.out.println(" ");
        System.out.println(taxService.showInfByCity(City.IRKUTSK));
        System.out.println(" ");
        System.out.println(taxService.showInfByFineType(FineType.FAILURE_TO_COMPLY_WITH_CONTRACTUAL_OBLIGATIONS));
        System.out.println(" ");
        System.out.println(taxService.showAllInf());
        System.out.println(" ");

        mark.addFine(fine5, taxpayerDataBase);
        System.out.println(taxService.showInfById(120381));
        System.out.println(" ");

        mark.removeFine(fine1, taxpayerDataBase);
        System.out.println(taxService.showInfById(120381));
        System.out.println(" ");

        taxService.addNewTaxpayer(olga);
        System.out.println(taxService.showInfById(532876));
        System.out.println(" ");

        aydin.updateTaxPayerInf(taxpayerDataBase, City.KRASNOYARSK, 856823);
        System.out.println(taxService.showInfById(856823));
        System.out.println(" ");

        olga.updateTaxPayerFine(taxpayerDataBase, fine5, 532876);
        System.out.println(taxService.showInfById(532876));
    }
}
