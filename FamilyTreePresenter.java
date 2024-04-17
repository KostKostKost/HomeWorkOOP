public class FamilyTreePresenter {
    
}
package genealogy.presenter;

import genealogy.model.FamilyTree;
import genealogy.model.Person;
import genealogy.view.FamilyTreeView;

import java.util.List;

public class FamilyTreePresenter {
    private FamilyTree model;
    private FamilyTreeView view;

    public FamilyTreePresenter(FamilyTree model, FamilyTreeView view) {
        this.model = model;
        this.view = view;
    }

    public void fetchDataAndDisplay() {
        List<Person> familyMembers = model.getAllFamilyMembers();
        if (familyMembers != null) {
            view.displayFamilyTree(familyMembers);
        } else {
            view.displayErrorMessage("Failed to fetch family tree data.");
        }
    }
}
