package com.github.MaxWilmes1.Ecosystem.Stream.Challange;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,16,3,4,42,6,7,56,9,10,11,12,105,14,15,31,17,18,19,20));

        numbers.stream()
                .filter(number -> number%2 == 0)
                .forEach(System.out::println);

        List<Integer> doubledNumbers = numbers.stream()
                .map(number -> number*2)
                .collect(Collectors.toList());

        System.out.println("Doubled Numbers: "+doubledNumbers);

        List<Integer> reversedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("reversedNumbers: "+reversedNumbers);

        List<Integer> ascendingOrder = numbers.stream()
                .sorted()
                .toList();

        System.out.println("ascendingOrder: "+ascendingOrder);

        List<Integer> descendingOrder = numbers.stream()
                .sorted((a, b) -> {
                    System.out.println("Vergleiche: " + a + " und " + b);
                    return b - a;
                })
                .toList();

        System.out.println("descendingOrder: "+descendingOrder);

        Optional<Integer> sum = numbers.stream()
                .reduce((a,b) -> a + b);

        System.out.println(sum);
        sum.ifPresent(System.out::println);
    }
}
