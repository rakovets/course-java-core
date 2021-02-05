package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;
import java.util.Scanner;

public class Array <N extends Number> {
    private N[] array;

    public Array(N[] array) {
        this.array = array;
    }

    public void fillArray() {
        if (this.getArray() instanceof Double[]) {
            Double[] arrayScanner = new Double[this.array.length];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arrayScanner.length; i++) {
                if (sc.hasNextDouble()) {
                    arrayScanner[i] = sc.nextDouble();
                }
            }
            sc.close();

            for (int i = 0; i < this.array.length; i++) {
                this.array[i] = (N) arrayScanner[i];
            }
        }
        if (this.getArray() instanceof Integer[]) {
            Integer[] arrayScanner = new Integer[this.array.length];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arrayScanner.length; i++) {
                if (sc.hasNextInt()) {
                    arrayScanner[i] = sc.nextInt();
                }
            }
            sc.close();

            for (int i = 0; i < this.array.length; i++) {
                this.array[i] = (N) arrayScanner[i];
            }
        }
        if (this.getArray() instanceof Long[]) {
            Long[] arrayScanner = new Long[this.array.length];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arrayScanner.length; i++) {
                if (sc.hasNextLong()) {
                    arrayScanner[i] = sc.nextLong();
                }
            }
            sc.close();

            for (int i = 0; i < this.array.length; i++) {
                this.array[i] = (N) arrayScanner[i];
            }
        }
        if (this.getArray() instanceof Short[]) {
            Short[] arrayScanner = new Short[this.array.length];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arrayScanner.length; i++) {
                if (sc.hasNextShort()) {
                    arrayScanner[i] = sc.nextShort();
                }
            }
            sc.close();

            for (int i = 0; i < this.array.length; i++) {
                this.array[i] = (N) arrayScanner[i];
            }
        }
        if (this.getArray() instanceof Byte[]) {
            Byte[] arrayScanner = new Byte[this.array.length];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arrayScanner.length; i++) {
                if (sc.hasNextByte()) {
                    arrayScanner[i] = sc.nextByte();
                }
            }
            sc.close();

            for (int i = 0; i < this.array.length; i++) {
                this.array[i] = (N) arrayScanner[i];
            }
        }
        if (this.getArray() instanceof Float[]) {
            Float[] arrayScanner = new Float[this.array.length];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arrayScanner.length; i++) {
                if (sc.hasNextFloat()) {
                    arrayScanner[i] = sc.nextFloat();
                }
            }
            sc.close();

            for (int i = 0; i < this.array.length; i++) {
                this.array[i] = (N) arrayScanner[i];
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder testBuilder = new StringBuilder("");
        for (N number : this.array) {
            testBuilder.append(number).append(" ");
        }
        return "Array: " + testBuilder.toString();
    }

    public N getMax() {
        N[] calculationArray = this.array;
        Arrays.sort(calculationArray);

        return calculationArray[calculationArray.length - 1];
    }

    public  N getMin() {
        N[] calculationArray = this.array;
        Arrays.sort(calculationArray);

        return calculationArray[0];
    }

    public double getAverageNumber() {
        double sum = 0;

        for (N arrayMember : this.array) {
            sum += arrayMember.doubleValue();
        }
        return sum / this.array.length;
    }

    public N[] sortAscending() {
        for (int i = this.array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (this.array[j].doubleValue() > this.array[j + 1].doubleValue()) {
                    N auxiliary = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = auxiliary;
                }
            }
        }
        return this.array;
    }

    public N[] sortDescending() {
        for (int i = this.array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (this.array[j].doubleValue() < this.array[j + 1].doubleValue()) {
                    N auxiliary = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = auxiliary;
                }
            }
        }
        return this.array;
    }

    public int searchBinary(N key) {
        if (this.array == null || key == null) {
            return -1;
        }

        if (key.doubleValue() > this.array[this.array.length - 1].doubleValue() || key.doubleValue() < this.array[0].doubleValue()) {
            return -1;
        }

        int firstLimit = 0;
        int lastLimit = this.array.length - 1;

        while(lastLimit >= firstLimit) {
            int middleIndex = (firstLimit + lastLimit) / 2;

            if (this.array[middleIndex].doubleValue() == key.doubleValue()) {
                return middleIndex;
            } else if (this.array[middleIndex].doubleValue() < key.doubleValue()) {
                firstLimit = middleIndex + 1;
            } else if (this.array[middleIndex].doubleValue() > key.doubleValue()) {
                lastLimit = middleIndex - 1;
            }
        }
        return -1;
    }

    public void replace (int index, N number) {
        this.array[index] = number;
    }

    public void setArray(N[] array) {
        this.array = array;
    }

    public N[] getArray() {
        return array;
    }
}
