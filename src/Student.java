public class Student {
	private String name;
	private String surname;
	private int age;
	private int averageAnnualMark;

	public Student(String name, String surname, int age, int averageAnnualMark) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.averageAnnualMark = averageAnnualMark;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public int getAverageAnnualMark() {
		return averageAnnualMark;
	}
}
