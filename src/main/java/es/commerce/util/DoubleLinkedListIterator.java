package es.commerce.util;

import java.util.NoSuchElementException;

/**
 * Created by kszosze on 21/08/2017.
 */
public class DoubleLinkedListIterator implements Iterator {

    private final INode head;
    private final INode tail;
    private INode pointer;

    public DoubleLinkedListIterator(final INode head, final INode tail) {
        this.head = head;
        this.tail = tail;
        pointer = head;
    }

    @Override
    public INode next() throws NoSuchElementException {
        if (pointer == null) {
            throw new NoSuchElementException("No more elements");
        }
        final INode temp = pointer;
        pointer = pointer.getNext();
        return temp;
    }

    @Override
    public INode prev() throws NoSuchElementException {
        if (pointer == null) {
            throw new NoSuchElementException("No more elements");
        }
        pointer = pointer.getPrev();
        return pointer;
    }

    @Override
    public Boolean hasNext() {
        return pointer.getNext() != null;
    }

    @Override
    public Boolean hasPrev() {
        return pointer.getPrev() != null;
    }
}
