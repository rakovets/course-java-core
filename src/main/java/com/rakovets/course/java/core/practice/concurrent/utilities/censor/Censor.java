package com.rakovets.course.java.core.practice.concurrent.utilities.censor;

public class Censor {
    private final String forbiddenWordsSource;
    private final String censoredDataPath;
    private String filepath = "";
    private String searchWord = "";

    public Censor(String forbiddenWordsSource, String censoredDataPath) {
        this.forbiddenWordsSource = forbiddenWordsSource;
        this.censoredDataPath = censoredDataPath;
    }

    public void check() {
        String[] targetData = CensorTargetInput.inputTargetData();
        filepath = targetData[0];
        searchWord = targetData [1];

            long start = System.nanoTime();

            Thread collector = new Thread(new Collector(filepath, searchWord, censoredDataPath));
            collector.start();
            try {
                collector.join();
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException.getMessage());
            }
            Thread cleaner = new Thread(new Cleaner(forbiddenWordsSource, censoredDataPath));
            cleaner.start();
            try {
                cleaner.join();
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException.getMessage());
            }
            System.out.println("Your data has been censored");
            System.out.printf("Censored in %d nanos\n", (System.nanoTime() - start));
        }

}
