package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String str = "Meet my family. There are five of us – my parents, my elder brother, my baby sister and me. First, meet my mum and dad, Jane and Michael. My mum enjoys reading and my dad enjoys playing chess with my brother Ken. My mum is slim and rather tall. She has long red hair and big brown eyes. She has a very pleasant smile and a soft voice. My mother is very kind and understanding. We are real friends. She is a housewife. As she has three children, she is always busy around the house. She takes care of my baby sister Meg, who is only three months old. My sister is very small and funny. She sleeps, eats and sometimes cries. We all help our mother and let her have a rest in the evening. Then she usually reads a book or just watches TV. My father is a doctor. He is tall and handsome. He has short dark hair and gray eyes. He is a very hardworking man. He is rather strict with us, but always fair. My elder brother Ken is thirteen, and he is very clever. He is good at Maths and always helps me with it, because I can hardly understand all these sums and problems. Ken has red hair and brown eyes. My name is Jessica. I am eleven. I have long dark hair and brown eyes. I am not as clever as my brother, though I try to do my best at school too. I am fond of dancing. Our dancing studio won The Best Dancing Studio 2015 competition last month. I am very proud of it. I also like to help my mother with my little sister very much. Our family is very united. We love each other and always try to spend more time together.";
        System.out.println(TextMonitoring.researchText(str));
        System.out.println(TextMonitoring.getCountUniqueWords(str));
        System.out.println(TextMonitoring.getUniqueWords(str));
        System.out.println(TextMonitoring.getFrequencyWord(str,"family"));
        System.out.println(TextMonitoring.getFrequencyWords(str,false));
        System.out.println(TextMonitoring.getFrequencyWords(str,true));
    }

}
