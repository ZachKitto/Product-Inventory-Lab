import io.Console;
import services.BookService;
import utils.CSVUtils;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String... args){
        App application = new App();
        application.init();
    }

    public void init(){
        // (4)
        // application logic here
        // call methods to take user input and interface with services
        Console.printWelcome();
        Console.programStart();
    }
}
