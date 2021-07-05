package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void setNameTest() {
        // Given
        String expected = "Green Eggs and Ham";

        // When
        Book testBook = new Book();
        testBook.setName(expected);

        // Then
        Assertions.assertEquals(expected, testBook.getName());
    }

    @Test
    public void setQuantityTest() {
        // Given
        int expected = 1000;

        // When
        Book testBook = new Book();
        testBook.setQuantity(expected);

        // Then
        Assertions.assertEquals(expected, testBook.getQuantity());
    }

    @Test
    public void setPriceTest() {
        // Given
        double expected = 19.99;

        // When
        Book testBook = new Book();
        testBook.setPrice(expected);

        // Then
        Assertions.assertEquals(expected, testBook.getPrice());
    }

    @Test
    public void setGenreTest() {
        // Given
        String expected = "Fantasy";

        // When
        Book testBook = new Book();
        testBook.setGenre(expected);

        // Then
        Assertions.assertEquals(expected, testBook.getGenre());
    }

    @Test
    public void setAuthorTest() {
        // Given
        String expected = "Tolkien";

        // When
        Book testBook = new Book();
        testBook.setAuthor(expected);

        // Then
        Assertions.assertEquals(expected, testBook.getAuthor());
    }

    @Test
    public void setIdTest() {
        // Given
        int expected = 2371;

        // When
        Book testBook = new Book();
        testBook.setId(expected);

        // Then
        Assertions.assertEquals(expected, testBook.getId());
    }

    @Test
    public void constructorTest() {
        // Given
        int expectedQuantity = 10;
        double expectedPrice = 11.99;
        String expectedGenre = "Children";
        String expectedName = "Green Eggs and Ham";
        String expectedAuthor = "Dr. Seuss";
        int expectedId = 472;

        // When
        Book testBook = new Book(expectedQuantity, expectedPrice, expectedGenre,
                expectedName, expectedAuthor, expectedId);

        // Then
        Assertions.assertEquals(expectedQuantity, testBook.getQuantity());
        Assertions.assertEquals(expectedPrice, testBook.getPrice());
        Assertions.assertEquals(expectedGenre, testBook.getGenre());
        Assertions.assertEquals(expectedName, testBook.getName());
        Assertions.assertEquals(expectedAuthor, testBook.getAuthor());
        Assertions.assertEquals(expectedId, testBook.getId());
    }
}
