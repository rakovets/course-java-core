import com.rakovets.course.java.core.example.jcf.comparator.StudentAgeComparator;
import com.rakovets.course.java.core.example.jcf.comparator.StudentAverageAnnualMarkComparator;
import com.rakovets.course.java.core.example.jcf.comparator.StudentNameAndSurnameComparator;
import jcf_list.SchoolClass;
import jcf_list.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    private ArrayList<Student> students = new ArrayList<>();

    @BeforeEach
    public void init() {
        students.add(new Student("Evgeni", "Ermakov", 25, 9.9));
        students.add(new Student("Andrei", "Borisov", 20, 9.0));
        students.add(new Student("Ura", "Vorisov", 21, 8.0));
        students.add(new Student("Sergey", "S", 22, 8.5));
    }

    @Test
    void studentNameAndSurnameComparatorTest() {
        students.sort(new StudentNameAndSurnameComparator());
        assertEquals("Andrei", students.get(0).getName());
        assertEquals("Borisov", students.get(0).getSurname());
        assertEquals("Ura", students.get(3).getName());
        assertEquals("Vorisov", students.get(3).getSurname());
    }

    @Test
    void studentAgeComparatorTest() {
        students.sort(new StudentAgeComparator());
        assertEquals(20, students.get(0).getAge());
        assertEquals(25, students.get(3).getAge());
    }

    @Test
    void studentAverageAnnualMarkComparatorTest() {
        students.sort(new StudentAverageAnnualMarkComparator());
        assertEquals(8.0, students.get(0).getAverageAnnualMark());
        assertEquals(9.9, students.get(3).getAverageAnnualMark());
    }

    @Test
    void getBestStudentTest() {
        SchoolClass schoolClass = new SchoolClass(students);
        assertEquals("Evgeni", schoolClass.getBestStudent().getName());
    }
}

