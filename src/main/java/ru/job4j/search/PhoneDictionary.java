package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person: persons) {
            boolean isName = person.getName().contains(key);
            boolean isSurname = person.getSurname().contains(key);
            boolean isPhone = person.getPhone().contains(key);
            boolean isAddress = person.getAddress().contains(key);
            if(isName || isSurname || isPhone || isAddress) {
                result.add(person);
            }
        }
        return result;
    }
}
