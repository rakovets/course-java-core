package com.rakovets.course.challenge.exception_handling;

public class Task6 {
    public static void calculationAndWritingInArray(int x, int indexOfArray) throws MyException4{
        try {
            if (x < 0) {
                throw new MyException4("Value should be positive!");
            }
            float res =  23 /  x;
            float[] array = new float[6];
            array[indexOfArray] = res;
            System.out.println(array[indexOfArray]);
        } catch (MyException4 ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getStackTrace() + "\n");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array is less!");
            System.out.println(ex.getStackTrace() + "\n");
        } catch (ArithmeticException ex) {
            System.out.println("You can't divide on zero!");
            System.out.println(ex.getStackTrace() + "\n");
        }

    }
}
