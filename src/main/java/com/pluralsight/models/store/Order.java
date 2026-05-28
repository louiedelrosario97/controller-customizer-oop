package com.pluralsight.models.store;

import com.pluralsight.models.controller.Controller;

import java.util.List;

public class Order
{
    // private final int orderId;
    private final Cart cart;
    private final Customer customer;
    private String orderStatus;


    // Constructor
    public Order(Cart cart, Customer customer, String orderStatus)
    {
      //  this.orderId = orderId;
        this.cart = cart;
        this.customer = customer;
        this.orderStatus = orderStatus;
    }

    // Getters
    // public int getOrderId() { return orderId; }
    public Cart getCart() { return cart; }
    public Customer getCustomer() { return customer; }
    public String getOrderStatus() { return orderStatus; }

    // Derived Getter
    public double getOrderTotal()
    {
        return cart.getCartTotal();
    }

}

