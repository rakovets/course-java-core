package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class TvShop {
    private Collection<Tv> tvCollection;

    public TvShop(Collection<Tv> tvCollection) {
        this.tvCollection = tvCollection;
    }

    public Collection<Tv> getTvByDisplaySize(double displaySize) {
        return tvCollection.stream()
                .filter(x -> x.getDisplaySize() == displaySize)
                .collect(Collectors.toList());
    }

    public Collection<Tv> getTvByManufacturer(String manufacturer) {
        return tvCollection.stream()
                .filter(x -> Objects.equals(x.getManufacturer(), manufacturer))
                .collect(Collectors.toList());
    }

    public Collection<Tv> getTvByYearOfManufacture(int yearOfManufacture) {
        return tvCollection.stream()
                .filter(x -> x.getYearOfManufacture() >= yearOfManufacture)
                .collect(Collectors.toList());
    }

    public Collection<Tv> getTvByPrice(int minPrice, int maxPrice) {
        return tvCollection.stream()
                .filter(x -> x.getPrice() >= minPrice && x.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public Collection<Tv> getTvSortedByPriceAscending() {
        return tvCollection.stream()
                .sorted(Comparator.comparingDouble(Tv::getPrice))
                .collect(Collectors.toList());
    }

    public Collection<Tv> getTvSortedByPriceDescending() {
        return tvCollection.stream()
                .sorted(Comparator.comparingDouble(Tv::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public Collection<Tv> getTvSortedByDisplaySizeAscending() {
        return tvCollection.stream()
                .sorted(Comparator.comparingDouble(Tv::getDisplaySize))
                .collect(Collectors.toList());
    }
    public Collection<Tv> getTvSortedByDisplaySizeDescending() {
        return tvCollection.stream()
                .sorted(Comparator.comparingDouble(Tv::getDisplaySize).reversed())
                .collect(Collectors.toList());
    }
}
