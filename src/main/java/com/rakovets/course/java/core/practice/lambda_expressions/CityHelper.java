package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class CityHelper {
    public Collection<String> getUniqueCities(Collection<String> collection) {
        return collection.stream()
                .collect(Collectors.toSet());
    }

    public Collection<String> getCitiesLimitedByLength(Collection<String> collection, int cityLength) {
        return collection.stream()
                .filter(x -> x.length() > cityLength)
                .collect(Collectors.toSet());
    }

    public Collection<String> getCitiesStartWithSymbol(Collection<String> collection, char symbol, int position) {
        return collection.stream()
                .filter(x -> x.charAt(position) == symbol)
                .collect(Collectors.toSet());
    }

    public long cityUsageCounter(Collection<String> collection, String cityName) {
        return collection.stream()
                .filter(x -> Objects.equals(x, cityName))
                .count();
    }
}
