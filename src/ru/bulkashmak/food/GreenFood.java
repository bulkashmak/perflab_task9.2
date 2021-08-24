package ru.bulkashmak.food;

public abstract class GreenFood {

    protected double price;
    protected double mass;

    public GreenFood(double price, double mass) {
        this.price = price;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "GreenFood: " +
                "price=" + price +
                ", mass=" + mass;
    }
}
