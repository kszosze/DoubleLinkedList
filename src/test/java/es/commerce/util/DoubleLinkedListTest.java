package es.commerce.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleLinkedListTest {

    private IDoubleLinkedList doubleLinkedList;
    private final INode nodeA = new Node(Integer.valueOf(5));
    private final INode nodeB = new Node(Integer.valueOf(7));
    private final INode nodeC = new Node(Integer.valueOf(9));

    @Test
    public void testConstructWithNode() {
        doubleLinkedList = new DoubleLinkedList(nodeA);

        assertEquals(1, doubleLinkedList.size());
    }

    @Test
    public void testAddNode()
    {
        doubleLinkedList = new DoubleLinkedList();

        assertEquals(0, doubleLinkedList.size());

        doubleLinkedList.add(nodeA);
        assertEquals(1, doubleLinkedList.size());

        doubleLinkedList.add(nodeB);
        assertEquals(2, doubleLinkedList.size());

        doubleLinkedList.add(nodeC);
        assertEquals(3, doubleLinkedList.size());
    }

    @Test
    public void testAddNodeBefore() {

        doubleLinkedList = new DoubleLinkedList(nodeA);

        assertEquals(nodeA, doubleLinkedList.getHead());

        doubleLinkedList.add(nodeA, nodeB, Boolean.TRUE);

        assertEquals(nodeB, doubleLinkedList.getHead());
    }

    @Test
    public void testAddNodeBetween2Nodes() {

        doubleLinkedList = new DoubleLinkedList(nodeA);

        assertEquals(nodeA, doubleLinkedList.getHead());

        doubleLinkedList.add(nodeA, nodeB, Boolean.TRUE);

        assertEquals(nodeB, doubleLinkedList.getHead());

        doubleLinkedList.add(nodeA, nodeC, Boolean.TRUE);

        assertEquals(nodeB, doubleLinkedList.getHead());
        assertEquals(nodeC, doubleLinkedList.getHead().getNext());
        assertEquals(nodeA, doubleLinkedList.getHead().getNext().getNext());
    }

    @Test
    public void testAddNodeAfter() {

        doubleLinkedList = new DoubleLinkedList(nodeA);

        assertEquals(nodeA, doubleLinkedList.getHead());

        doubleLinkedList.add(nodeA, nodeB, Boolean.FALSE);

        assertEquals(nodeA, doubleLinkedList.getHead());

        doubleLinkedList.add(nodeA, nodeC, Boolean.FALSE);

        assertEquals(nodeA, doubleLinkedList.getHead());
        assertEquals(nodeC, doubleLinkedList.getHead().getNext());
        assertEquals(nodeB, doubleLinkedList.getHead().getNext().getNext());
    }

    @Test
    public void testAddHead() {
        doubleLinkedList = new DoubleLinkedList(nodeA);

        assertEquals(nodeA, doubleLinkedList.getHead());

        doubleLinkedList.addHead(nodeB);

        assertEquals(nodeB, doubleLinkedList.getHead());
    }

    @Test
    public void testAddTail() {
        doubleLinkedList = new DoubleLinkedList(nodeB);

        assertEquals(nodeB, doubleLinkedList.getHead());

        doubleLinkedList.addTail(nodeA);
        assertEquals(nodeA, doubleLinkedList.getTail());
    }

    @Test
    public void testDelete() {
        doubleLinkedList = new DoubleLinkedList(nodeA);

        assertEquals(nodeA, doubleLinkedList.getHead());

        doubleLinkedList.addTail(nodeB);
        assertEquals(nodeB, doubleLinkedList.getTail());

        doubleLinkedList.addTail(nodeC);
        assertEquals(nodeC, doubleLinkedList.getTail());

        final INode nodeE = new Node(Integer.valueOf(11));
        final INode nodeF = new Node(Integer.valueOf(13));
        final INode nodeG = new Node(Integer.valueOf(15));
        doubleLinkedList.add(nodeB, nodeE, Boolean.TRUE);
        doubleLinkedList.add(nodeB, nodeF, Boolean.FALSE);
        doubleLinkedList.addTail(nodeG);

        doubleLinkedList.delete(nodeA);

        assertEquals(nodeE, doubleLinkedList.getHead());

        assertEquals(nodeB, doubleLinkedList.getHead().getNext());
    }

    @Test
    public void testGetIterator() {
        doubleLinkedList = new DoubleLinkedList(nodeA);

        assertNotNull(doubleLinkedList.getIterator());
    }

    @Test
    public void testIsEmpty() {
        doubleLinkedList = new DoubleLinkedList();

        assertTrue(doubleLinkedList.isEmpty());

        doubleLinkedList.add(nodeA);

        assertFalse(doubleLinkedList.isEmpty());
    }

    @Test
    public void testContains(){
        doubleLinkedList = new DoubleLinkedList(nodeA);
        doubleLinkedList.add(nodeB);
        doubleLinkedList.add(nodeC);

        final INode nodeE = new Node("No Exists");

        assertTrue(doubleLinkedList.contains(nodeB));
        assertTrue(doubleLinkedList.contains(nodeC));
        assertTrue(doubleLinkedList.contains(nodeA));

        assertFalse(doubleLinkedList.contains(nodeE));
    }
}

