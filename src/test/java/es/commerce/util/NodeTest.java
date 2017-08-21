package es.commerce.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class NodeTest {

    @Test
    public void testEquals(){
        final INode nodeA = new Node(Integer.valueOf(5));
        final INode nodeB = new Node(Integer.valueOf(5));

        assertEquals(nodeA, nodeB);
        assertTrue(nodeA.equals(nodeB));
    }

    @Test
    public void testHashCode() {
        final INode nodeA = new Node(Integer.valueOf(5));
        final INode nodeB = new Node(Integer.valueOf(5));
        final INode nodeC = new Node(Integer.valueOf(6));

        assertEquals(nodeA.hashCode(), nodeB.hashCode());
        assertNotEquals(nodeA.hashCode(), nodeC.hashCode());
    }

    @Test
    public void testNext() {
        final INode nodeA = new Node(Integer.valueOf(5));
        final INode nodeB = new Node(Integer.valueOf(7));
        nodeA.setNext(nodeB);
        final INode nodeC = new Node(Integer.valueOf(9));

        assertEquals(nodeB, nodeA.getNext());
        assertNotEquals(nodeC, nodeA.getNext());
    }

    @Test
    public void testPrev() {
        final INode nodeA = new Node(Integer.valueOf(5));
        final INode nodeB = new Node(Integer.valueOf(7));
        nodeA.setPrev(nodeB);
        final INode nodeC = new Node(Integer.valueOf(9));

        assertEquals(nodeB, nodeA.getPrev());
        assertNotEquals(nodeC, nodeA.getPrev());
    }

    @Test
    public void testGetData() {
        final INode nodeA = new Node("Test String");

        assertEquals("Test String", nodeA.getData());
    }
}
