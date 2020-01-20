package com.rakovets.java.solid.my.userHelper;

public class PaymentMethod {
    private String method;
    private String byCash;
    private String byCard;
    private String online;

    void printOfPaymentMethods(String byCash, String byCard, String online) {
        method = String.format("\nPaymentMethods: ByCash %s, ByCard %s, Online %s", byCash, byCard, online);
        System.out.println(method);
    }

    void selectionPaymentMethod(double coust, double numberpizza) {

    }
}



