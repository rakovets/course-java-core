package SchoolTaskFiles;

import java.util.ArrayList;
import java.util.List;

public class SchoolDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("name1", "surname1", 11, 7);
        Student student2 = new Student("name2", "surname2", 12, 8);
        Student student3 = new Student("name3", "surname3", 13, 9);
        Student student4 = new Student("name4", "surname4", 14, 10);
        students.add(student4);
        students.add(student3);
        students.add(student2);
        students.add(student1);

        System.out.printf("%s \n\n", students);

        students.sort(new StudentNameComparator().thenComparing(new StudentSurnameComparator()));

        System.out.printf("%s \n\n", students);

        students.sort(new StudentAgeComparator());

        System.out.printf("%s \n\n", students);

        System.out.print(SchoolUtil.getBestStudent(students));
    }
}