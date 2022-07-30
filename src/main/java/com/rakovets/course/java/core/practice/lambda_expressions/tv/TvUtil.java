package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TvUtil {
    /**
     * Search for TVs diagonally.
     *
     * @param tvList   for search.
     * @param diagonal for search.
     * @return list of TVs matching the requirement.
     */
    public List<Tv> searchTvByDiagonal(List<Tv> tvList, double diagonal) {
        return tvList.stream()
                .filter(tv -> tv.getDiagonal() == diagonal).collect(Collectors.toList());
    }

    /**
     * Search TVs by model.
     *
     * @param tvList       for search.
     * @param manufacturer for search.
     * @return list of TVs matching the requirement.
     */
    public List<Tv> searchTvByModel(List<Tv> tvList, String manufacturer) {
        return tvList.stream()
                .filter(tv -> Objects.equals(tv.getManufacturer(), manufacturer)).collect(Collectors.toList());
    }

    /**
     * Search TVs by year.
     *
     * @param tvList for search.
     * @param year   for search.
     * @return list of TVs matching the requirement.
     */
    public List<Tv> searchTvByYear(List<Tv> tvList, int year) {
        return tvList.stream()
                .filter(tv -> tv.getYear() >= year).collect(Collectors.toList());
    }

    /**
     * Search TVs by price.
     *
     * @param tvList       for search.
     * @param minimalPrice for search.
     * @param maximumPrice for search.
     * @return list of TVs matching the requirement.
     */
    public List<Tv> searchTvByPrice(List<Tv> tvList, double minimalPrice, double maximumPrice) {
        return tvList.stream()
                .filter(tv -> tv.getPrice() >= minimalPrice && tv.getPrice() <= maximumPrice)
                .collect(Collectors.toList());
    }

    /**
     * Search for TV at increasing price.
     *
     * @param tvList for search.
     * @return list of TVs matching the requirement.
     */
    public List<Tv> searchByAsc(List<Tv> tvList) {
        return tvList.stream()
                .sorted(Comparator.comparingDouble(Tv::getPrice))
                .collect(Collectors.toList());
    }

    /**
     * Search for a TV by decreasing price.
     *
     * @param tvList for search.
     * @return list of TVs matching the requirement.
     */
    public List<Tv> searchByDescending(List<Tv> tvList) {
        return tvList.stream()
                .sorted(Comparator.comparingDouble(Tv::getPrice).reversed())
                .collect(Collectors.toList());
    }

    /**
     * Search for a TV in diagonal ascending order.
     *
     * @param tvList for search.
     * @return list of TVs matching the requirement.
     */
    public List<Tv> searchByDiagonalAsc(List<Tv> tvList) {
        return tvList.stream()
                .sorted(Comparator.comparingDouble(Tv::getDiagonal))
                .collect(Collectors.toList());
    }

    /**
     * Search for TV in descending diagonal.
     *
     * @param tvList for search.
     * @return list of TVs matching the requirement.
     */
    public List<Tv> searchByDiagonalDescending(List<Tv> tvList) {
        return tvList.stream()
                .sorted(Comparator.comparingDouble(Tv::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
