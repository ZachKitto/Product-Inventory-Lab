package services;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import models.Book;
import utils.CSVUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookService {

    private static int nextId = 1;

    private static List<Book> inventory = new ArrayList<Book>();

    public void implementCSVUtility() throws IOException {

        String csvFile = "/Users/zach/dev/Book.csv";
        FileWriter writer = new FileWriter(csvFile); //(1)

        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));  // (2)

        for (Book s : inventory) {
            List<String> list = new ArrayList<>(); // (3)
            list.add(String.valueOf(s.getId()));
            list.add(s.getName());
            list.add(s.getGenre());
            list.add(s.getAuthor());
            list.add(String.valueOf(s.getQuantity()));
            list.add(String.valueOf(s.getPrice()));

            CSVUtils.writeLine(writer, list);  // (4)
        }

        // (5)
        writer.flush();
        writer.close();
    }

    public void loadData(){
        // (1)
        String csvFile = "/Users/zach/dev/Book.csv";
        String line = "";
        String csvSplitBy = ",";

        // (2)
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = Integer.parseInt(br.readLine());  // (3)

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] beer = line.split(csvSplitBy);

                // (4)
                int id = Integer.parseInt(beer[0]);
                String name = beer[1];
                String genre = beer[2];
                String author = beer[3];
                int quantity = Integer.parseInt(beer[4]);
                float price = Float.parseFloat(beer[5]);

                // (5)
                inventory.add(new Book(quantity, price, genre, name, author, id));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readJSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        this.inventory = objectMapper.readValue(new File("book.json"), new TypeReference<List<Book>>(){});
    }

    public void writeJSON() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("book.json"), inventory);

    }



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


