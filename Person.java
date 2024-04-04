package genealogy;

public class Person {
    private String name;
    private int birthYear;
    private Person father;
    private Person mother;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
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

public class FamilyTree {
    private Person rootPerson;

    public FamilyTree(Person rootPerson) {
        this.rootPerson = rootPerson;
    }

    public Person getRootPerson() {
        return rootPerson;
    }

    // Пример метода для получения всех детей определенного человека
    public List<Person> getChildren(Person person) {
        List<Person> children = new ArrayList<>();
        if (person != null) {
            if (person.getFather() != null) {
                children.add(person.getFather());
            }
            if (person.getMother() != null) {
                children.add(person.getMother());
            }
        }
        return children;
    }
}

public class GenealogyResearchApp {
    public static void main(String[] args) {
        // Создаем несколько объектов Person
        Person grandfather = new Person("John", 1930);
        Person grandmother = new Person("Mary", 1932);
        Person father = new Person("Michael", 1955);
        Person mother = new Person("Sarah", 1960);
        Person child1 = new Person("Alice", 1985);
        Person child2 = new Person("Bob", 1988);

        // Устанавливаем связи между родственниками
        father.setFather(grandfather);
        father.setMother(grandmother);
        mother.setFather(new Person("Tom", 1958)); // Пример для неполноты данных
        mother.setMother(new Person("Jane", 1962)); // Пример для неполноты данных
        child1.setFather(father);
        child1.setMother(mother);
        child2.setFather(father);
        child2.setMother(mother);

        // Создаем генеалогическое дерево с корневым узлом father
        FamilyTree familyTree = new FamilyTree(father);

        // Получаем всех детей father
        List<Person> fatherChildren = familyTree.getChildren(father);
        System.out.println("Children of father:");
        for (Person child : fatherChildren) {
            System.out.println(child.getName());
        }
    }
}