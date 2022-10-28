package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    public int getAverageMarkForExams(String[] marks) throws NullStringException, MissExamException, FailExamException {
        int sumMarks = 0;
        int counter = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == "") {
                throw new NullStringException("Оценка отсутствует");
            }
            if (marks[i] == "Н" ) {
                throw new MissExamException("Отстутвие на экзамене");
            }
            if (marks[i] == "Пересдача" ) {
                throw new FailExamException("Экзамен не сдан");
            }
            sumMarks += Integer.getInteger(marks[i]);
            counter++;
        }
       return sumMarks/= counter;
    }
}
