package com.rakovets.java.task.collections.list.hollywood;

import com.rakovets.java.task.collections.list.school.Student;

import java.util.Comparator;

public class ActorsCamporators {

    public static class CamporatorOfFee implements Comparator<Actor> {
        public int compare(Actor o1, Actor o2) {
            return o1.getFee().compareTo(o2.getFee());
        }
    }

    public static class CamporatorOfLastName implements Comparator<Actor> {
        public int compare(Actor o1, Actor o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    public static class CamporatorOfLastNameAndAge implements Comparator<Actor> {
        public int compare(Actor o1, Actor o2) {
            int compareofage = new CamporatorOfAge().compare(o1, o2);
            if (compareofage == 0) {
                int LastNameCamporator = new CamporatorOfLastName().compare(o1, o2);
                return LastNameCamporator;
            }
            return compareofage;
        }
    }

    public static class CamporatorOfFeeAndLastName implements Comparator<Actor> {
        public int compare(Actor o1, Actor o2) {
            int feecompaur = new CamporatorOfFee().compare(o1, o2);
            if (feecompaur == 0) {
                int LastNameCamporator = new CamporatorOfLastName().compare(o1, o2);
                return LastNameCamporator;
            }
            return feecompaur;
        }
    }

    public static class CamporatorOfAge implements Comparator<Actor> {
        public int compare(Actor a, Actor b) {
            if (a.getAge() > b.getAge())
                return 1;
            else if (a.getAge() < b.getAge())
                return -1;
            else
                return 0;
        }
    }

}
