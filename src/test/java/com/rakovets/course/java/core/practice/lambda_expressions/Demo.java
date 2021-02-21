package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.project_university.Student;
import com.rakovets.course.java.core.practice.lambda_expressions.project_university.University;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Eugene", "Dunin", "UIR",4));
        studentList.add(new Student("Vit", "Rotkevich", "UIR",3));
        studentList.add(new Student("Egor", "Rat", "IID",3));
        studentList.add(new Student("Egor", "Spit", "BA",3));
        studentList.add(new Student("Translit", "Ostrovsky", "LOG",3));
        System.out.println("GroupStudentByCourse");
        University.printMapGroupByCourse(University.groupStudentByCourse(studentList));
        System.out.println("\n" + "GroupStudentBySpecialty");
        University.printMapGroupBySpecialty(University.groupStudentBySpecialty(studentList));
    }
}
