package genealogy;

public interface TreeComponent<T> {
    void display();
}

package genealogy;

public interface TreeItem<T> extends TreeComponent<T> {
    String getName();
}
