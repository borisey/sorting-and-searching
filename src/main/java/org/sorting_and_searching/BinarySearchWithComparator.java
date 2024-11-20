package org.sorting_and_searching;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchWithComparator {

    public static void main(String[] args) {
        List<Person> people = getPersons();

        // Сортировка списка по имени
        Collections.sort(people, new NameComparator());
        // Объект для поиска
        Person searchPerson = new Person("Bob", 0); // Возраст не имеет значения для сравнения по имени
        // Выполнение бинарного поиска
        int index = Collections.binarySearch(people, searchPerson, new NameComparator());
        if (index >= 0) {
            System.out.println("Person found at index: " + index);
            System.out.println("Found person: " + people.get(index).getName());
        } else {
            System.out.println("Person not found");
        }
    }

    private static List<Person> getPersons() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Bob", 25));

        return people;
    }
}