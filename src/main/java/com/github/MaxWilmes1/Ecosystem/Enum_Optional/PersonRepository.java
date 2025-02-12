package com.github.MaxWilmes1.Ecosystem.Enum_Optional;

import java.util.*;

public class PersonRepository {
    Map<String, Person> persons;


    public PersonRepository() {
        this.persons = new HashMap<>();
    }

    public Map<String, Person> getPersons() {
        return persons;
    }

    public Optional<Person> getPersonById(String id){
        return Optional.ofNullable(persons.get(id));
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "persons=" + persons +
                '}';
    }

    public Map<Gender, Integer> countPersonsByGender() {
        List<Person> personsList = new ArrayList<>(persons.values());
        Integer maleCount = 0;
        Integer femaleCount = 0;
        Integer diverseCount = 0;

        for (Person person : personsList) {
             if ( person.gender() == Gender.MALE ){
                 maleCount++;
            } else if (person.gender() == Gender.FEMALE) {
                femaleCount++;
             } else {
                 diverseCount++;
             }
        }
        Map<Gender, Integer> result = new HashMap<>();
        result.put(Gender.MALE, maleCount);
        result.put(Gender.FEMALE, femaleCount);
        result.put(Gender.DIVERSE, diverseCount);
        System.out.println(result);
        return result;
    }
}
