package ActorTaskFiles;

import java.util.Comparator;

class ActorLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        return a1.getLastName().compareTo(a2.getLastName());
    }
}