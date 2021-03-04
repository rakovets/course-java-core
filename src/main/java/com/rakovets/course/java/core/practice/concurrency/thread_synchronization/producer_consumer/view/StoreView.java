package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.view;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.ProductList;
import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class StoreView {

    public static void produceView() {
        StandardOutputUtil.printlnWithTimeAndThread("Producer added 1 product to the Store.",
                AnsiColorCode.FG_GREEN_BOLD);
        StandardOutputUtil.printlnWithTimeAndThread("Total products in the Store: " + ProductList.size(),
                AnsiColorCode.FG_BLUE_BOLD);
    }

    public static void consumeView() {
        StandardOutputUtil.printlnWithTimeAndThread("Consumer got 1 product from the Store.",
                AnsiColorCode.FG_RED_BOLD);
        StandardOutputUtil.printlnWithTimeAndThread("Total products in the Store: " + ProductList.size(),
                AnsiColorCode.FG_BLUE_BOLD);
    }
}
