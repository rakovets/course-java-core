package com.rakovets.course.java.core.practice.exception_handling.Task03;

class Root {
    public static void main(String[] args) {

        int x = -100;

        if (x < 0)
            try {
                throw new RootException(x);
            } catch (RootException e) {
                e.printStackTrace();
            }
        else System.out.println(Math.sqrt(x));
    }
}

class RootException extends Exception {
    private int x;

    public RootException(int x) {
        this.x = x;
    }

    public String toString() {
        return "The number " + x + " is less than zero";
    }
}
