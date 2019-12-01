package com.rakovets.java.task.collections.list.hollywood;

import java.util.ArrayList;
import java.util.Collections;

public class HollywoodUtil {
    public Actor getHireFire(ArrayList<Actor> actors) {
        Collections.sort(actors, new ActorsCamporators.CamporatorOfFee());
        return  actors.get(actors.size() - 1);
    }
}
