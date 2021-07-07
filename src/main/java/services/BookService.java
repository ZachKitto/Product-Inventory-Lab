package services;
import models.Book;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    private static int nextId = 1;

    private List<Book> inventory = new ArrayList<Book>();


    public Book create(int quantity, double price, String genre, String name, String author) {
        Book createdBook = new Book(quantity, price, genre, name, author, nextId++);
        inventory.add(createdBook);
        return createdBook;
    }

    public Book findBook (int id) {
        for (Book book : inventory) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public Book[] findAll() {
        return inventory.toArray(new Book[0]);
    }

    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        for (Book book : inventory) {
            if (book.getId() == id) {
                inventory.remove(book);
                return true;
            }
        }
        return false;
    }
}


