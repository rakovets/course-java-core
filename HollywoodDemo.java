package ActorTaskFiles;

import java.util.ArrayList;
import java.util.List;

public class HollywoodDemo {
    public static void main(String[] args) {

        ArrayList<Actor> actors = new ArrayList<>();
        Actor sam = new Actor("Sam", "Woterson", 500, 18);
        Actor bread = new Actor("Bread", "Pit", 100, 56);
        Actor jackie = new Actor("Jackie", "Chan", 750, 65);
        Actor johnny = new Actor("Johnyy", "Depp", 1500, 56);
        actors.add(sam);
        actors.add(bread);
        actors.add(jackie);
        actors.add(johnny);

        for (Actor act : actors) {
            System.out.println(act.getFirstName() + " " + act.getFee());
        }

        System.out.println();

        fire(actors);

        for (Actor act : actors)  {
            System.out.println(act.getFirstName() + " " + act.getFee());
        }

        System.out.println();

        System.out.println(actors);
        actors.sort(new ActorLastNameComparator().thenComparing(new ActorAgeComparator()));
        System.out.println(actors);
        actors.sort(new ActorFeeComparator().thenComparing(new ActorLastNameComparator()));
        System.out.println(actors);
    }

    private static void fire(List<Actor> list) {
        int fee = 0;
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFee() > fee) {
                fee = list.get(i).getFee();
                j = i;
            }
        }
        list.remove(j);
    }
}