package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.tv.ProjectTv;
import com.rakovets.course.java.core.practice.lambda_expressions.tv.Television;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TvTest {
    private static ProjectTv television;
    private static Television lg;
    private static Television xiaomiMi;
    private static Television samsung;
    private static Television sony;
    private static List<Television> tv;

    @BeforeEach
    void setUp() {
        television = new ProjectTv(tv);
        lg = new Television("LG", "NanoCell", 2022, 50, 2027.4);
        xiaomiMi = new Television("Xiaomi MI", "P1", 2021, 50, 1420.0);
        samsung = new Television("Samsung", "UE32T5300AU", 2020, 32, 1151.30);
        sony = new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0);
        tv = new ArrayList<>((Arrays.asList(lg, xiaomiMi, samsung, sony)));
    }

    @Test
    public void getListDiagonal() {
        List<Television> expected = List.of(lg, xiaomiMi);

        List<Television> actual = television.getListDiagonal(50);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getListManufacturer() {
        List<Television> expected = List.of(lg);

        List<Television> actual = television.getListManufacturer("LG");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getListLessThanYear() {
        List<Television> expected = List.of(xiaomiMi, samsung);

        List<Television> actual = television.getListLessThanYear(2022);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getListPriceRange() {
        List<Television> expected = List.of(xiaomiMi);

        List<Television> actual = television.getListPriceRange(1300, 1700);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getListSortedByPriceAscending() {
        List<Television> expected = List.of(samsung, xiaomiMi, lg, sony);

        List<Television> actual = television.getListSortedByPriceAscending();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getListSortedByPriceDescending() {
        List<Television> expected = List.of(sony, lg, xiaomiMi, samsung);

        List<Television> actual = television.getListSortedByPriceDescending();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getListSortedByDiagonalAscending() {
        List<Television> expected = List.of(samsung, lg, xiaomiMi, sony);

        List<Television> actual = television.getListSortedByDiagonalAscending();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getListSortedByDiagonalDescending() {
        List<Television> expected = List.of(sony, lg, xiaomiMi, samsung);

        List<Television> actual = television.getListSortedByDiagonalDescending();

        Assertions.assertEquals(expected, actual);
    }
}
