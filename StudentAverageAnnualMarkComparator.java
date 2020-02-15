package SchoolTaskFiles;

import java.util.Comparator;

public class StudentAverageAnnualMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAverageAnnualMark() - s2.getAverageAnnualMark();
    }
}