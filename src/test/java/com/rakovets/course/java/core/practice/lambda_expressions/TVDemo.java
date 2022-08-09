package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Collection;

public class TVDemo {
    public static void main(String[] args) {
        Tv t1 = new Tv("LG", "DC-100", 2010, 42.0, 1199.99);
        Tv t2 = new Tv("Sony", "SXX809", 2012, 25.9, 400.00);
        Tv t3 = new Tv("LG", "DC-120", 2008, 30.5, 1670.50);
        Tv t4 = new Tv("Samsung", "SDF-500", 2016, 50.0, 768.49);
        Tv t5 = new Tv("Sharp", "SHP-100DC", 1997, 68.7, 300.00);

        Collection<Tv> tvCollection = new ArrayList<>();
        tvCollection.add(t1);
        tvCollection.add(t2);
        tvCollection.add(t3);
        tvCollection.add(t4);
        tvCollection.add(t5);

        TvShop tvShop = new TvShop(tvCollection);
        System.out.println("TV with 25.9 screen size: " + tvShop.getTvByDisplaySize(25.9));
        System.out.println("TVs list made by Sharp: " + tvShop.getTvByManufacturer("Sharp"));
        System.out.println("TV produced in 2016: " + tvShop.getTvByYearOfManufacture(2016));
        System.out.println("TVs list with price between 0 and 400: " + tvShop.getTvByPrice(0, 400));
        System.out.println("TVs list sorted by price ASC: " + tvShop.getTvSortedByPriceAscending());
        System.out.println("TVs list sorted by price DESC: " + tvShop.getTvSortedByPriceDescending());
        System.out.println("TVs list sorted by screen size ASC: " + tvShop.getTvSortedByDisplaySizeAscending());
        System.out.println("TVs list sorted by screen size DESC: " + tvShop.getTvSortedByDisplaySizeDescending());
    }
}
