import java.util.ArrayList;
import java.util.Comparator;

public class SchoolDemo {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList();
		students.add(new Student("Андрей", "Лопата", 10, 4));
		students.add(new Student("Инна", "Иванова", 9, 8));
		students.add(new Student("Макар", "Петров", 11, 7));
		students.add(new Student("Татьяна", "Жук", 12, 9));
		System.out.printf("Students list: \n");
		printStudentsList(students);
		SchoolUtil object = new SchoolUtil();
		Student bestStudent = object.getBestStudent(students);
		System.out.printf("\nBEST student: %s %s - Maximum mark:%-3d\n", bestStudent.getName(), bestStudent.getSurname(), bestStudent.getAverageAnnualMark());

		Comparator<Student> comparatorNameAndSurname = new StudentNameComparator().thenComparing(new StudentSurnameComparator());
		Comparator<Student> comparatorAge = new StudentAgeComparator();
		Comparator<Student> comparatorAverageMark = new StudentAverageMarkComparator();
		System.out.println("\nSORT by NAME And SURNAME: ");
		students.sort(comparatorNameAndSurname);
		printStudentsList(students);
		System.out.println("\nSORT by AGE: ");
		students.sort(comparatorAge);
		printStudentsList(students);
		System.out.println("\nSORT by AVERAGE MARK: ");
		students.sort(comparatorAverageMark);
		printStudentsList(students);

	}

	static void printStudentsList(ArrayList<Student> students) {
		for (Student unit : students) {
			System.out.printf("%-8s %-7s  -  Age:%-3d Mark:%-3d\n", unit.getName(), unit.getSurname(), unit.getAge(), unit.getAverageAnnualMark());
		}
	}
}
