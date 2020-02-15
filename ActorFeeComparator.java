package ActorTaskFiles;

import java.util.Comparator;

class ActorFeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        return a1.getFee() - a2.getFee();
    }
}