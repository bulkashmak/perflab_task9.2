package ru.bulkashmak;


import ru.bulkashmak.food.*;
import ru.bulkashmak.stores.Store;
import ru.bulkashmak.stores.StoreDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GreenFoodBase {

    List<Box<GreenFood>> baseStorage;

    public void initializeStartingSupplies(){

        generateGreenFoods().stream().map((g)->{
            Random random = new Random();
            Store randomStore = StoreDatabase.allStores.get(random.nextInt(StoreDatabase.allStores.size()));
            Box box = new Box(randomStore.id, randomStore.brand, g);
            return box;
        });
    }

    public List<GreenFood> generateGreenFoods(){
        List<GreenFood> generatedFood = new ArrayList<>();

        Random random = new Random();
        int greenFoodsCount = random.nextInt(30) + 30;

        for(int i=0; i<greenFoodsCount; i++) {
            int greenFoodChoice = random.nextInt(4);
            double price = random.nextDouble() * 30 + 10;
            double mass = random.nextDouble() * 5 + 20;

            GreenFood greenFood;
            switch (greenFoodChoice) {
                case 0:
                    greenFood = new Apple(price, mass);
                    break;
                case 1:
                    greenFood = new Banana(price, mass);
                    break;
                case 2:
                    greenFood = new Cucumber(price, mass);
                    break;
                case 3:
                default:
                    greenFood = new Tomato(price, mass);
                    break;
            }
            generatedFood.add(greenFood);
        }

        return generatedFood;
    }
}
