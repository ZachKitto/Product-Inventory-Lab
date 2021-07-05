package models;

public class Book {
    private int quantity;
    private double price;
    private String genre;
    private String name;
    private String author;
    private int id;

    public Book(int quantity, double price, String genre,
                String name, String author, int id) {
        this.quantity = quantity;
        this.price = price;
        this.genre = genre;
        this.name = name;
        this.author = author;
        this.id = id;
    }

    public Book() {

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
