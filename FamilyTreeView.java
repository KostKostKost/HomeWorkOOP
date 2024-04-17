package genealogy.view;

import genealogy.model.Person;

import java.util.List;

public interface FamilyTreeView {
    void displayFamilyTree(List<Person> familyMembers);
    void displayErrorMessage(String errorMessage);
}
