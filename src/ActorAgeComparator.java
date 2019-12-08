import java.util.Comparator;

public class ActorAgeComparator implements Comparator<Actor> {
	public int compare(Actor a, Actor b) {
		if (a.getAge() > b.getAge())
			return 1;
		else if (a.getAge() < b.getAge())
			return -1;
		else
			return 0;
	}
}
