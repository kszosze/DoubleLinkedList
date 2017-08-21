package es.commerce.util;

/**
 * Created by kszosze on 21/08/2017.
 */
public class DoubleLinkedList implements IDoubleLinkedList {

    private INode head = null;

    private INode tail = null;

    private Integer size = 0;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public DoubleLinkedList(final INode node)
    {
        this.head = node;
        this.tail = node;
        size++;
    }

    public void add(final INode node) {
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
    }

    public void add(final INode reference, final INode node, final Boolean before) {
        if (before) {
            addBefore(reference, node);
        } else {
            addAfter(reference, node);
        }
    }

    public void addHead(final INode node) {
        addBefore(head, node);
    }
    @Override
    public INode getHead() {
        return head;
    }
    public void addTail(final INode node) {
        addAfter(tail, node);
    }

    @Override
    public INode getTail() {
        return tail;
    }
    public void delete(final INode node) {
        if (head.equals(node)) {
            head = head.getNext();
            head.setPrev(null);
            size--;
        }
        if (tail.equals(node)) {
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
        }

        if (!head.equals(node) && !tail.equals(node)) {
            head.setNext(delete(head.getNext(), node));
            size--;
        }
    }

    public Iterator getIterator() {
        return new DoubleLinkedListIterator(head, tail);
    }

    public Boolean isEmpty() {
        return head == null && tail == null;
    }

    public int size() {
        return size;
    }

    public Boolean contains(final INode node) {
        return contains(head, node);
    }

    private Boolean contains(final INode reference, final INode node) {
        if (reference == null) {
            return Boolean.FALSE;
        }
        if (reference.equals(node)) {
            return Boolean.TRUE;
        }
        return contains(reference.getNext(), node);
    }

    private INode delete(final INode reference, final INode node) {
        if (reference != null) {
            if (reference.equals(node)) {
                reference.getNext().setPrev(reference.getPrev());
                return reference.getNext();
            } else {
                reference.setNext(delete(reference.getNext(), node));
                return reference;
            }
        } else {
            return null;
        }
    }

    private void addBefore(final INode reference, final INode node) {
        if (head != reference) {
            final INode temp = reference.getPrev();
            temp.setNext(node);
            node.setPrev(temp);
        } else {
            head = node;
        }
        node.setNext(reference);
        reference.setPrev(node);
        size++;
    }

    private void addAfter(final INode reference, final INode node) {
        if (tail != reference) {
            addBefore(reference.getNext(), node);
        } else {
            reference.setNext(node);
            node.setPrev(reference);
            tail = node;
            size++;
        }
    }
}
