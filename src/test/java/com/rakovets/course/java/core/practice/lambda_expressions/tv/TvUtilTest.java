package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

@DisplayName("Testing the TV utility.")
class TvUtilTest {
    static TvUtil tvUtil;
    static Tv lg;
    static Tv phillips;
    static Tv samsung;
    static Tv sony;
    static Tv panasonic;
    List<Tv> tvList;

    @BeforeAll
    static void initAll() {
        lg = new Tv("China", "LG", 2019, 1500, 24);
        phillips = new Tv("Japan", "Phillips", 2022, 2400, 39);
        samsung = new Tv("USA", "Samsung", 2018, 1450.50, 18);
        sony = new Tv("India", "Sony", 2023, 1650.57, 29);
        panasonic = new Tv("China", "Panasonic", 2017, 1279.56, 18);

        tvUtil = new TvUtil();
    }

    @BeforeEach
    void init() {
        tvList = new LinkedList<>(List.of(lg, phillips, samsung, sony, panasonic));
    }

    @Test
    @DisplayName("Diagonal search.")
    void searchTvByDiagonal() {
        List<Tv> expected = new LinkedList<>(List.of(
                new Tv("USA", "Samsung", 2018, 1450.50, 18),
                new Tv("China", "Panasonic", 2017, 1279.56, 18))
        );

        List<Tv> actual = tvUtil.searchTvByDiagonal(tvList, 18);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Search by model.")
    void searchTvByModel() {
        List<Tv> expected = new LinkedList<>(List.of(
                new Tv("China", "LG", 2019, 1500, 24),
                new Tv("China", "Panasonic", 2017, 1279.56, 18)
        ));

        List<Tv> actual = tvUtil.searchTvByModel(tvList, "China");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Search by year.")
    void searchTvByYear() {
        List<Tv> expected = new LinkedList<>(List.of(
                new Tv("Japan", "Phillips", 2022, 2400, 39),
                new Tv("India", "Sony", 2023, 1650.57, 29)
        ));

        List<Tv> actual = tvUtil.searchTvByYear(tvList, 2020);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Search by price.")
    void searchTvByPrice() {
        List<Tv> expected = new LinkedList<>(List.of(
                new Tv("China", "LG", 2019, 1500, 24),
                new Tv("Japan", "Phillips", 2022, 2400, 39),
                new Tv("USA", "Samsung", 2018, 1450.50, 18),
                new Tv("India", "Sony", 2023, 1650.57, 29)
        ));

        List<Tv> actual = tvUtil.searchTvByPrice(tvList, 1400, 2500);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Search for a TV in ascending order of price.")
    void searchByAsc() {
        List<Tv> expected = new LinkedList<>(List.of(
                new Tv("China", "Panasonic", 2017, 1279.56, 18),
                new Tv("USA", "Samsung", 2018, 1450.50, 18),
                new Tv("China", "LG", 2019, 1500, 24),
                new Tv("India", "Sony", 2023, 1650.57, 29),
                new Tv("Japan", "Phillips", 2022, 2400, 39)
        ));

        List<Tv> actual = tvUtil.searchByAsc(tvList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Search for a TV in descending order of price.")
    void searchByDescending() {
        List<Tv> expected = new LinkedList<>(List.of(
                new Tv("Japan", "Phillips", 2022, 2400, 39),
                new Tv("India", "Sony", 2023, 1650.57, 29),
                new Tv("China", "LG", 2019, 1500, 24),
                new Tv("USA", "Samsung", 2018, 1450.50, 18),
                new Tv("China", "Panasonic", 2017, 1279.56, 18)
        ));

        List<Tv> actual = tvUtil.searchByDescending(tvList);

        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Search for a TV in diagonal ascending order.")
    @Test
    void searchByDiagonalAsc() {
        List<Tv> expected = new LinkedList<>(List.of(
                new Tv("USA", "Samsung", 2018, 1450.50, 18),
                new Tv("China", "Panasonic", 2017, 1279.56, 18),
                new Tv("China", "LG", 2019, 1500, 24),
                new Tv("India", "Sony", 2023, 1650.57, 29),
                new Tv("Japan", "Phillips", 2022, 2400, 39)
        ));

        List<Tv> actual = tvUtil.searchByDiagonalAsc(tvList);

        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Search for a TV in descending diagonal order.")
    @Test
    void searchByDiagonalDescending() {
        List<Tv> expected = new LinkedList<>(List.of(
                new Tv("Japan", "Phillips", 2022, 2400, 39),
                new Tv("India", "Sony", 2023, 1650.57, 29),
                new Tv("China", "LG", 2019, 1500, 24),
                new Tv("USA", "Samsung", 2018, 1450.50, 18),
                new Tv("China", "Panasonic", 2017, 1279.56, 18)
        ));

        List<Tv> actual = tvUtil.searchByDiagonalDescending(tvList);

        Assertions.assertEquals(expected, actual);
    }
}
