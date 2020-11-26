package com.rakovets.course.javabasics.store;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Simulation {

    private static final Random globalRandom = new Random(System.currentTimeMillis());

    public synchronized int getRandomIntInRangeEnclosed(int min, int max) {
        return globalRandom.nextInt((max - min + 1) + min);
    }

    private final static int CUSTOMER_NUMBER = 3000;
    private final static int DESK_NUMBER = 6;

    public final int ITEM_DURATION_S_MIN = 3;
    public final int ITEM_DURATION_S_MAX = 8;





    public final CustomerFactory customerFactory = new CustomerFactory(this, CUSTOMER_NUMBER);

    public final ArrayList<DeskReport> results = new ArrayList<DeskReport>(DESK_NUMBER);

    public void perform() {
        ExecutorService executor = Executors.newFixedThreadPool(DESK_NUMBER);
        for (int i = 1; i <= DESK_NUMBER; i++) {
            executor.submit(new Desk(this, i));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void printResult() {
        int maxTimeS = 0;
        int maxItems = 0;
        int maxCustomers = 0;

        int minItems = Integer.MAX_VALUE;
        int minCustomers = Integer.MAX_VALUE;

        for (DeskReport r : results) {
            if (r.getSpentTime() > maxTimeS) {
                maxTimeS = r.getSpentTime();
            }

            if (r.getSoldItemCount() > maxItems) {
                maxItems = r.getSoldItemCount();
            }
            if (r.getSoldItemCount() < minItems) {
                minItems = r.getSoldItemCount();
            }


            if (r.getServedCustomerCount() > maxCustomers) {
                maxCustomers = r.getServedCustomerCount();
            }
            if (r.getServedCustomerCount() < minCustomers) {
                minCustomers = r.getServedCustomerCount();
            }

        }

        Date date = new Date(maxTimeS * 1000L);
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String dateFormatted = formatter.format(date);


        System.out.println("---------------- RESULTS ----------------");
        System.out.println(DESK_NUMBER + " desks served " + CUSTOMER_NUMBER + " customers in " + dateFormatted);
        System.out.println("Troughput min ~ max:");
        System.out.println(minItems + "\t~\t" + maxItems + " \titems/desk");
        System.out.println(minCustomers + "\t~\t" + maxCustomers + "\tcustomers/desk");
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation();
        sim.perform();
        sim.printResult();
    }
}

class CustomerFactory {

    private Simulation simulation;
    private int capacity = 0;

    public CustomerFactory(Simulation simulation, int capacity) {
        this.simulation = simulation;
        this.capacity = capacity;
    }

    public synchronized Customer getInstanceWithRandomCapacity() {
        if (capacity-- > 1) {
            return new Customer(this.simulation.getRandomIntInRangeEnclosed(1, 20));
        } else {
            return null;
        }
    }

}

class Desk implements Runnable {
    private Simulation s = null;
    private int deskNo = 0;

    private int servedCustomerCount = 0;
    private int soldItemCount = 0;
    private int spentTime = 0;

    public Desk(Simulation s, int deskNo) {
        this.s = s;
        this.deskNo = deskNo;
    }

    public void run() {
        System.out.println("Desk " + deskNo + " opening...");

        Customer c = null;
        while ((c = s.customerFactory.getInstanceWithRandomCapacity()) != null) {
            servedCustomerCount++;
            for (int i = c.getItemCount(); i > 1; i--) {
                soldItemCount++;
                spentTime += s.getRandomIntInRangeEnclosed(s.ITEM_DURATION_S_MIN, s.ITEM_DURATION_S_MAX);
            }
            //get short break after each customer ;)
            sleep(Long.valueOf(s.getRandomIntInRangeEnclosed(s.ITEM_DURATION_S_MIN, s.ITEM_DURATION_S_MAX)));
        }

        s.results.add(new DeskReport(deskNo, servedCustomerCount, soldItemCount, spentTime));
        System.out.println("Desk " + deskNo + "\tclosing.\tcustomers " + servedCustomerCount + "\titems " + soldItemCount + "\ttime(s) " + spentTime);
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DeskReport {
    private int deskNo = 0;
    private int servedCustomerCount = 0;
    private int soldItemCount = 0;
    private int spentTime = 0;

    public DeskReport(int deskNo, int servedCustomerCount, int soldItemCount, int spentTime) {
        this.deskNo = deskNo;
        this.servedCustomerCount = servedCustomerCount;
        this.soldItemCount = soldItemCount;
        this.spentTime = spentTime;
    }

    public int getDeskNo() {
        return deskNo;
    }

    public int getServedCustomerCount() {
        return servedCustomerCount;
    }

    public int getSoldItemCount() {
        return soldItemCount;
    }

    public int getSpentTime() {
        return spentTime;
    }

}

class Customer {
    private int itemCount = 0;

    public Customer(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getItemCount() {
        return this.itemCount;
    }
}
