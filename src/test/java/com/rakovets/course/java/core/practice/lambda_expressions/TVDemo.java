package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.tv.TV;
import com.rakovets.course.java.core.practice.lambda_expressions.tv.TVUtil;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TVDemo {

    public static void main(String[] args) {
        List<TV> list = new ArrayList<>();
        list.add(new TV("LG", "RX-320", 2020, 30.3, 1700));
        list.add(new TV("Samsung", "Ml-480", 2021, 30.2, 1700));
        list.add(new TV("Horizont", "Zubr-800", 2025, 40, 300));

        System.out.println(TVUtil.getDiagonal(list, 35));
        System.out.println(TVUtil.getManufacturer(list, "Horizont"));
        System.out.println(TVUtil.getNotOlderYear(list, 2024));
        System.out.println(TVUtil.getIntervalPrice(list, 1600, 5000));

        TVUtil.sortPriceUp(list);
        System.out.println(list);
        TVUtil.sortPriceDown(list);
        System.out.println(list);

        TVUtil.sortDiagonalUp(list);
        System.out.println(list);
        TVUtil.sortDiagonalDown(list);
        System.out.println(list);
    }
}
