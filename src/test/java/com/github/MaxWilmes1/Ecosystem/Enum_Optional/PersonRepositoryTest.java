package com.github.MaxWilmes1.Ecosystem.Enum_Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {

    private PersonRepository zuhause;

    @BeforeEach
    void setup(){
        Person p1 = new Person("100", "max", DaysOfWeek.FRIDAY, Gender.MALE);
        Person p2 = new Person("101", "linda", DaysOfWeek.SATURDAY, Gender.FEMALE);
        Person p3 = new Person("102", "Diversity", DaysOfWeek.MONDAY, Gender.DIVERSE);
        zuhause = new PersonRepository();
        zuhause.persons.put("max", p1);
        zuhause.persons.put("linda", p2);
        zuhause.persons.put("Diversity", p3);
    }

    @Test
    void getPersons() {
        System.out.println(zuhause);
        System.out.println(zuhause.getPersons());
    }

    @Test
    void getPersonById() {
        System.out.println(zuhause.getPersonById("max"));
        Optional<Person> personOptional = zuhause.getPersonById("max");
        if (personOptional.isPresent()) {
            System.out.println("Name: "+personOptional.get().name()+", Favorite Weekday: "+personOptional.get().favoriteDay());
        } else {
            System.out.println("Person not found");
        }
    }

    @Test
    void countPersonsByGender(){
        //WHEN
        Map<Gender, Integer> actual = zuhause.countPersonsByGender();
        //THEN
        int expectedMale = 1;
        int expectedFemale = 1;
        int expectedDiverse = 1;
        assertEquals(expectedFemale,actual.get(Gender.FEMALE));
        assertEquals(expectedMale,actual.get(Gender.MALE));
        assertEquals(expectedDiverse,actual.get(Gender.DIVERSE));
    }

    @Test
    void getPersonByName(){
        //WHEN
        Optional<Person> actual = zuhause.getPersonByName("max");
        //THEN
        Optional<Person> expected = Optional.of( new Person("100", "max", DaysOfWeek.FRIDAY, Gender.MALE));
        assertEquals(expected,actual);
    }

    @Test
    void getPersonsByWeekday(){
        //WHEN
        List<Person> actual = zuhause.getPersonsByWeekday(DaysOfWeek.MONDAY);
        //THEN
        Person expectedPerson = new Person("102", "Diversity", DaysOfWeek.MONDAY, Gender.DIVERSE);
        List<Person> expected = new ArrayList<>(List.of(expectedPerson));
        assertEquals(expected, actual);
    }
}