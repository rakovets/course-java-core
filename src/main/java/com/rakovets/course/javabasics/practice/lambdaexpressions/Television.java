package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.util.AnsiColorCode;

public class Television {

    private final String brand;
    private final String model;
    private final int year;
    private final int size;
    private int price;

    public Television(String brand, String model, int year, int size, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString(){
        return "\nBrand - " + brand + "\n"
                + "Model - " + model +"\n"
                 + "Size - "  + size + "''" + "\n"
                  + "Year - "  + year + "\n"
                   +  "Price, $ - " + AnsiColorCode.FG_RED_BOLD  + price + AnsiColorCode.RESET;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }


    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
