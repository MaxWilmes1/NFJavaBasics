package com.github.MaxWilmes1.ObjectOrientation.HashsetAndHashmap;

// Hashsets sind unorganisiert und ihre Werte haben keine Reihenfolge. Werte werden NICHT doppelt gespeichert!
// Hashmaps haben, wie ein Telefonbuch organisierte Schlüssel und dahinter Werte

import java.util.HashMap;
import java.util.HashSet;

public class WithClassAnimal {

    public static void main(String[] args) {


        System.out.println("------Hashset--------");

        Animal cat = new Animal("mauzi", 5);
        Animal dog = new Animal("Tarzan", 8);
        Animal dog2 = new Animal("Tarzan", 7); //Dieses object wird durch die in der Animal class definierte equal methode rausgefiltert, da der Name des Hundes gleich ist
        Animal bird = new Animal("Tweety", 21);

        HashSet<Animal> animalsFed = new HashSet<>();

        animalsFed.add(dog);
        animalsFed.add(cat);
        animalsFed.add(bird);
        animalsFed.add(dog2); //Diese Hashset add methode wird durch die in der Animal class definierten equal methode rausgefiltert, da der Name des Hundes gleich ist
        animalsFed.add(dog);
        animalsFed.add(bird);
        animalsFed.add(dog);


        for (Animal animal : animalsFed){
            System.out.println("I fed "+animal+" today");
        }


        System.out.println("------Hashmap---------");

        HashMap<Animal, String> favoriteFood = new HashMap<>();
        favoriteFood.put(dog, "dogfood");
        favoriteFood.put(cat, "fish");
        favoriteFood.put(bird, "seeds");

        for (Animal animal : animalsFed){
            System.out.println("Favorite food of "+animal+" is "+favoriteFood.get(animal));
        }
    }
}
