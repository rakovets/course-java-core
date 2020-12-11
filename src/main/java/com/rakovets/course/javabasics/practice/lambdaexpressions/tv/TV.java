package com.rakovets.course.javabasics.practice.lambdaexpressions.tv;

import com.rakovets.course.javabasics.practice.lambdaexpressions.tv.model.TVModel;

import java.util.List;
import java.util.stream.Collectors;

public class TV {
    public static List<TVModel> getListOfTVWithGivenDiagonal(List<TVModel> listOfTv, int diagonal) {
        return listOfTv.stream()
                .filter(tv-> tv.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public static List<TVModel> getListOfTVWithGivenManufacturer(List<TVModel> listOfTv, String manufacturer) {
        return listOfTv.stream()
                .filter(tv-> tv.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public static List<TVModel> getListOfTVOverGivenYear(List<TVModel> listOfTV, int  year) {
        return listOfTV.stream()
                .filter(tv-> tv.getYear() >= year)
                .collect(Collectors.toList());
    }

    public static List<TVModel> getListOfTVWithGivenPriceRange(List<TVModel> listOfTV, int firstPrice, int secondPrice) {
        return listOfTV.stream()
                .filter(tv-> tv.getPrice() >= firstPrice && tv.getPrice() <= secondPrice)
                .collect(Collectors.toList());
    }

    public static List<TVModel> getListOfSortedTVByPrice(List<TVModel> listOfTV, boolean isReversed) {
        return listOfTV.stream()
                .sorted(new PriceComparator(isReversed))
                .collect(Collectors.toList());
    }

    public static List<TVModel> getListOfSortedTVByDiagonal(List<TVModel> listOfTV, boolean isReversed) {
        return listOfTV.stream()
                .sorted(new DiagonalComparator(isReversed))
                .collect(Collectors.toList());
    }
}
