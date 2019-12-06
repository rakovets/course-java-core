package com.rakovets.java.task.collections.list.hollywood;

import com.rakovets.java.task.collections.list.school.CamporatorOfNameAndSurname;
import com.rakovets.java.task.collections.list.school.Student;

import java.util.ArrayList;
import java.util.Collections;

public class HollywoodDemo {
    public static void main(String[] args) {
        ArrayList<Actor> arrayList = new ArrayList<>();
        arrayList.add(new Actor("Nikita", "KOchetkov", 2000, 39));
        arrayList.add(new Actor("Kitai", "Oloid", 4000, 28));
        arrayList.add(new Actor("Luba", "Ivanova", 7000, 34));
        arrayList.add(new Actor("Selvester", "Stalone", 2340, 20));
        arrayList.add(new Actor("Angelina", "Golly", 350, 25));
        HollywoodUtil hollywoodUtil = new HollywoodUtil();
        Actor bestFee = hollywoodUtil.getHireFire(arrayList);
        System.out.println("The actor with the highest salary is : ");
        System.out.println(bestFee);
        System.out.println("Get HireFee :");
        printSortedByHireFee(arrayList);
        System.out.println("Get Age :");
        getAge(arrayList);
        System.out.println("Get Fee :");
        getFee(arrayList);
        System.out.println("Get Fee and LastName :");
        getFeeAndLastName(arrayList);
        System.out.println("Get LastName and Age :");
        getLastNameAndAge(arrayList);
        System.out.println("Get LastName");
        getLastName(arrayList);
    }

    public static void printSortedByHireFee(ArrayList<Actor> arrayList) {
        Collections.sort(arrayList, new ActorsCamporators.CamporatorOfFee());
        for (Actor s1 : arrayList) {
            System.out.println(s1);
        }
    }

    public static void getAge(ArrayList<Actor> arrayList) {
        Collections.sort(arrayList, new ActorsCamporators.CamporatorOfAge());
        for (Actor a1 : arrayList) {
            System.out.println(a1.getAge());

        }
    }

    public static void getLastName(ArrayList<Actor> arrayList) {
        Collections.sort(arrayList, new ActorsCamporators.CamporatorOfLastName());
        for (Actor a2 : arrayList) {
            System.out.println(a2.getLastName());

        }
    }

    public static void getFee(ArrayList<Actor> arrayList) {
        Collections.sort(arrayList, new ActorsCamporators.CamporatorOfFee());
        for (Actor a3 : arrayList) {
            System.out.println(a3.getFee());

        }
    }

    public static void getLastNameAndAge(ArrayList<Actor> arrayList) {
        Collections.sort(arrayList, new ActorsCamporators.CamporatorOfLastNameAndAge());
        for (Actor a4 : arrayList) {
            System.out.println(a4);

        }
    }

    public static void getFeeAndLastName(ArrayList<Actor> arrayList) {
        Collections.sort(arrayList, new ActorsCamporators.CamporatorOfFeeAndLastName());
        for (Actor a5 : arrayList) {
            System.out.println(a5);

        }
    }
}

