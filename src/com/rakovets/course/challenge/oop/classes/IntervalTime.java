package com.rakovets.course.challenge.oop.classes;

public class IntervalTime {
	private int hours;
	private int minutes;
	private int seconds;
	private int totalSecond;

	IntervalTime(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public IntervalTime(int totalSecond) {
		this.totalSecond = totalSecond;
	}

	void printTime() {
		System.out.printf("Interval Time %d:%d:%d\n", getHours(), getMinutes(), getSeconds());
	}

	void conversionInFormatTime() {
		setHours(getTotalSecond() / 3600);
		setMinutes(getTotalSecond() % 3600 / 60);
		setSeconds(getTotalSecond() % 3600 % 60);
		System.out.printf("%d sec = %d:%d:%d \n", getTotalSecond(), getHours(), getMinutes(), getSeconds());
	}

	public void conversionInSecond() {
		setTotalSecond(getHours() * 3600 + getMinutes() * 60 + getSeconds());
		System.out.printf("%d:%d:%d = %d sec\n", getHours(), getMinutes(), getSeconds(), getTotalSecond());
	}

	public int getSeconds() {
		return this.seconds;
	}

	public int getMinutes() {
		return this.minutes;
	}

	public int getHours() {
		return this.hours;
	}

	public int getTotalSecond() {
		return totalSecond;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public void setTotalSecond(int totalSecond) {
		this.totalSecond = totalSecond;
	}
}
