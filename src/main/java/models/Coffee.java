package models;

public class Coffee {
    private int quantity;
    private double price;
    private boolean isCaffeinated;
    private int cream;
    private int sugar;

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

    public boolean isCaffeinated() {
        return isCaffeinated;
    }

    public void setCaffeinated(boolean caffeinated) {
        isCaffeinated = caffeinated;
    }

    public int getCream() {
        return cream;
    }

    public void setCream(int cream) {
        this.cream = cream;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
