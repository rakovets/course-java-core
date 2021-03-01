package com.rakovets.course.java.core.practice.concurrency.common.master_worker;
import com.rakovets.course.java.core.util.AnsiColorCode;
public class Demo {
    public static void main(String[] args) {
        Thread threadRunnable = new Thread(new ThreadWorker(), "Thread1");
        threadRunnable.start();
    }
}
