package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {

    public void fillArrayWithNumbers(int indexOne, int valueOne, int indexTwo, int valueTwo, String string) throws Task4Exception {
        try {
            int[] arr = new int[4];
            arr[indexOne] = valueOne;
            arr[indexTwo] = valueTwo;
            arr[2] = arr[indexOne] / arr[indexTwo];
            arr[3] = string.length();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            throw new Task4Exception(ex.getMessage());
        }
    }
}
