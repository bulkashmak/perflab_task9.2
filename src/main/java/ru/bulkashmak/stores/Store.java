package ru.bulkashmak.stores;


import ru.bulkashmak.Box;
import ru.bulkashmak.food.Fruit;
import ru.bulkashmak.food.GreenFood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Store {

    public StoreBrand brand;
    public int id = 0;
    public List<Box<GreenFood>> localStorage;
    public HashMap<String, Integer> storageStatistics;

    public Store(StoreBrand brand) {
        this.brand = brand;
        this.id = (int) (Math.random() * 1000000);
        this.localStorage = new ArrayList<>();
        this.storageStatistics = new HashMap<>();
    }

    public List<Box<GreenFood>> getLocalStorage() {
        return localStorage;
    }

    public List<Box<GreenFood>> sortByPrice() {

        return localStorage.stream()
                .sorted( (o1, o2) -> (int) Math.round(o1.getFood().getPrice() - o2.getFood().getPrice()) )
                .collect(Collectors.toList());
    }

    public List<Box<GreenFood>> sortByMassDesc() {

        return localStorage.stream()
                .sorted( (o1, o2) -> (int) Math.round(o2.getFood().getMass() - o1.getFood().getMass()) )
                .collect(Collectors.toList());
    }

    public int calcTotalPrice() {

        return localStorage.stream()
                .mapToInt( p -> (int) (p.getFood().getPrice()))
                .sum();
    }

    public int calcAllFruitsUnder50() {

        return localStorage.stream()
                .filter( p -> p.getFood().getClass().equals(Fruit.class))
                .filter( p -> p.getFood().getPrice() < 50 )
                .mapToInt( p -> (int) (p.getFood().getPrice()))
                .sum();
    }

    @Override
    public String toString() {
        return id + "|" + brand;
    }
}
