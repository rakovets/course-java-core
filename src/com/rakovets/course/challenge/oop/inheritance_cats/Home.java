package com.rakovets.course.challenge.oop.inheritance_cats;

public class Home {
	public static void main(String[] args) {
		Person person = new Person(100);
		Cat siamese = new Siamese("\"SIAMESE\"");
		Cat persian = new Persian("\"PERSIAN\"");
		Cat sphynx = new Sphynx("\"SPHYNX\"");

		siamese.mew(person);
		persian.mew(person);
		sphynx.mew(person);
		sphynx.purr(person);
		sphynx.purr(person);
		sphynx.purr(person);
	}
}
