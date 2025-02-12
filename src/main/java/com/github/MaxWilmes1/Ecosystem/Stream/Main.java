package com.github.MaxWilmes1.Ecosystem.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Linda");
        names.add("Silvia");

        for (String name : names) {
            if (name.length() >= 3) {
                System.out.println(name);
            }
        }

        names.stream().forEach(name -> System.out.println(name));
        names.forEach(System.out::println);

        List<String > newNames = names.stream()
                .filter(name -> name.length() >= 3)
                .filter(name -> name.length() < 6)
                .collect(Collectors.toList());

        System.out.println(newNames);

        List<Integer> nameLenght = names.stream()
                .filter(name -> name.length() >= 3)
                .filter(name -> name.length() < 6)
                .map(name -> name.length())
                .collect(Collectors.toList());

        System.out.println(nameLenght);

        Stream.of("Anton", "Berta", "Cäsar").peek(name -> System.out.println(name));

    }
}
