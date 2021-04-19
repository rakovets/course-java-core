package com.rakovets.course.java.core.practice.exception_handling;

class PhoneNotAvailableException extends RuntimeException {
    private String model;

    public PhoneNotAvailableException(String model) {
        this.model = model;
    }

    public String toString() {
        return "Phone " + model + " is not available";
    }
}
