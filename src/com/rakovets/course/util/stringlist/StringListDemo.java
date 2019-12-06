package com.rakovets.course.util.stringlist;

import java.util.ArrayList;
import java.util.List;

public class StringListDemo {
    public static void main(String[] args) {
        List<String> str1 = new ArrayList<>();
        str1.add("this");
        str1.add("is");
        str1.add("lots");
        str1.add("of");
        str1.add("fun");
        str1.add("for");
        str1.add("every");
        str1.add("Java");
        str1.add("programmer");

        System.out.println("Beggining List: ");
        StringList.printList(str1);
        System.out.println("List with marked elements: ");
        StringList.printList(StringList.markWordsWithLength(str1, 4));
        System.out.println("List with deleted elements: ");
        StringList.printList(StringList.removeWordsWithLength(str1, 4));
    }


}
