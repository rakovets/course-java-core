package com.rakovets.course.util.hollywood;

import java.util.Comparator;

public class ActorFirstNameComparator implements Comparator<Actor> {
	@Override
	public int compare(Actor o1, Actor o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}
