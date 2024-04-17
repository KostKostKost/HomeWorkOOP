package genealogy;

import java.util.Scanner;

public class TreeManager<T> {
    private FamilyTree<T> familyTree;

    public TreeManager(FamilyTree<T> familyTree) {
        this.familyTree = familyTree;
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
        // Implement add person logic
    }

    private void removePerson(Scanner scanner) {
        // Implement remove person logic
    }

    private void searchPerson(Scanner scanner) {
        // Implement search person logic
    }

    private void displayTree() {
        // Implement display tree logic
    }

    public static void main(String[] args) {
        FamilyTree<Person> personFamilyTree = new FamilyTree<>();
        TreeManager<Person> personTreeManager = new TreeManager<>(personFamilyTree);
        personTreeManager.run();
    }
}
