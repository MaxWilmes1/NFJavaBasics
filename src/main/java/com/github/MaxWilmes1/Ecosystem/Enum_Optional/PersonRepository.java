package com.github.MaxWilmes1.Ecosystem.Enum_Optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
}
