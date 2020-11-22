package com.rakovets.course.javabasics.example.generictypes.model;

public class Transaction {
    public static boolean executeTransaction(BankAccount from, BankAccount to, int amount) {
        to.setSum(to.getSum() + amount);
        from.setSum(from.getSum() - amount);
        if (from instanceof StringBankAccount) {
            System.out.println(
                    "from -> " + ((StringBankAccount) from).id
            );
        } else if (from instanceof LongBankAccount) {
            System.out.println(
                    "from -> " + ((LongBankAccount) from).id
            );
        }

        System.out.println(
                "to <- " + ((StringBankAccount) to).id
        );

        return true;
    }
}
