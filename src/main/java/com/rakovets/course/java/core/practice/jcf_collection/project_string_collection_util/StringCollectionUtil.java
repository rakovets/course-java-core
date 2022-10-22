package com.rakovets.course.java.core.practice.jcf_collection.project_string_collection_util;

import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    private List<String> arrayList;

    public StringCollectionUtil(List<String> arrayList) {
        this.arrayList = arrayList;
    }

    public List<String> resetWordsByLength(List<String> wordArrayList, int wordLength) {
        final String STRING_FOR_RESET = "*";
        ListIterator<String> listIterator = wordArrayList.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().length() == wordLength) {
                listIterator.set(STRING_FOR_RESET);
            }
        }
        return wordArrayList;
    }

    public List<String> removeWordsByLength(List<String> wordArrayList, int wordLength) {
        ListIterator<String> listIterator = wordArrayList.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().length() == wordLength) {
                listIterator.remove();
            }
        }
        return wordArrayList;
    }

    public void printMyArrayList(List<String> arrayList) {
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + ", ");
        }
        System.out.println("well done! God boy!");
    }

    public List<String> getArrayList() {
        return this.arrayList;
    }

    public void setArrayList(List<String> arrayList) {
        this.arrayList = arrayList;
    }
}
