import io.Console;
import models.Book;
import services.BookService;
import utils.CSVUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String... args) throws IOException {
        App application = new App();
        BookService bookService = new BookService();
        application.init();
    }

    public void init() throws IOException {
        // (4)
        // application logic here
        // call methods to take user input and interface with services
        Console.printWelcome();
        Console.programStart();
    }
}
