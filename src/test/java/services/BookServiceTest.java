package services;
import models.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookServiceTest {

    @Test
    public void createTest() {
        // Given
        int expectedQuantity = 10;
        double expectedPrice = 11.99;
        String expectedGenre = "Children";
        String expectedName = "Green Eggs and Ham";
        String expectedAuthor = "Dr. Seuss";

        // When
        BookService bookService = new BookService();
        Book testBook = bookService.create(expectedQuantity, expectedPrice, expectedGenre,
                expectedName, expectedAuthor);

        int actualQuantity = testBook.getQuantity();
        double actualPrice = testBook.getPrice();
        String actualGenre = testBook.getGenre();
        String actualName = testBook.getName();
        String actualAuthor = testBook.getAuthor();
        int actualId = testBook.getId();

        // Then
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedGenre, actualGenre);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedAuthor, actualAuthor);
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
    }

    @Test
    public void findBookTest() {
        // Given
        int expectedId = 1;

        // When
        BookService bookService = new BookService();
        Book exampleBook = bookService.create(4, 11.99, "Fantasy",
                "Lord of the Rings", "Tolkien");
        Book expectedBook = bookService.findBook(expectedId);

        int actualId = expectedBook.getId();
        Book actualBook = bookService.findBook(actualId);

        // Then
        Assertions.assertEquals(expectedBook, actualBook);
    }

    @Test
    public void findAllTest() {
        // Given
        BookService bookService = new BookService();
        Book exampleBook = bookService.create(4, 11.99, "Fantasy",
                "Lord of the Rings", "Tolkien");

        // When
        Book[] expectedArray = new Book[] {exampleBook};
        Book[] actualArray = bookService.findAll();

        // Then
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void deleteTest() {
        // Given
        int idToDelete = 3;

        // When
        BookService bookService = new BookService();
        Book exampleBook = bookService.create(4, 11.99, "Fantasy",
                "Lord of the Rings", "Tolkien");
        Book exampleBook1 = bookService.create(5, 9.99, "Children",
                "Green Eggs and Ham", "Dr. Seuss");
        boolean idToDeleteExists = bookService.delete(exampleBook.getId());
        boolean idToDeleteExists1 = bookService.delete(idToDelete);

        // Then
        Assertions.assertTrue(idToDeleteExists);
        Assertions.assertFalse(idToDeleteExists1);
    }
}
