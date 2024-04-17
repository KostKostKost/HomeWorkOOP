package genealogy.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyTree {
    private Map<Person, List<FamilyMember>> familyTree;

    public FamilyTree() {
        this.familyTree = new HashMap<>();
    }

    public void addMember(Person person) {
        familyTree.put(person, new ArrayList<>());
    }

    public void addRelation(Person person, Person relative, Relation relation) {
        if (!familyTree.containsKey(person)) {
            addMember(person);
        }
        if (!familyTree.containsKey(relative)) {
            addMember(relative);
        }
        familyTree.get(person).add(new FamilyMember(relative, relation));
    }

    public List<FamilyMember> getRelations(Person person) {
        return familyTree.getOrDefault(person, new ArrayList<>());
    }

}
