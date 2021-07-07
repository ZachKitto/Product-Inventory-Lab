package io;

import models.Book;
import models.Coffee;
import services.BookService;
import services.CoffeeService;

import java.util.Scanner;

public class Console {

    private Scanner scanner = new Scanner(System.in);
    /*
    *Create different products to be added to inventory
    *Read from existing products
    *Update products
    *Delete products
    *Get different reports about products
    *Exit the program
     */


    public static void printWelcome(){
        System.out.println("" +
                "**************************************************" +
                "***           Welcome and Bienvenue            ***" +
                "***                    to                      ***" +
                "***          ZipCo Inventory Manager           ***" +
                "**************************************************");
    }

    public static void programStart() {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        //System.out.println("What would you like to do?\nEnter a number:\n1.) Check a product\n2.) Delete a product\n" +
        //        "3.) Update a product\n4.) Create a product\n5.) See list of inventory\n6.) Exit");
        while (loop) {
            System.out.println("What would you like to do?\nEnter a number:\n1.) Check a product\n2.) Delete a product\n" +
                    "3.) Update a product\n4.) Create a product\n5.) See list of inventory\n6.) Exit");

            switch (scanner.nextInt()) {
                case 1:
                    Console.checkProduct();
                    break;
                case 2:
                    Console.deleteProduct();
                    break;
                case 3:
                    Console.updateProduct();
                    break;
                case 4:
                    Console.createProduct();
                    break;
                case 5:
                    Console.listInventory();
                    break;
                case 6:
                    Console.exitProgram();
                    break;
                default:
                    loop = false;
            }
        }
    }

    public static void exitProgram() {
        System.exit(0);
    }

    public static void checkProduct() {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        CoffeeService coffeeService = new CoffeeService();
        //System.out.println("Do you want to check the parameter of a product? Yes or No");
        //if ("yes".equalsIgnoreCase(scanner.next())) {
            System.out.println("Book or Coffee?");
            if ("book".equalsIgnoreCase(scanner.next())) {
                Console.checkBook();
                //System.out.println("Book parameter has been updated");
            }
            else if ("coffee".equalsIgnoreCase(scanner.next())) {
                Console.checkCoffee();
                //System.out.println("Coffee parameter has been updated");
            }
        //}
    }

    public static void checkCoffee() {
        Scanner scanner = new Scanner(System.in);
        CoffeeService coffeeService = new CoffeeService();
        System.out.println("Input the id of the coffee you want to check");
        int id = scanner.nextInt();
        System.out.println("Which parameter do you want to check?");
        switch (scanner.next()) {
            case "quantity":
                coffeeService.findCoffee(id).getQuantity();
            case "price":
                coffeeService.findCoffee(id).getPrice();
            case "caffeinated":
                coffeeService.findCoffee(id).isCaffeinated();
            case "cream":
                coffeeService.findCoffee(id).getCream();
            case "sugar":
                coffeeService.findCoffee(id).getSugar();
        }
    }

    public static void checkBook() {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        System.out.println("Input the id of the book you want to check");
        int id = scanner.nextInt();
        System.out.println("Which parameter do you want to check?");
        switch (scanner.next()) {
            case "quantity":
                bookService.findBook(id).getQuantity();
            case "price":
                bookService.findBook(id).getPrice();
            case "genre":
                bookService.findBook(id).getGenre();
            case "name":
                bookService.findBook(id).getName();
            case "author":
                bookService.findBook(id).getAuthor();
        }
    }

    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        CoffeeService coffeeService = new CoffeeService();
        //System.out.println("Do you want to delete a product? Yes or No");
        //if ("yes".equalsIgnoreCase(scanner.next())) {
            System.out.println("Book or Coffee?");
            if ("book".equalsIgnoreCase(scanner.next())) {
                System.out.println("Enter the id of the book you want to delete");
                bookService.delete(scanner.nextInt());
            }
            else if ("coffee".equalsIgnoreCase(scanner.next())) {
                System.out.println("Enter the id of the coffee you want to delete");
                coffeeService.delete(scanner.nextInt());
            }
        //}
    }

    public static void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        CoffeeService coffeeService = new CoffeeService();
        //System.out.println("Do you want to update a product? Yes or No");
        //if ("yes".equalsIgnoreCase(scanner.next())) {
            System.out.println("Book or Coffee?");
            if ("book".equalsIgnoreCase(scanner.next())) {
                Console.updateBook();
                System.out.println("Book parameter has been updated");
            }
            else if ("coffee".equalsIgnoreCase(scanner.next())) {
                Console.updateCoffee();
                System.out.println("Coffee parameter has been updated");
            }
        //}
    }

    public static void updateCoffee() {
        Scanner scanner = new Scanner(System.in);
        CoffeeService coffeeService = new CoffeeService();
        System.out.println("Input the id of the coffee you want to update");
        int id = scanner.nextInt();
        System.out.println("Which parameter do you want to update?");
        switch (scanner.next()) {
            case "quantity":
                System.out.println("Input the new quantity");
                coffeeService.findCoffee(id).setQuantity(scanner.nextInt());
            case "price":
                System.out.println("Input the new price");
                coffeeService.findCoffee(id).setPrice(scanner.nextDouble());
            case "caffeinated":
                System.out.println("Input the new status of caffeination");
                coffeeService.findCoffee(id).setCaffeinated(scanner.nextBoolean());
            case "cream":
                System.out.println("Input the new amount of cream");
                coffeeService.findCoffee(id).setCream(scanner.nextInt());
            case "sugar":
                System.out.println("Input the new amount of sugar");
                coffeeService.findCoffee(id).setSugar(scanner.nextInt());
        }
    }

    public static void updateBook() {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        System.out.println("Input the id of the book you want to update");
        int id = scanner.nextInt();
        System.out.println("Which parameter do you want to update?");
        switch (scanner.next()) {
            case "quantity":
                System.out.println("Input the new quantity");
                bookService.findBook(id).setQuantity(scanner.nextInt());
            case "price":
                System.out.println("Input the new price");
                bookService.findBook(id).setPrice(scanner.nextDouble());
            case "genre":
                System.out.println("Input the new genre");
                bookService.findBook(id).setGenre(scanner.next());
            case "name":
                System.out.println("Input the new name");
                bookService.findBook(id).setName(scanner.next());
            case "author":
                System.out.println("Input the new author");
                bookService.findBook(id).setAuthor(scanner.next());
        }
    }

    public static void listInventory() {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        CoffeeService coffeeService = new CoffeeService();
        //System.out.println("Do you want to see a list of existing inventory? Yes or No");
        //if ("yes".equalsIgnoreCase(scanner.next())) {
            System.out.println("Do you want to see the book, or the coffee inventory?");
            if ("book".equalsIgnoreCase(scanner.next())) {
                System.out.println(bookService.findAll());
            }
            else if ("coffee".equalsIgnoreCase(scanner.next())) {
                System.out.println(coffeeService.findAll());
            }
        //}
    }

    public static void createProduct() {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        //System.out.println("Do you want to create a new product? Yes or No");
        //if (scanner.next().equalsIgnoreCase("yes")) {
            System.out.println("Which product? Book or Coffee");
            if (scanner.next().equalsIgnoreCase("book")) {
                Console.createBook();
            }
            else if (scanner.next().equalsIgnoreCase("coffee")) {
                Console.createCoffee();
            }
        //}
    }

    public static void createBook() {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        System.out.println("Input the quantity of this book to add");
        int quantity = scanner.nextInt();
        System.out.println("Input the price of this book");
        double price = scanner.nextDouble();
        System.out.println("Input the genre of this book");
        String genre = scanner.next();
        System.out.println("Input the name of this book");
        String name = scanner.next();
        System.out.println("Input the author of this book");
        String author = scanner.next();
        Book newBook = bookService.create(quantity, price, genre, name, author);
        //System.out.println("The book has been added to the inventory");
    }

    public static void createCoffee() {
        Scanner scanner = new Scanner(System.in);
        CoffeeService coffeeService = new CoffeeService();
        System.out.println("Input the quantity of this coffee to add");
        int quantity = scanner.nextInt();
        System.out.println("Input the price of this coffee");
        double price = scanner.nextDouble();
        System.out.println("Input if this coffee is caffeinated: True or False");
        boolean isCaffeinated = scanner.nextBoolean();
        System.out.println("Input the amount of cream in this coffee");
        int cream = scanner.nextInt();
        System.out.println("Input the amount of sugar in this coffee");
        int sugar = scanner.nextInt();
        Coffee newCoffee = coffeeService.create(quantity, price, isCaffeinated, cream, sugar);
        //System.out.println("The coffee has been added to the inventory");
    }
}
