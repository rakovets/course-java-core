package com.rakovets.course.java.core.practice.exception_handling;

public class Task3 {
        public int BirthYear(int year) throws BirthYearException {
            if (year > 2023) {
                throw new BirthYearException("This year hasn't come yet");
            }
            return year;
        }
}


