package com.pluralsight.models.store;

import com.pluralsight.models.controller.Controller;

import java.util.List;

public class Order
{
    private final Cart cart;
 //   private final Customer customer;
 //   private String orderStatus;


    // Constructor
    public Order(Cart cart)
    {
        this.cart = cart;
    //    this.customer = customer;
    //    this.orderStatus = orderStatus;
    }

    // Getters
    public Cart getCart() { return cart; }
  //  public Customer getCustomer() { return customer; }

    // Derived Getter
    public double getOrderTotal()
    {
        return cart.getCartTotal();
    }

}

