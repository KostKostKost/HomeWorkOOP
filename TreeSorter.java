package genealogy.utils;

import genealogy.model.Person;

import java.util.Comparator;
import java.util.List;

public class TreeSorter {
    public static void sortByBirthDate(List<Person> people) {
        people.sort(Comparator.comparing(Person::getBirthDate));
    }

    public static void sortByName(List<Person> people) {
        people.sort(Comparator.comparing(Person::getName));
    }
}
