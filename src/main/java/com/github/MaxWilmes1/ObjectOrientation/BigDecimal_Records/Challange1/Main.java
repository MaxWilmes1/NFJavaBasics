package com.github.MaxWilmes1.ObjectOrientation.BigDecimal_Records.Challange1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Species pudel = new Species("Pudel", 300);
        Species schimmel = new Species("Schimmel", 10000);
        Species papagei = new Species("Papagei", 30);

        Owner max = new Owner("Max", 30, "Düsseldorf");

        Animal dog = new Animal(001, "Tarzan", 7, max, pudel);
        Animal horse = new Animal(002, "Amadeus", 21, max, schimmel);
        Animal bird = new Animal(003, "Mogli", 30, max, papagei);

        System.out.println(dog);
        System.out.println(horse);
        System.out.println(bird);

        System.out.println(dog.equals(horse));

        System.out.println("-------Zoo--------");
        List<Animal> zoo = new ArrayList<>();
        zoo.add(dog);
        zoo.add(horse);
        zoo.add(bird);

        Zoo maxZoo = new Zoo(zoo);
        System.out.println(maxZoo.calculateFoodRequirement());
    }
}
