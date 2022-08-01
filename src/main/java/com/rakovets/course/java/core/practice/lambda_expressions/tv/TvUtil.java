package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TvUtil {
    Collection<Tv> tvCollection;

    public TvUtil(Collection<Tv> tvCollection) {
        this.tvCollection = tvCollection;
    }

    public List<Tv> getTvByDiagonal(double diagonal) {
        return this.tvCollection.stream().filter(x -> x.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<Tv> getTvByManufacturer(String manufacturer) {
        return this.tvCollection.stream()
                .filter(x -> x.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Tv> getTvNotOlderYear(int year) {
        return this.tvCollection.stream()
                .filter(x -> x.getYear() >= year)
                .collect(Collectors.toList());
    }

    public List<Tv> getTvByPriceRange(double priceFrom, double priceTo) {
        return this.tvCollection.stream()
                .filter(x -> x.getPrice() >= priceFrom && x.getPrice() <= priceTo)
                .collect(Collectors.toList());
    }

    public List<Tv> getSortedTvByPriceAsc() {
        return this.tvCollection.stream()
                .sorted((x, y) -> Double.compare(x.getPrice(), y.getPrice()))
                .collect(Collectors.toList());
    }

    public List<Tv> getSortedTvByPriceDesc() {
        return this.tvCollection.stream()
                .sorted((x, y) -> Double.compare(y.getPrice(), x.getPrice()))
                .collect(Collectors.toList());
    }

    public List<Tv> getSortedTvByDiagonalAsc() {
        return this.tvCollection.stream()
                .sorted((x, y) -> Double.compare(x.getDiagonal(), y.getDiagonal()))
                .collect(Collectors.toList());
    }

    public List<Tv> getSortedTvByDiagonalDesc() {
        return this.tvCollection.stream()
                .sorted((x, y) -> Double.compare(y.getDiagonal(), x.getDiagonal()))
                .collect(Collectors.toList());
    }
}
