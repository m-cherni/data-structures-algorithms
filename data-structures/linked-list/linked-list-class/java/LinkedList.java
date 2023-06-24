/**
 * LinkedList is a class that represents a singly linked list data structure.
 * It allows insertion of nodes at specific positions, searching for nodes, and
 * deletion of nodes.
 */
public class LinkedList {
    private Node head;
    private int size;

    /**
     * Constructs an empty LinkedList with a null head and size 0.
     */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Returns the size of the LinkedList.
     *
     * @return The size of the LinkedList.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Inserts a new node with the specified value at the given index.
     * Throws an IndexOutOfBoundsException if the index is out of range.
     *
     * @param value The value to be inserted.
     * @param index The index at which the value should be inserted.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public void insertData(String value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        // Insert at the beginning
        if (index == 0) {
            Node node = new Node(value, this.head);
            this.head = node;
            this.size += 1;
            return;
        }

        // Insert at a specific index
        Node node = new Node(value, null);
        Node iterNode = this.head;
        int i = 0;
        while (i < index - 1) {
            iterNode = iterNode.getNext();
            i++;
        }
        // Insert at the end
        if (index == this.getSize()) {
            iterNode.setNext(node);
            this.size += 1;
            return;
        }
        // Insert in the middle
        node.setNext(iterNode.getNext());
        iterNode.setNext(node);
        this.size += 1;
    }

    /**
     * Searches for a node with the specified value in the LinkedList.
     *
     * @param value The value to search for.
     * @return true if the value is found, false otherwise.
     */
    public boolean find(String value) {
        int i = 0;
        Node iterNode = this.head;
        while (i < this.getSize()) {
            if (iterNode.getValue().equals(value))
                return true;
            i++;
            iterNode = iterNode.getNext();
        }
        return false;
    }

    /**
     * Deletes the node at the given index.
     * Throws an IndexOutOfBoundsException if the index is out of range.
     *
     * @param index The index of the node to delete.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    public void deleteData(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        int i = 0;
        Node iterNode = this.head;
        while (i < index - 1) {
            iterNode = iterNode.getNext();
            i++;
        }
        if (index == this.getSize()) {
            iterNode.setNext(null);
            this.size -= 1;
            return;
        }
        iterNode.setNext(iterNode.getNext().getNext());
        this.size -= 1;
    }
}
