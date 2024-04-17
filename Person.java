package genealogy.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private List<Person> children;
    private Person father;
    private Person mother;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
        if (child.getFather() == null) {
            child.setFather(this);
        } else if (child.getMother() == null) {
            child.setMother(this);
        }
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }
}
