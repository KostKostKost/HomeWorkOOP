package genealogy;

import genealogy.model.Person;
import genealogy.model.FamilyTree;

import java.time.LocalDate;
import java.util.Scanner;

public class TreeManager {
    private FamilyTree familyTree;

    public TreeManager() {
        this.familyTree = new FamilyTree();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add person");
            System.out.println("2. Remove person");
            System.out.println("3. Search person");
            System.out.println("4. Display tree");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    addPerson(scanner);
                    break;
                case 2:
                    removePerson(scanner);
                    break;
                case 3:
                    searchPerson(scanner);
                    break;
                case 4:
                    displayTree();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }

    private void addPerson(Scanner scanner) {
        System.out.print("Enter person's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter person's birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // consume newline
        Person person = new Person(name, LocalDate.of(birthYear, 1, 1));
        familyTree.addMember(person);
        System.out.println("Person added successfully!");
    }

    private void removePerson(Scanner scanner) {
        // Implement removal logic
    }

    private void searchPerson(Scanner scanner) {
        // Implement search logic
    }

    private void displayTree() {
        familyTree.display();
    }

    public static void main(String[] args) {
        TreeManager treeManager = new TreeManager();
        treeManager.run();
    }
}

