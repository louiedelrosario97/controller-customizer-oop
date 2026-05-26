package com.pluralsight.models.store;

import com.pluralsight.models.controller.Controller;

import java.util.List;

public class Order
{
    private final int orderId;
    private final Customer customer;
    private String orderStatus;



    // Constructor
    public Order(int orderId, Customer customer, String orderStatus)
    {
        this.orderId = orderId;
        this.customer = customer;
        this.orderStatus = orderStatus;
    }

    // Getters
    public String getOrderStatus() { return orderStatus; }
    public Customer getCustomer() { return customer; }
    public int getOrderId() { return orderId; }

    // Derived Getter
    public double getOrderTotal()
    { // Need to create a Cart class to add the values of all the items.
        double total = 0;
        return total; // Unfinished logic
    }

}

