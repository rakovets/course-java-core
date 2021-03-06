package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.view;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.model.Product;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.repository.ShoppingCartRepository;
import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.List;

public class ShoppingCartViewConsole implements ShoppingCartView {
    public List<Product> shoppingList;
    private static int numberOfCustomer;
    public String customer;
    public ShoppingCartRepository shoppingCartRepository = new ShoppingCartRepository();

    public void shoppingCartView() {
        numberOfCustomer++;
        customer = "CUSTOMER_" + numberOfCustomer;
        shoppingList = shoppingCartRepository.getShoppingCart();
        StandardOutputUtil.println(customer + " shopping cart:", AnsiColorCode.FG_GREEN_BOLD);
        for (Product product : shoppingList) {
            StandardOutputUtil.println(product, AnsiColorCode.FG_BLUE_BOLD_BRIGHT);
        }
    }
}
