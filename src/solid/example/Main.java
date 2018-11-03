package solid.example;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the driver class for this package.
 * It creates a list of four Customers, prints the details of each Customer, and calculates individual and total bills.
 * Created by jsadi on 11/3/2018
 * @author Jordan Sadi
 * @version 2018 1103 1
 */
public class Main {

    public static void main(String[] args) {
        List<Customer> orders = new ArrayList<>();
        orders.add(new Customer("William Walters", 75.34, new Discount()));
        orders.add(new Customer("Susan Smothers", 24.12, new Sale()));
        orders.add(new Customer("Jessica Johnson", 273.93, new Liquidation()));
        orders.add(new Customer("Richard Ricardo", 171.42, new Discount()));

        double total = 0;
        for(Customer o : orders) {
            o.getDiscountType().setBillAmount(o.getBillAmount());
            System.out.println(o.getCustomerName() + " " + o.getDiscountType().getBillAmount());
            total += o.getDiscountType().getBillAmount();
        }
        System.out.println("Total:    " + total);
    }
}
