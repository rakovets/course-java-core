package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.model.Student;
import com.rakovets.course.javabasics.util.Color;

import static java.lang.System.*;

import java.util.List;

public class UniversityDemo {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Yulia", "Gankovich", "Java", 1),
                new Student("Roman", "Goncharuk", "C++", 2),
                new Student("Dmitry","Zmachinskij", "C",2),
                new Student("Roman", "Mashkov", "PHP",3),
                new Student("Anastasia", "Mihalkevich", "Python", 4),
                new Student("Yan", "Pashik", "Python", 5),
                new Student("Yulia", "Portnova", "JavaScript", 3),
                new Student("Dmitry", "Sedun", "C++", 3),
                new Student("Oleg", "Smargun", "Java", 3),
                new Student("Yury", "Sudak", "Java", 4),
                new Student("Innokenty", "Tunakin", "PHP", 3)
        );
        University university = new University(students);
        out.println(Color.GREEN + "Students grouping by course: " + Color.RESET + university.getStudentsByCourse());
        out.println(Color.GREEN + "Specialties: " + Color.RESET + university.getSpecialtiesAlphabetic());
        out.println(Color.GREEN + "Amount of students on current specialties: " + Color.RESET + university.getAmountsOfSpecialties());
        out.println(Color.GREEN + "Students grouping by specialties then by course:" + Color.RESET + university.getStudentsBySpecialtiesThenByCourse());
        int course = 3;
        List<String> exceptionSpecialities = List.of("PHP", "JavaScript", "Java");
        out.println(Color.GREEN + "Is present students on course " + course + " except specialties " + exceptionSpecialities + "? " + Color.RESET  +
                university.isPresent(course, exceptionSpecialities));
    }
}
