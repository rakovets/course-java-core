package com.rakovets.course.java.core.practice.jcf_collection;
import java.util.*;
    public class StringCollectionUtil {
        public List<String> resetWordsByLength(List<String> list, int wordLength) {
            ListIterator<String> listIter = list.listIterator();
            while (listIter.hasNext()) {
                if (listIter.next().length() == wordLength) {
                    listIter.set("*");
                }
            }
            return list;
        }
        public Collection<String> removeWordsByLength(Collection<String> list, int wordLength) {
            Iterator<String> iter = list.iterator();
            while (iter.hasNext()) {
                if (iter.next().length() == wordLength) {
                    iter.remove();
                }
            }
            return list;
        }
        public List<String> makeList() {
            List<String> list = new ArrayList<>();
            list.add("This");
            list.add("is");
            list.add("lots");
            list.add("of");
            list.add("fun");
            list.add("for");
            list.add("every");
            list.add("Java");
            list.add("programmer");
            return list;
        }
    }
