package com.rakovets.course.java.core.practice.generic_types;


import java.util.Arrays;
import java.util.Scanner;

public class Array<T extends Number> {
    private T[] array;

    public Array() {
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void fillArray() {

        Scanner sc = new Scanner(System.in);
        T arrayValue = null;
        for (int i = 0; i < this.array.length; i++) {
            if (sc.hasNextDouble()) {
                arrayValue = (T) Double.valueOf(sc.nextDouble());
            }
            this.array[i] = arrayValue;
        }
    }

    public void randomArray() {
        for (int i = 0; i < this.array.length; i++) {
            Number arrayValue = java.lang.Math.random();
            this.array[i] = (T) arrayValue;
        }
    }

    public void showArray() {
        System.out.println(Arrays.toString(this.array));
    }

    public Number getMaxArray() {
        Arrays.sort(this.array);
        return this.array[this.array.length - 1];
    }

    public T getMinArray() {
        Arrays.sort(this.array);
        return this.array[0];
    }

    public T getArithmeticMean() {
        double sumNumbers = 0;
        for (int i = 0; i < this.array.length; i++) {
            sumNumbers += this.array[i].doubleValue();
        }
        return (T)Double.valueOf(sumNumbers / this.array.length);
    }

    public void sortAscending() {
        boolean sorted = false;
        Number temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < this.array.length - 1; i++) {
                if (this.array[i].doubleValue() > this.array[i + 1].doubleValue()) {
                    temp = this.array[i];
                    this.array[i] = this.array[i + 1];
                    this.array[i + 1] = (T) temp;
                    sorted = false;
                }
            }
        }
    }

    public void sortDescending() {
        boolean sorted = false;
        Number temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < this.array.length - 1; i++) {
                if (this.array[i].doubleValue() < this.array[i + 1].doubleValue()) {
                    temp = this.array[i];
                    this.array[i] = this.array[i + 1];
                    this.array[i + 1] = (T) temp;
                    sorted = false;
                }
            }
        }
    }

    public void setNewValue(int indexArray, Number newValue) {
        this.array[indexArray] = (T) newValue;
    }

    public T searchBinary(Number number) {
        return (T) Integer.valueOf(Arrays.binarySearch(this.array, number));
    }
}
