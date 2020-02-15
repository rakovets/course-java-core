package ActorTaskFiles;

import java.util.Comparator;

class ActorAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        return a1.getAge() - a2.getAge();
    }
}