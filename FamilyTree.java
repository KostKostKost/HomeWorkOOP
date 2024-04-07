import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Person> familyMembers;

    public FamilyTree() {
        this.familyMembers = new ArrayList<>();
    }

    public void addMember(Person person) {
        familyMembers.add(person);
    }

    public List<Person> getChildren(Person person) {
        List<Person> children = new ArrayList<>();
        for (Person member : familyMembers) {
            if ((member.getFather() == person || member.getMother() == person) && member.getBirthDate() != null) {
                children.add(member);
            }
        }
        return children;
    }

    public List<Person> getSiblings(Person person) {
        List<Person> siblings = new ArrayList<>();
        for (Person member : familyMembers) {
            if ((member.getFather() == person.getFather() || member.getMother() == person.getMother())
                    && !member.equals(person)) {
                siblings.add(member);
            }
        }
        return siblings;
    }

}
