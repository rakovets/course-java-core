package com.rakovets.course.challenge.oop.classes;

public class IntervalTimeTest {
	public static void main(String[] args) {
		IntervalTime time = new IntervalTime(14, 10, 5);
		time.printTime();
		time.conversionInSecond();
		IntervalTime totalTime = new IntervalTime(77777);
		totalTime.conversionInFormatTime();

	}
}
