package com.github.MaxWilmes1.Ecosystem.Enum_Optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {

    @Test
    void getPersons() {
        Person p1 = new Person("100", "max", DaysOfWeek.FRIDAY);
        Person p2 = new Person("101", "linda", DaysOfWeek.SATURDAY);
        PersonRepository zuhause = new PersonRepository();
        zuhause.persons.put("max", p1);
        zuhause.persons.put("linda", p2);

        System.out.println(zuhause.getPersons());

    }

    @Test
    void getPersonById() {
        Person p1 = new Person("100", "max", DaysOfWeek.FRIDAY);
        Person p2 = new Person("101", "linda", DaysOfWeek.SATURDAY);
        PersonRepository zuhause = new PersonRepository();
        zuhause.persons.put("max", p1);
        zuhause.persons.put("linda", p2);

        System.out.println(zuhause.getPersonById("max"));
        Optional<Person> personOptional = zuhause.getPersonById("max");

        if (personOptional.isPresent()) {
            System.out.println("Name: "+personOptional.get().name()+", Favorite Weekday: "+personOptional.get().favoriteDay());
        } else {
            System.out.println("Person not found");
        }
    }
}