package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    public int getCounterProducts(String[] products) throws SizeNotFitException, СolorNotFitException, ProductDefectException {
        int counterProducts = 0;
        for (int i = 0; i < products.length; i++) {
                if (products[i] == "SizeNotFit") {
                    throw new SizeNotFitException("Не подошел размер");
                }
                if (products[i] == "СolorNotFit") {
                    throw new СolorNotFitException("Не подошел цвет");
                }
                if (products[i] == "ProductDefect") {
                    throw new ProductDefectException("Брак товара");
                }
                counterProducts += Integer.getInteger(products[i]);
                counterProducts++;
            }
            return counterProducts;
        }
    }
