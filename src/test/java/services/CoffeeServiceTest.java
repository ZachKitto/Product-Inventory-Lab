package services;

import models.Book;
import models.Coffee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeServiceTest {

    @Test
    public void createTest() {
        // Given
        int expectedQuantity = 100;
        double expectedPrice = 1.99;
        boolean expectedIsCaffeinated = true;
        int expectedCream = 3;
        int expectedSugar = 3;

        // When
        CoffeeService coffeeService = new CoffeeService();
        Coffee testCoffee = coffeeService.create(expectedQuantity, expectedPrice, expectedIsCaffeinated,
                expectedCream, expectedSugar);

        int actualQuantity = testCoffee.getQuantity();
        double actualPrice = testCoffee.getPrice();
        boolean actualIsCaffeinated = testCoffee.isCaffeinated();
        int actualCream = testCoffee.getCream();
        int actualSugar = testCoffee.getSugar();
        int actualId = testCoffee.getId();

        // Then
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedIsCaffeinated, actualIsCaffeinated);
        Assertions.assertEquals(expectedCream, actualCream);
        Assertions.assertEquals(expectedSugar, actualSugar);
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
    }

    @Test
    public void findCoffeeTest() {
        // Given
        int expectedId = 1;

        // When
        CoffeeService coffeeService = new CoffeeService();
        Coffee exampleCoffee = coffeeService.create(100, 1.99, true,
                3, 3);
        Coffee expectedCoffee = coffeeService.findCoffee(expectedId);

        int actualId = exampleCoffee.getId();
        Coffee actualCoffee = coffeeService.findCoffee(actualId);

        // Then
        Assertions.assertEquals(expectedCoffee, actualCoffee);
    }

    @Test
    public void findAllTest() {
        // Given
        CoffeeService coffeeService = new CoffeeService();
        Coffee exampleCoffee = coffeeService.create(100, 1.99, true,
                3, 3);

        // When
        Coffee[] expectedArray = new Coffee[] {exampleCoffee};
        Coffee[] actualArray = coffeeService.findAll();

        // Then
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void deleteTest() {
        // Given
        int idToDelete = 3;

        // When
        CoffeeService coffeeService = new CoffeeService();
        Coffee exampleCoffee = coffeeService.create(100, 1.99, true,
                3, 3);
        Coffee exampleCoffee1 = coffeeService.create(50, 0.99, false,
                10, 10);
        boolean idToDeleteExists = coffeeService.delete(exampleCoffee.getId());
        boolean idToDeleteExists1 = coffeeService.delete(idToDelete);

        // Then
        Assertions.assertTrue(idToDeleteExists);
        Assertions.assertFalse(idToDeleteExists1);
    }
}
