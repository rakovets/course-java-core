package com.rakovets.course.java.core.practice.exception_handling;

class Height {
    private final int height;

    public Height(int height) {
        this.height = height;
    }

    public int checkHeight(int i) throws HeightException {
        if (this.height < 150)
            throw new HeightException("You are not tall enough for this ride");
        return height;
    }

    public static class HeightException extends Exception {
        public HeightException(String message) {
            super(message);
        }
    }
}
