package genealogy;

public interface TreeComponent {
    void display();
}

// TreeItem.java
package genealogy;

public interface TreeItem extends TreeComponent {
    String getName();
}
