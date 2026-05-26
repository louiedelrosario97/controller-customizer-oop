package com.pluralsight.models.store;

import com.pluralsight.models.controller.Controller;

import java.util.List;

public class Order
{
    private int orderId;
    private Customer customer;
    private String orderStatus;



    // Constructor
    public Order(int orderId, Customer customer, String orderStatus, List<Controller> controllers)
    {
        this.orderId = orderId;
        this.customer = customer;
        this.orderStatus = orderStatus;
        this.controllers = controllers;
    }

    // Getters
    public List<Controller> getControllers() { return controllers; }
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

