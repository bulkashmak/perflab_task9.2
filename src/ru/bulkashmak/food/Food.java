package ru.bulkashmak.food;

public abstract class Food {

    public double price;
    public double mass;
    public int grade; //сорт (первый сорт, второй ...)

    public Food(double price, double mass, int grade) {
        this.price = price;
        this.mass = mass;
        this.grade = grade;
    }
}
