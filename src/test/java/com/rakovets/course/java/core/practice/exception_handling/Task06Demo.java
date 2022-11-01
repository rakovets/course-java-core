package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.AverageAgeException;
import com.rakovets.course.java.core.practice.exception_handling.exeption.AverageScoreException;
import com.rakovets.course.java.core.practice.exception_handling.exeption.UnionMemberException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task06Demo {
    private static final Logger logger = Logger.getLogger(Task06Demo.class.getName());

    public static void main(String[] args) {
        Task06 task06 = new Task06();
        int averageScoreInExams = 59;
        boolean ageOver17 = true;
        boolean unionMember = true;
        try {
            task06.universityEnrollment(averageScoreInExams, ageOver17, unionMember);
        } catch (AverageAgeException | UnionMemberException e) {
            logger.log(Level.SEVERE, e.getMessage());
        } catch (AverageScoreException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, e.getMessage());
        }
    }
}
