package com.rakovets.course.java.core.practice.concurrency.common.project_master_worker;

public class ThreadWorker extends Thread {
    CommonResourse resourse;

    public ThreadWorker(CommonResourse resourse) {
        this.resourse = resourse;
    }

    @Override
    public void run() {
        System.out.printf("%s Started: \n", Thread.currentThread().getName());
        while (!Thread.interrupted()) {
            int seconds;
            if (resourse.commonList.isEmpty()) {
                seconds = 1;
                try {
                    Thread.sleep(seconds * 1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String awaiting = " ...";
                WorkerWriter.write("src/main/resources/practice/sleep.txt", awaiting);
            } else if (resourse.commonList.get(0) > 0) {
                seconds = resourse.commonList.get(0);
                try {
                    Thread.sleep(seconds * 1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                resourse.commonList.remove(0);
                String textToWrite = String.format(" - i slept %d seconds", seconds);
                WorkerWriter.write("src/main/resources/practice/sleep.txt", textToWrite);
            } else if (resourse.commonList.get(0) == -1){
                currentThread().interrupt();
            }
        }
    }
}
