package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comporators.ActorFeeComparator;

import java.util.Comparator;
import java.util.List;

public class Studio {
    public List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire(List<Actor> actorsForStudio) {
        Comparator<Actor> actorFeeComparator = new ActorFeeComparator();
        actorsForStudio.sort(actorFeeComparator);
        actorsForStudio.remove(actorsForStudio.size() - 1);
    }




}


/*

public static Collection<String> resetWordsByLength(Collection<String> arrayWords, int wordLength) {
        Collection<String> arrayList = new ArrayList<>();
        for (String element : arrayWords) {
            if (element.length() != wordLength) {
                arrayList.add(element);
            } else {
                arrayList.add("*");
            }
        }
        return arrayList;
    }



Создать класс `Studio`.

Поля:

* `actors` - список актеров, которые работают в студии.

Методы:

* `fire()` - принимает список актеров и удаляющий из него актера с наибольшим гонораром.



 */
