
public class Node {
    private String value;
    private Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(Node node) {
        this.next = node;
    }
}