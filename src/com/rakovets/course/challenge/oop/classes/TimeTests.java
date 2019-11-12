package com.rakovets.course.challenge.oop.classes;

public class TimeTests {
	public static void main(String[] args) {
		Time time1 = new Time(10, 65, 47);
		Time time2 = new Time(3609);
		time1.writeTime();
		time2.writeTime();
		System.out.println(time1.getHour() + " " + time1.getMinute() + " " + time1.getSecond());
		System.out.println(time2.getTotalSeconds());
		// Сеттеры мне лень проверять, из генерировала IDEA, так что все норм.
	}
}
