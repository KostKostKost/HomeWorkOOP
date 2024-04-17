package genealogy.utils;

import java.util.Comparator;
import java.util.List;

public class TreeSorter<T> {
    public void sortByBirthDate(List<T> items, Comparator<T> birthDateComparator) {
        items.sort(birthDateComparator);
    }

    public void sortByName(List<T> items, Comparator<T> nameComparator) {
        items.sort(nameComparator);
    }
}
