import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO implements Serializable {
    private static final long serialVersionUID = 1L;

    public void writeToFile(String filename, FamilyTree familyTree) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(familyTree);
            System.out.println("Data has been written to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public FamilyTree readFromFile(String filename) {
        FamilyTree familyTree = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            familyTree = (FamilyTree) ois.readObject();
            System.out.println("Data has been read from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return familyTree;
    }
}
