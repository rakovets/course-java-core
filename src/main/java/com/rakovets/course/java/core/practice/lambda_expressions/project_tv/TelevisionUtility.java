package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TelevisionUtility {
    public List<Television> getTelevisionByDiagonal(List<Television> televisions, int diagonalSize) {
        return televisions.stream()
                .filter(x -> x.getDiagonalSize() == diagonalSize)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Television> getTelevisionByModel(List<Television> televisions, String modelName) {
        return televisions.stream()
                .filter(x -> x.getModelName() == modelName)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Television> getTelevisionByProducerCompany(List<Television> televisions, String producerCompany) {
        return televisions.stream()
                .filter(x -> x.getProducerCompany() == producerCompany)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Television> getTelevisionByYearOfProduction(List<Television> televisions, int year) {
        return televisions.stream()
                .filter(x -> x.getYearOfProduction() >= year)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Television> getTelevisionBypPriceRange(List<Television> televisions, double minPrice, double maxPrice) {
        return televisions.stream()
                .filter(x -> x.getPrice() >= minPrice && x.getPrice() <= maxPrice)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Television> sortTelevisionBypPriceUp(List<Television> televisions) {
        return televisions.stream()
                .sorted((a, b) -> (int) (a.getPrice() - b.getPrice()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Television> sortTelevisionBypPriceDown(List<Television> televisions) {
        return televisions.stream()
                .sorted((a, b) -> (int) (b.getPrice() - a.getPrice()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Television> sortTelevisionBypDiagonalUp(List<Television> televisions) {
        return televisions.stream()
                .sorted((a, b) -> (int) (a.getDiagonalSize() - b.getDiagonalSize()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Television> sortTelevisionBypDiagonalDown(List<Television> televisions) {
        return televisions.stream()
                .sorted((a, b) -> (int) (b.getDiagonalSize() - a.getDiagonalSize()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Television> sortTelevisionByProducerCompanyUp(List<Television> televisions) {
        return televisions.stream()
                .sorted((a, b) -> a.getProducerCompany().compareTo(b.getProducerCompany()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Television> sortTelevisionByProducerCompanyDown(List<Television> televisions) {
        return televisions.stream()
                .sorted((a, b) -> b.getProducerCompany().compareTo(a.getProducerCompany()))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
