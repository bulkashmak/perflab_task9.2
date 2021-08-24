package ru.bulkashmak;


import ru.bulkashmak.stores.StoreDatabase;

public class Launcher {
    public static void main(String[] args) {

        GreenFoodBase base = new GreenFoodBase();

        base.initializeStartingSupplies();
        base.generateGreenFoods();

        StoreDatabase.generateStores();
    }
}