package com.rakovets.course.java.core.practice.jcf_map;

public class DictionaryDemo {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("poppy", "мак");
        dictionary.add("poppy", "маковый");
        dictionary.add("poppy", "мак опийный");

        dictionary.add("concern", "касаться");


        dictionary.add("show", "показывать");
        dictionary.add("show", "шоу");
        dictionary.add("abuse", "злоупотреблять");
        dictionary.add("watch", "смотреть");
        dictionary.add("mop", "швабра");
        dictionary.add("get", "получать");
        dictionary.add("get", "принимать");




        dictionary.printDictionary();
        dictionary.showBottom(3);
        dictionary.showTop(3);
    }
}
