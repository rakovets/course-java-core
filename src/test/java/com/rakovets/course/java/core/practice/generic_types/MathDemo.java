package com.rakovets.course.java.core.practice.generic_types;

public class MathDemo {
    public static void main(String[] args) {
        Integer maxIntParameter = Math.maxParameter(5, 20, -20);
        System.out.println("Max parameter (expected 20) is: " + maxIntParameter);

        Double minDoubleParameter = Math.minParameter(3.0, 15.3, 20.0, -7.2, 30.0);
        System.out.println("Min parameter (expected -7.2) is: " + minDoubleParameter);

        double averageValue = Math.getAverageValue(new Double[] {2.0, 4.0, 6.0, 8.0});
        System.out.println("Average parameter (expected 5)  is: " + averageValue);

        Double maxValue = Math.getMaxValue(new Double[] {120.0, 5.0, -5.0, 0.0});
        System.out.println("Max value(expected 120) is: " + maxValue);

        Double minValue = Math.getMinValue(new Double[] {-1.0, -5.0, 1.0, 0.0});
        System.out.println("Min value(expected -5) is: " + minValue);
    }
}
