package services;

import models.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeService {

    private static int nextId = 1;

    private List<Coffee> inventory = new ArrayList<Coffee>();


    public Coffee create(int quantity, double price, boolean isCaffeinated, int cream, int sugar) {
        Coffee createdCoffee = new Coffee(quantity, price, isCaffeinated, cream, sugar, nextId++);
        inventory.add(createdCoffee);
        return createdCoffee;
    }

    public Coffee findCoffee (int id) {
        for (Coffee coffee : inventory) {
            if (coffee.getId() == id) {
                return coffee;
            }
        }
        return null;
    }

    public Coffee[] findAll() {
        return inventory.toArray(new Coffee[0]);
    }

    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        for (Coffee coffee : inventory) {
            if (coffee.getId() == id) {
                inventory.remove(coffee);
                return true;
            }
        }
        return false;
    }
}
