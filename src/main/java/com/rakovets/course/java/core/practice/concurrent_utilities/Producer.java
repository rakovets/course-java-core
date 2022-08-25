package com.rakovets.course.java.core.practice.concurrent_utilities;

public class Producer implements Runnable {
    Common common = new Common();

    @Override
    public void run() {
        common.produce();
    }
}


//                    WRITER.write(String.format(LOG_PATTERN, LocalDateTime.now(), Thread.currentThread().getName()));
//                    WRITER.flush();
//                    TimeUnit.SECONDS.sleep(1);

