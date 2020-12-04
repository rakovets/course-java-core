package store;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer.store.Customer;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer.store.Shop;

public class StoreTest {
    public static void main(String[] args) {
        int numberOfCustomers = 3;
        Customer[] buyers = new Customer[numberOfCustomers];
        Shop shop = new Shop();
        for (int i = 0; i < numberOfCustomers; i++) {
            buyers[i] = new Customer(shop);
            new Thread(buyers[i]).start();
        }
    }
}
