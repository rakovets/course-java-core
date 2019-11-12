package com.rakovets.course.challenge.oop.classes;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(long seconds) {
		int[] separateValues = convertToSeparateValues(seconds);
		this.hour = separateValues[0];
		this.minute = separateValues[1];
		this.second = separateValues[2];
	}

	public Time(int hours, int minutes, int seconds) {
		this(convertToSeconds(hours, minutes, seconds));
	}

	public long getTotalSeconds() {
		long seconds;
		seconds = convertToSeconds(this.hour, this.minute, this.second);
		return seconds;
	}

	public void writeTime() {
		System.out.printf("%s:%s:%s\n", hour, minute, second);
	}

	private static int[] convertToSeparateValues(long seconds) {
		int[] separateValues = new int[3];
		separateValues[0] = (int)(seconds / 3600);
		separateValues[1] = (int)((seconds / 60) % 60);
		separateValues[2] = (int)((seconds % 3600) % 60);
		return separateValues;
	}

	private static long convertToSeconds(int hours, int minutes, int seconds) {
		long fullSeconds;
		fullSeconds = hours * 3600 + minutes * 60 + seconds;
		return fullSeconds;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}