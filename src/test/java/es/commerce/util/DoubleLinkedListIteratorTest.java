package es.commerce.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class DoubleLinkedListIteratorTest {

    private IDoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    private static final INode nodeA = new Node(Integer.valueOf(5));
    private static final INode nodeB = new Node(Integer.valueOf(7));
    private static final INode nodeC = new Node(Integer.valueOf(9));

    private static Iterator bllIterator;

    @Before
    public void setup() {
        doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(nodeA);
        doubleLinkedList.add(nodeB);
        doubleLinkedList.add(nodeC);

        bllIterator = doubleLinkedList.getIterator();
    }

    @Test
    public void testNext() {

        assertEquals(nodeA, bllIterator.next());
        assertEquals(nodeB, bllIterator.next());
        assertEquals(nodeC, bllIterator.next());
    }

    @Test
    public void testPrev() {
        assertEquals(nodeA, bllIterator.next());
        assertEquals(nodeB, bllIterator.next());
        assertEquals(nodeB, bllIterator.prev());
    }

    @Test
    public void testHasNext() {
        assertEquals(nodeA, bllIterator.next());
        assertTrue(bllIterator.hasNext());
        assertEquals(nodeB, bllIterator.next());
        assertFalse(bllIterator.hasNext());
        assertEquals(nodeC, bllIterator.next());
    }

    @Test
    public void testHasPrev() {
        assertEquals(nodeA, bllIterator.next());
        assertTrue(bllIterator.hasNext());
        assertEquals(nodeB, bllIterator.next());
        assertFalse(bllIterator.hasNext());
        assertTrue(bllIterator.hasPrev());
        assertEquals(nodeB, bllIterator.prev());
        assertTrue(bllIterator.hasPrev());
        assertEquals(nodeA, bllIterator.prev());
        assertFalse(bllIterator.hasPrev());
    }
}
