package ru.bulkashmak.storage;

public class Box<Food> {

    public int storeId;
    public String storeName;
    Food food;

    public Box(int storeId, String storeName, Food food) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.food = food;
    }
}
