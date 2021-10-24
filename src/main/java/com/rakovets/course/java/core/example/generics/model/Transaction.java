package com.rakovets.course.java.core.example.generics.model;

public class Transaction<T extends AccountWithGeneric> {
    private T from; // с какого счета перевод
    private T to; // на какой счет перевод
    private int sum; // сумма перевода

    public Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        System.out.printf("Before transaction.\nAccount %s: %d \nAccount %s: %d \n\n",
                from.getId(), from.getSum(), to.getId(), to.getSum());
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Execute transaction: from %s to %s sum: %d \n\n",
                    from.getId(), to.getId(), sum);
        } else {
            System.out.println("Operation is invalid\n");
        }
        System.out.printf("After transaction.\nAccount %s: %d \nAccount %s: %d \n\n",
                from.getId(), from.getSum(), to.getId(), to.getSum());
    }
}
