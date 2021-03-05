package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.view;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.Product;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.ShoppingCart;
import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.List;

public class ShoppingCartView {
    public List<Product> shoppingList;
    static int numberOfCustomer;
    public String customer;
    public ShoppingCart shoppingCart = new ShoppingCart();

    public void shoppingCartView() {
        numberOfCustomer++;
        customer = "CUSTOMER_" + numberOfCustomer;
        shoppingList = shoppingCart.getShoppingCart();
        StandardOutputUtil.println(customer + " shopping cart:", AnsiColorCode.FG_GREEN_BOLD);
        for (Product product : shoppingList) {
            StandardOutputUtil.println(product, AnsiColorCode.FG_BLUE_BOLD_BRIGHT);
        }
    }
}
