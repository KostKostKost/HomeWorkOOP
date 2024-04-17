package genealogy.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T> implements Iterable<T> {
    private List<T> familyMembers;

    public FamilyTree() {
        this.familyMembers = new ArrayList<>();
    }

    public void addMember(T member) {
        familyMembers.add(member);
    }

    public List<T> getChildren(T person) {
        List<T> children = new ArrayList<>();
        // Логика получения детей
        return children;
    }

    public List<T> getSiblings(T person) {
        List<T> siblings = new ArrayList<>();
        // Логика получения родственников
        return siblings;
    }

    // Другие методы работы с деревом

    @Override
    public Iterator<T> iterator() {
        return familyMembers.iterator();
    }
}
