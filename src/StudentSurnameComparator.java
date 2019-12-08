import java.util.Comparator;

public class StudentSurnameComparator implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.getSurname().compareTo(b.getSurname());
	}
}
