package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;

public class TVHelper {
 public static List<TV> getTVByDiagonal(List<TV> tvList,int diagonal) {
     return tvList.stream()
             .filter(p -> p.getDiagonal() == diagonal)
             .collect(Collectors.toList());
 }

 public static List<TV> getTVByBrand(List<TV> tvList, String brand) {
     return tvList.stream()
             .filter(p -> p.getBrand().equals(brand))
             .collect(Collectors.toList());
 }

 public static List<TV> getTVYoungerYear(List<TV> tvList,int year) {
     return tvList.stream()
             .filter(p -> p.getYearOfIssuse() >= year)
             .collect(Collectors.toList());
 }

 public static List<TV> getTvInThePriceRange (List<TV> tvList,int minPrice,int maxPrice) {
     return tvList.stream()
             .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
             .collect(Collectors.toList());
 }

 public static List<TV> getTVSortedByPriceAscending (List<TV> tvList) {
     return tvList.stream()
             .sorted(new PricaComparatorAscending())
             .collect(Collectors.toList());
 }

 public static List<TV> getTVSortedByPriceDescending (List<TV> tvList) {
     return tvList.stream()
             .sorted(new PriceComparatorDescending())
             .collect(Collectors.toList());
 }

 public static List<TV> getTVSortedByDiagonalAscending (List<TV> tvList) {
     return tvList.stream()
             .sorted(new DiagonalComparatorAscending())
             .collect(Collectors.toList());
 }

 public static List<TV> getTVSortedByDiagonalDescending (List<TV> tvList) {
     return tvList.stream()
             .sorted(new DiagonalComparatorDescending())
             .collect(Collectors.toList());
 }
}
