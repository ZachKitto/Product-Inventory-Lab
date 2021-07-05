package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeTest {

    @Test
    public void setQuantityTest() {
        // Given
        int expected = 500;

        // When
        Coffee testCoffee = new Coffee();
        testCoffee.setQuantity(expected);

        // Then
        Assertions.assertEquals(expected, testCoffee.getQuantity());
    }

    @Test
    public void setPriceTest() {
        // Given
        double expected = 2.47;

        // When
        Coffee testCoffee = new Coffee();
        testCoffee.setPrice(expected);

        // Then
        Assertions.assertEquals(expected, testCoffee.getPrice());
    }

    @Test
    public void setIsCaffeinatedTest() {
        // Given
        boolean expected = true;

        // When
        Coffee testCoffee = new Coffee();
        testCoffee.setCaffeinated(expected);

        // Then
        Assertions.assertEquals(expected, testCoffee.isCaffeinated());
    }

    @Test
    public void setCreamTest() {
        // Given
        int expected = 4;

        // When
        Coffee testCoffee = new Coffee();
        testCoffee.setCream(expected);

        // Then
        Assertions.assertEquals(expected, testCoffee.getCream());
    }

    @Test
    public void setSugarTest() {
        // Given
        int expected = 2;

        // When
        Coffee testCoffee = new Coffee();
        testCoffee.setSugar(expected);

        // Then
        Assertions.assertEquals(expected, testCoffee.getSugar());
    }
}
