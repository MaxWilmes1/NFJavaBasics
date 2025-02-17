package com.github.MaxWilmes1.Ecosystem.DateAndTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Animal {
    private String name;
    private LocalDate birthday;


    public long daysUntilNextBirthday() {
        LocalDate today = LocalDate.now();
        // Set next birthday to this year
        LocalDate nextBirthday = birthday.withYear(today.getYear());

        // If the birthday has already passed this year, set next birthday to next year
        if (nextBirthday.isBefore(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        // Return the number of days between today and the next birthday
        return ChronoUnit.DAYS.between(today, nextBirthday);
    }
}
