package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.AverageAgeException;
import com.rakovets.course.java.core.practice.exception_handling.exeption.AverageScoreException;
import com.rakovets.course.java.core.practice.exception_handling.exeption.UnionMemberException;

public class Task06 {
    private String universityEnrollment = "You entered the university!";
    int averageExams = 50;

    public String universityEnrollment(int averageScoreInExams, boolean ageOver17, boolean unionMember)
            throws AverageScoreException, AverageAgeException, UnionMemberException {
        if (averageScoreInExams < averageExams) {
            throw new AverageScoreException("Not enough points for admission to the university");
        }
        if (!ageOver17) {
            throw new AverageAgeException("Too young to go to university");
        }
        if (!unionMember) {
            throw new UnionMemberException("Not a member of the university union");
        }
        return universityEnrollment;
    }
}
