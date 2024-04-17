// TreeComponent.java
package genealogy;

public interface TreeComponent<T> {
    void display();
}

// TreeItem.java
package genealogy;

public interface TreeItem<T> extends TreeComponent<T> {
    String getName();
}
