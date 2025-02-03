package com.github.MaxWilmes1.ObjectOrientation.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {

        String bird = "Tweety";
        String dog = "Tarzan";
        String cat = "Hildegard";
        String horse = "Amadeus";


        List<String> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(dog);
        animals.add(cat);
        animals.add(horse);

        for (String animal : animals){
            System.out.println(animal);
        }
        System.out.println("----------------");

        String favoriteAnimal = animals.get(0);
        System.out.println(favoriteAnimal);

        System.out.println("---------------");

        int NumberOfAnimals = animals.size();
        System.out.println(NumberOfAnimals);




    }
}
