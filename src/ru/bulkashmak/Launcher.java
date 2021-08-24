package ru.bulkashmak;


import ru.bulkashmak.stores.Store;
import ru.bulkashmak.stores.StoreDatabase;

import java.util.Iterator;

public class Launcher {
    public static void main(String[] args) {

        GreenFoodBase base = new GreenFoodBase();

        StoreDatabase.generateStores();

        base.initializeStartingSupplies();

        Iterator<Store> storeIterator = StoreDatabase.allStores.iterator();

        while(storeIterator.hasNext()) {
            System.out.println(storeIterator.next().getLocalStorage());
        }

    }
}