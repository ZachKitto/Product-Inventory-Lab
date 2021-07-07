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

    @Test
    public void setIdTest() {
        // Given
        int expected = 12;

        // When
        Coffee testCoffee = new Coffee();
        testCoffee.setId(expected);

        // Then
        Assertions.assertEquals(expected, testCoffee.getId());
    }

    @Test
    public void constructorTest() {
        // Given
        int expectedQuantity = 100;
        double expectedPrice = 2.49;
        boolean expectedIsCaffeinated = true;
        int expectedCream = 4;
        int expectedSugar = 2;
        int expectedId = 12;

        // When
        Coffee testCoffee = new Coffee(expectedQuantity, expectedPrice, expectedIsCaffeinated,
                expectedCream, expectedSugar, expectedId);

        // Then
        Assertions.assertEquals(expectedQuantity, testCoffee.getQuantity());
        Assertions.assertEquals(expectedPrice, testCoffee.getPrice());
        Assertions.assertEquals(expectedIsCaffeinated, testCoffee.isCaffeinated());
        Assertions.assertEquals(expectedCream, testCoffee.getCream());
        Assertions.assertEquals(expectedSugar, testCoffee.getSugar());
    }
}
