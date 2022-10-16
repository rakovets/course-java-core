package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeption.AverageAgeException;
import com.rakovets.course.java.core.practice.exception_handling.exeption.AverageScoreException;
import com.rakovets.course.java.core.practice.exception_handling.exeption.UnionMemberException;

public class Task06Demo {
    public static void main(String[] args) {
        Task06 task06 = new Task06();
        int averageScoreInExams = 59;
        boolean ageOver17 = true;
        boolean unionMember = true;
        String result = "";
        try {
            result += task06.universityEnrollment(averageScoreInExams, ageOver17, unionMember);
        } catch (AverageAgeException | UnionMemberException e) {
            result += e.getMessage();
        } catch (AverageScoreException e) {
            e.printStackTrace();
            result += e.getMessage();
        }
        System.out.println(result);
    }
}
