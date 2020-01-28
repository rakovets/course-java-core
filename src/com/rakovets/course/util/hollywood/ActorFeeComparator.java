package com.rakovets.course.util.hollywood;

import java.util.Comparator;

public class ActorFeeComparator implements Comparator<Actor> {
	@Override
	public int compare(Actor o1, Actor o2) {
		double diff = o1.getFee() - o2.getFee();
		return diff > 0 ? (int) Math.ceil(diff) : (int) Math.floor(diff);
	}
}
