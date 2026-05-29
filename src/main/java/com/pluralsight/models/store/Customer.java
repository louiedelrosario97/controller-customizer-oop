package com.pluralsight.models.store;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String shippingAddress;
    private final String cardNumber;

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


}


