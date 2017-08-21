package es.commerce.util;

/**
 * Node Implementation for a Double Linked list
 *
 * Created by Jose Garcia
 */
public class Node implements INode {

    private final Object data;

    private INode prev = null;
    private INode next = null;

    public Node(final Object data) {
        this.data = data;
    }

    public Node(final Object data, final INode prev, final INode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public INode getPrev() {
        return prev;
    }

    @Override
    public void setPrev(INode prev) {
        this.prev = prev;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Node node = (Node) o;
        return data.equals(node.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
