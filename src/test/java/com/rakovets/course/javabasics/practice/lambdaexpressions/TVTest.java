package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.tv.TV;
import com.rakovets.course.javabasics.practice.lambdaexpressions.tv.model.TVSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TVTest {
    private static List<TVSet> list;
    private static List<TVSet> tvSetsWithDiagonal55;
    private static List<TVSet> tvSetsManufacturedBySamsung;
    private static List<TVSet> tvSetsNotOlderThan2018;
    private static List<TVSet> tvSetsMin2000Max3000Price;
    private static List<TVSet> sortedListByPriceInAscendingOrder;
    private static List<TVSet> sortedListByPriceInDescendindOrder;
    private static List<TVSet> sortedListByDiagonalInAscendingOrder;
    private static List<TVSet> sortedListByDiagonalInDescendingOrder;
    @BeforeAll
    static void init() {
        list = List.of(new TVSet("Samsung", "UE32T5300AU", "2018", 32, 650),
                new TVSet("Samsung", "QE55Q70TAU", "2020", 55, 3000),
                new TVSet("Sony", "KD-55XH9096", "2019", 55, 3500),
                new TVSet("Xiaomi", "MI TV 4A 32", "2017", 32, 600),
                new TVSet("LG", "55NANO916NA", "2020", 55, 2300),
                new TVSet("LG", "43UM7020PLF", "2018", 43, 800));
        tvSetsWithDiagonal55 = List.of(new TVSet("Samsung", "QE55Q70TAU", "2020", 55, 3000),
                new TVSet("Sony", "KD-55XH9096", "2019", 55, 3500),
                new TVSet("LG", "55NANO916NA", "2020", 55, 2300));
        tvSetsManufacturedBySamsung = List.of(new TVSet("Samsung", "UE32T5300AU", "2018", 32, 650),
                new TVSet("Samsung", "QE55Q70TAU", "2020", 55, 3000));
        tvSetsNotOlderThan2018 = List.of(new TVSet("Samsung", "UE32T5300AU", "2018", 32, 650),
                new TVSet("Samsung", "QE55Q70TAU", "2020", 55, 3000),
                new TVSet("Sony", "KD-55XH9096", "2019", 55, 3500),
                new TVSet("LG", "55NANO916NA", "2020", 55, 2300),
                new TVSet("LG", "43UM7020PLF", "2018", 43, 800));
        tvSetsMin2000Max3000Price = List.of(new TVSet("Samsung", "QE55Q70TAU", "2020", 55, 3000),
                new TVSet("LG", "55NANO916NA", "2020", 55, 2300));
        sortedListByPriceInAscendingOrder = List.of(new TVSet("Xiaomi", "MI TV 4A 32", "2017", 32, 600),
                new TVSet("Samsung", "UE32T5300AU", "2018", 32, 650),
                new TVSet("LG", "43UM7020PLF", "2018", 43, 800),
                new TVSet("LG", "55NANO916NA", "2020", 55, 2300),
                new TVSet("Samsung", "QE55Q70TAU", "2020", 55, 3000),
                new TVSet("Sony", "KD-55XH9096", "2019", 55, 3500));
        sortedListByPriceInDescendindOrder = List.of(
                new TVSet("Sony", "KD-55XH9096", "2019", 55, 3500),
                new TVSet("Samsung", "QE55Q70TAU", "2020", 55, 3000),
                new TVSet("LG", "55NANO916NA", "2020", 55, 2300),
                new TVSet("LG", "43UM7020PLF", "2018", 43, 800),
                new TVSet("Samsung", "UE32T5300AU", "2018", 32, 650),
                new TVSet("Xiaomi", "MI TV 4A 32", "2017", 32, 600));
        sortedListByDiagonalInAscendingOrder = List.of(
                new TVSet("Samsung", "UE32T5300AU", "2018", 32, 650),
                new TVSet("Xiaomi", "MI TV 4A 32", "2017", 32, 600),
                new TVSet("LG", "43UM7020PLF", "2018", 43, 800),
                new TVSet("Samsung", "QE55Q70TAU", "2020", 55, 3000),
                new TVSet("Sony", "KD-55XH9096", "2019", 55, 3500),
                new TVSet("LG", "55NANO916NA", "2020", 55, 2300));
        sortedListByDiagonalInDescendingOrder = List.of(
                new TVSet("Samsung", "QE55Q70TAU", "2020", 55, 3000),
                new TVSet("Sony", "KD-55XH9096", "2019", 55, 3500),
                new TVSet("LG", "55NANO916NA", "2020", 55, 2300),
                new TVSet("LG", "43UM7020PLF", "2018", 43, 800),
                new TVSet("Samsung", "UE32T5300AU", "2018", 32, 650),
                new TVSet("Xiaomi", "MI TV 4A 32", "2017", 32, 600));
    }
    @Test
    void getTVSetsWithDiagonalTest() {
        Assertions.assertEquals(tvSetsWithDiagonal55, TV.getTVSetsWithDiagonal(list, 55));
    }
    @Test
    void getTVSetsManufacturedByTest() {
        Assertions.assertEquals(tvSetsManufacturedBySamsung, TV.getTVSetsManufacturedBy(list, "Samsung"));
    }
    @Test
    void getTVSetsNotOlderThanTest() {
        Assertions.assertEquals(tvSetsNotOlderThan2018, TV.getTVSetsNotOlderThan(list, "2018"));
    }
    @Test
    void getTVSetsWithPriceFromToTest() {
        Assertions.assertEquals(tvSetsMin2000Max3000Price, TV.getTVSetsWithPriceFromTo(list, 2000, 3000));
    }
    @Test
    void getSortedTVSetsByPriceTest() {
        Assertions.assertEquals(sortedListByPriceInAscendingOrder, TV.getSortedTVSetsByPrice(list, true));
        Assertions.assertEquals(sortedListByPriceInDescendindOrder, TV.getSortedTVSetsByPrice(list, false));
    }
    @Test
    void getSortedTVSetsByDiagonalTest() {
        Assertions.assertEquals(sortedListByDiagonalInAscendingOrder, TV.getSortedTVSetsByDiagonal(list, true));
        Assertions.assertEquals(sortedListByDiagonalInDescendingOrder, TV.getSortedTVSetsByDiagonal(list, false));
    }
}
