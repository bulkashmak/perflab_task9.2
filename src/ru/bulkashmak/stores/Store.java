package ru.bulkashmak.stores;


import ru.bulkashmak.Box;
import ru.bulkashmak.food.GreenFood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Store {

    public StoreBrand brand;
    public int id;
    public List<Box<GreenFood>> localStorage;
    public HashMap<String, Integer> storageStatistics;

    public Store(StoreBrand brand) {
        this.brand = brand;
        this.id = (int)(Math.random() * 100000);
        this.localStorage = new ArrayList<>();
        this.storageStatistics = new HashMap<>();
    }

}
