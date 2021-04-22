package com.rakovets.course.java.core.practice.jcf_list.studio;

public class StudioDemo {
    public static void main(String[] args) {

        Studio studio = new Studio();
        studio.list.add(new Actor("Vania", "D", 120, 10));
        studio.list.add(new Actor("Misha", "K", 150, 20));
        studio.list.add(new Actor("Ania", "f", 160, 25));
        studio.list.add(new Actor("Hilena", "P", 90, 10));
        studio.list.add(new Actor("Petr", "f", 180, 40));
        studio.list.add(new Actor("Kris", "G", 10, 50));
        System.out.println(studio.toString());
        studio.fire(studio.getList());
        System.out.println(studio.toString());
    }
}
