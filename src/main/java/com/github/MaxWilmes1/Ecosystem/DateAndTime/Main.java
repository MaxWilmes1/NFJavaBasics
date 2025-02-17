package com.github.MaxWilmes1.Ecosystem.DateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        // Stepp 1 and 2
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instantPlus2Weeks = instant.plus(Duration.ofDays(14));
        System.out.println(instantPlus2Weeks);

        System.out.println("--------------------");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTimePlus2Weeks = localDateTime.plusWeeks(2);
        LocalDateTime localDateTimePlus2Weeks2 = localDateTime.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDateTimePlus2Weeks2);

        // Step 3
        if (localDateTime.isBefore(localDateTimePlus2Weeks2)) {
            System.out.println("Past");
        } else {
            System.out.println("Future");
        }

        // Step 4
        long difference = ChronoUnit.DAYS.between(localDateTime, localDateTimePlus2Weeks2);
        System.out.println(difference);

        // Bonus

        Animal mice = Animal.builder()
                .name("Jerry")
                .birthday(LocalDate.of(1994, 7, 26))
                .build();

        // manuell
        System.out.println(mice);
        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(2025, 7, 26)));

        // with method n class animal
        System.out.println(mice.daysUntilNextBirthday());
    }
}