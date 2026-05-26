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

    private Cart cart;
    public double getOrderTotal()
    {
        return cart.getCartTotal();
    }

}

