import java.util.NoSuchElementException;

/**
 * LinkedListv1 is a class that represents a singly linked list.
 * It allows insertion at the front or the back of the linked list,
 * deletion at the front or the back of the linked list,
 * searching for nodes, and getting the index of a given node.
 */
public class LinkedListv1 {

    private Node head;
    private Node tail;
    private int size;

    /**
     * Constructs an empty LinkedListv1.
     */
    public LinkedListv1() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Inserts a new node at the front of the LinkedListv1.
     *
     * @param value the value to be inserted
     */
    public void pushFront(String value) {
        Node node = new Node(value, null);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.setNext(this.head);
            this.head = node;
        }
        this.size += 1;
    }

    /**
     * Inserts a new node at the end of the LinkedListv1.
     *
     * @param value the value to be inserted
     */
    public void pushBack(String value) {
        Node node = new Node(value, null);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
        this.size += 1;
    }

    /**
     * Deletes the node at the front of the LinkedListv1.
     */
    public void deleteFront() {
        if (this.head == null)
            throw new NoSuchElementException();
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.getNext();
        }
        this.size -= 1;
    }

    /**
     * Deletes the node at the end of the LinkedListv1.
     */
    public void deleteBack() {
        if (this.head == null)
            throw new NoSuchElementException();
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            Node node = this.head;
            while (node.getNext() != this.tail) {
                node = node.getNext();
            }

            this.tail = node;
            node.setNext(null);
        }
        this.size -= 1;
    }

    /**
     * Checks if the LinkedListv1 contains a specific value.
     *
     * @param value the value to search for
     * @return true if the LinkedListv1 contains the value, false otherwise
     */
    public boolean contains(String value) {
        if (this.head == null)
            throw new NoSuchElementException();
        Node node = this.head;
        while (node != null) {
            if (node.getValue().equals(value)) {
                return true;
            }
            node = node.getNext();
        }

        return false;
        // return indexOf(value) != -1
    }

    /**
     * Returns the index of the first occurrence of a value in the LinkedListv1.
     *
     * @param value the value to search for
     * @return the index of the value if found, -1 otherwise
     */
    public int indexOf(String value) {
        if (this.head == null)
            throw new NoSuchElementException();
        Node node = this.head;
        int i = 0;
        while (node != null) {
            if (node.getValue().equals(value)) {
                return i;
            }
            node = node.getNext();
            i += 1;
        }
        return -1;
    }

    /**
     * Returns the size of the LinkedList.
     *
     * @return The size of the LinkedList.
     */
    public int getSize() {
        return this.size;
    }

}
