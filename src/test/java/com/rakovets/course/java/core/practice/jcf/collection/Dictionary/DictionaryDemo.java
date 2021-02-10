package com.rakovets.course.java.core.practice.jcf.collection.Dictionary;

import java.util.HashMap;
import java.util.Map;

class DictionaryDemo {
    public static void main(String[] args) {

        Map<String, Word> dictionary = new HashMap<>();

        dictionary.put("Dictionary", new Word("Diccionario"));
        dictionary.put("Words", new Word("Palabras"));
        dictionary.put("Category", new Word("Categoria"));
        dictionary.put("Billet", new Word(""));

        System.out.println("\nENGLISH-SPANISH DICTIONARY:\n");
        System.out.println("Dictionary - " + dictionary.get("Dictionary"));
        System.out.println("Words - " + dictionary.get("Words"));
        System.out.println("Category - " + dictionary.get("Category"));
        System.out.println("Billet - " + dictionary.get("Billet"));

        System.out.println("\nADDING WORD TRANSLATION:\n");
        dictionary.replace("Billet", new Word("Palanquilla"));
        System.out.println("Billet - " + dictionary.get("Billet"));

        System.out.println("\nREPLACING WORD TRANSLATION:\n");
        dictionary.replace("Dictionary", new Word("El Diccionario"));
        System.out.println("Dictionary : " + dictionary.get("Dictionary"));

        System.out.println("\nREMOVING WORD TRANSLATION:\n");
        Object word = dictionary.remove("Dictionary");
        System.out.println(word + " - removed from dictionary");

        System.out.println("\nADDING NEW WORD:\n");
        dictionary.put("Vocabulary", new Word("Vocabulario"));
        System.out.println("Vocabulary - " + dictionary.get("Vocabulary"));

        System.out.println("\nREMOVING WORD:\n");
        dictionary.remove("\"Words");
        System.out.println("Checking if the removed value exists: " + dictionary.get("\"Words"));
        System.out.println("\nSize of Dictionary : " + dictionary.size());
    }
}


