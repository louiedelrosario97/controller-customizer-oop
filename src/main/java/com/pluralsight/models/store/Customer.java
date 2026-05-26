package com.pluralsight.models.store;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String shippingAddress;
    private String cardNumber;

    // Constructor
    public Customer(String firstName, String lastName, String email, String shippingAddress, String cardNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.cardNumber = cardNumber;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getShippingAddress() { return shippingAddress; }
    public String getCardNumber() { return cardNumber; }

    // Derived Getter - ( Will use to retrieve full name when needed )
    public String getFullName() { return firstName + " " + lastName; }

    // format for receipt later...
    @Override
    public String toString() {}
}


