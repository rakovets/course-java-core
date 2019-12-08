import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

public class HollywoodDemo {
	public static void main(String[] args) {
		ArrayList<Actor> actors = new ArrayList();
		actors.add(new Actor("Jolie", "Angelina", 1000, 44));
		actors.add(new Actor("Berry", "Halle", 1500, 53));
		actors.add(new Actor("Portman", "Natalie", 500, 38));
		actors.add(new Actor("Robbie", "Margot", 2000, 29));
		actors.add(new Actor("Gadot", "Gal", 3000, 34));
		fire(actors);
		Comparator<Actor> comparatorName = new ActorNameComparator();
		Comparator<Actor> comparatorAge = new ActorAgeComparator();
		Comparator<Actor> comparatorFee = new ActorFeeComparator();
		Comparator<Actor> comparatorNameAndAge = new ActorNameComparator().thenComparing(new ActorAgeComparator());
		Comparator<Actor> comparatorFeeAndName = new ActorFeeComparator().thenComparing(new ActorNameComparator());
		actors.sort(comparatorName);
		System.out.println("\nSORT by NAME: ");
		printListActors(actors);
		actors.sort(comparatorAge);
		System.out.println("\nSORT by AGE: ");
		printListActors(actors);
		actors.sort(comparatorFee);
		System.out.println("\nSORT by FEE: ");
		printListActors(actors);
		actors.sort(comparatorNameAndAge);
		System.out.println("\nSORT by NAME and AGE: ");
		printListActors(actors);
		actors.sort(comparatorFeeAndName);
		System.out.println("\nSORT by FEE and NAME: ");
		printListActors(actors);
	}

	static void fire(ArrayList<Actor> list) {
		System.out.println("ACTORS: ");
		printListActors(list);
		Actor maximumFee = list.get(0);
		ListIterator<Actor> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Actor actor = iterator.next();
			if (actor.getFee() > maximumFee.getFee()) {
				maximumFee = actor;
			}
		}
		list.remove(maximumFee);
		System.out.printf("\nDISMISS - %s %s with fee %d$\n", maximumFee.getFirstName(), maximumFee.getLastName(), maximumFee.getFee());
		System.out.println("\nAFTER DISMISS: ");
		printListActors(list);
	}

	static void printListActors(ArrayList<Actor> list) {
		for (Actor unit : list) {
			System.out.printf("%-8s %-8s - %5d$    Age:%d\n", unit.getFirstName(), unit.getLastName(), unit.getFee(), unit.getAge());
		}
	}
}
