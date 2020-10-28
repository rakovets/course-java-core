package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.example.generics.model.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StringCollectionUtilTest {

    @Test

    void replacement() {
        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        String[] test = new String[]{"this", "*", "lots", "*", "fun", "for", "every", "Java", "programmer"};
        ArrayList<String> list = new ArrayList<>();
        for (String string : array) {
            list.add(string);
        }
        StringCollectionUtil.resetWordsByLength(list, 2);
        Assertions.assertArrayEquals(test, list.toArray());
    }

    @Test
    void remove() {
        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        String[] test = new String[]{"this", "lots", "fun", "for", "every", "Java", "programmer"};
        ArrayList<String> list = new ArrayList<>();
        for (String string : array) {
            list.add(string);
        }
        StringCollectionUtil.removeWordsByLength(list, 2);
        Assertions.assertArrayEquals(test, list.toArray());
    }

}
