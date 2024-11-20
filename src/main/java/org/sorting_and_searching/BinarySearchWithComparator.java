package org.sorting_and_searching;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchWithComparator {

    public static void main(String[] args) {
        List<Person> people = getPeople();

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

        List<Person> people1 = getPeople();
        // Сортировка списка по возрасту
        Collections.sort(people1, new AgeComparator());
        Person searchAge = new Person("", 30);  // Имя не имеет значения для сравнения по возрасту
        int index1 = Collections.binarySearch(people1, searchAge, new AgeComparator());
        if (index1 >= 0) {
            System.out.println("Person found at index: " + index1);
            System.out.println("Found person: " + people1.get(index1).getName());
        } else {
            System.out.println("Person not found");
        }
    }

    private static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Bob", 25));
        people.add(new Person("John", 55));
        people.add(new Person("Michael", 70));

        return people;
    }
}