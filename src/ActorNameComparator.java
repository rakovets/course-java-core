import java.util.Comparator;

public class ActorNameComparator implements Comparator<Actor> {
	public int compare(Actor a, Actor b) {
		return a.getFirstName().compareTo(b.getFirstName());
	}
}
