package com.pluralsight.models.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest
{
    @Test
    public void getPrice_should_return_BasePrice_whenZeroUpgrades()
    {
        // Arrange
        BaseController base = new BaseController("Indigo (Original)", 45.00);
        Controller controller = new Controller(base);
        double expectedPrice = 45.00;

        // Act
        double actualPrice = controller.getPrice();

        // Asset
        assertEquals(expectedPrice, actualPrice);
    }
}