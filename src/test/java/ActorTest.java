
import com.rakovets.course.java.core.example.jcf.comparator.*;
import com.rakovets.course.java.core.practice.Actor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {

    @Test
    void actorsLastNameComparator() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Romanich", 5300, 22));
        actors.add(new Actor("Uri", "Urevich", 5400, 23));
        actors.sort(new ActorsLastNameComparator());
        assertEquals("Ermakov", actors.get(0).getLastName());
    }

    @Test
    void actorsAgeComparator() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Romanich", 5300, 22));
        actors.add(new Actor("Uri", "Urevich", 5400, 23));
        actors.sort(new ActorsAgeComparator());
        assertEquals(20, actors.get(0).getAge());
    }

    @Test
    void actorsFeeComparator() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Romanich", 5300, 22));
        actors.add(new Actor("Uri", "Urevich", 5400, 23));
        actors.sort(new ActorsFeeComparator());
        assertEquals(5300, actors.get(0).getFee());
    }

    @Test
    void actorsLastNameAndAgeComparator() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Ermakov", 5300, 22));
        actors.add(new Actor("Uri", "Urevich", 5400, 23));
        actors.sort(new ActorsLastNameAndAgeComparator());
        assertEquals("Ermakov", actors.get(0).getLastName());
        assertEquals(20, actors.get(0).getAge());
    }

    @Test
    void actorsFeeAndLastNameComparator() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Albertikov", 5400, 22));
        actors.add(new Actor("Uri", "Urevich", 5400, 23));
        actors.sort(new ActorsFeeAndLastNameComparator());
        assertEquals(5400, actors.get(0).getFee());
        assertEquals("Albertikov", actors.get(0).getLastName());
    }
}
