import java.util.ArrayList;
import java.util.Iterator;

public class SchoolUtil {
	Student getBestStudent(ArrayList<Student> students) {
		Student maximumMark = students.get(0);
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getAverageAnnualMark() > maximumMark.getAverageAnnualMark()) {
				maximumMark = student;
			}
		}
		return maximumMark;
	}
}
