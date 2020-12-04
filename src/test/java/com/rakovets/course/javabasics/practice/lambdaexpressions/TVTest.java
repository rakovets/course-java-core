package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.model.TV;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TVTest {

    @Test
    void test() {
        TV[] tvs = new TV[] {
                new TV(1,"LG", "55NANO916NA", 2020, 55,2374),
                new TV(2,"LG", "32LM6350PLA", 2019, 32, 713),
                new TV(3,"Samsung", "UE43TU8000U", 2020, 43, 1068),
                new TV(4,"Samsung", "UE32T5300AU", 2020, 32, 619),
                new TV(5,"Sony", "KD-55XH9096", 2020, 54, 2990),
                new TV(6,"Philips", "50PUS8505/60", 2020, 50, 1551),
                new TV(7,"Xiaomi", "MI TV 4S 43", 2019, 43, 852)
        };
        TVUtil tvUtil = new TVUtil(tvs);
        assertEquals("[2, 4]", Arrays.asList(tvUtil.getWithCurrentDiagonal(32)).toString());
        assertEquals("[3, 7]", Arrays.asList(tvUtil.getWithCurrentDiagonal(43)).toString());
        assertEquals("[1]", Arrays.asList(tvUtil.getWithCurrentDiagonal(55)).toString());

        assertEquals("[1, 2]", Arrays.asList(tvUtil.getWithCurrentManufacturer("LG")).toString());
        assertEquals("[3, 4]", Arrays.asList(tvUtil.getWithCurrentManufacturer("Samsung")).toString());
        assertEquals("[5]", Arrays.asList(tvUtil.getWithCurrentManufacturer("Sony")).toString());

        assertEquals("[1, 3, 4, 5, 6]", Arrays.asList(tvUtil.getAfterCurrentYear(2019)).toString());
        assertEquals("[1, 2, 3, 4, 5, 6, 7]", Arrays.asList(tvUtil.getAfterCurrentYear(2018)).toString());

        assertEquals("[3, 6]", Arrays.asList(tvUtil.getWithPrice(1000, 2000)).toString());
        assertEquals("[7]", Arrays.asList(tvUtil.getWithPrice(800, 900)).toString());
        assertEquals("[2, 4]", Arrays.asList(tvUtil.getWithPrice(600, 800)).toString());

        assertEquals("[4, 2, 7, 3, 6, 1, 5]", Arrays.asList(tvUtil.getSortedByPriceAscending()).toString());
        assertEquals("[5, 1, 6, 3, 7, 2, 4]", Arrays.asList(tvUtil.getSortedByPriceDescending()).toString());
        assertEquals("[2, 4, 3, 7, 6, 5, 1]", Arrays.asList(tvUtil.getSortedByDiagonalAscending()).toString());
        assertEquals("[1, 5, 6, 3, 7, 2, 4]", Arrays.asList(tvUtil.getSortedByDiagonalDescending()).toString());
    }
}
