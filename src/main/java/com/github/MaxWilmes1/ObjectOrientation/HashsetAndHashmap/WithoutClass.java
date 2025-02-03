package com.github.MaxWilmes1.ObjectOrientation.HashsetAndHashmap;

// Hashsets sind unorganisiert und ihre Werte haben keine Reihenfolge. Werte werden NICHT doppelt gespeichert!
// Hashmaps haben, wie ein Telefonbuch organisierte Schlüssel und dahinter Werte

import java.util.HashMap;
import java.util.HashSet;

public class WithoutClass {

    public static void main(String[] args) {


        System.out.println("------Hashset--------");

        String dog = "Tarzan";
        String cat = "Hildegard";
        String bird = "Tweety";

        HashSet<String> animalsFed = new HashSet<>();

        animalsFed.add(dog);
        animalsFed.add(cat);
        animalsFed.add(bird);
        animalsFed.add(dog);
        animalsFed.add(dog);
        animalsFed.add(bird);
        animalsFed.add(dog);


        for (String animal : animalsFed){
            System.out.println("I fed "+animal+" today");
        }


        System.out.println("------Hashmap---------");

       HashMap<String, String> favoriteFood = new HashMap<>();
       favoriteFood.put(dog, "dogfood");
       favoriteFood.put(cat, "fish");
       favoriteFood.put(bird, "seeds");

        for (String animal : animalsFed){
            System.out.println("Favorite food of "+animal+" is "+favoriteFood.get(animal));
        }
    }
}
