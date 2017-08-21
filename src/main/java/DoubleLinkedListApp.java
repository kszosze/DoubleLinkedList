import es.commerce.util.*;

public class DoubleLinkedListApp {

    private static final DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    private static final INode nodeA = new Node(Integer.valueOf(5));
    private static final INode nodeB = new Node(Integer.valueOf(7));
    private static final INode nodeC = new Node(Integer.valueOf(9));

    private static final INode nodeE = new Node(Integer.valueOf(11));
    private static final INode nodeF = new Node(Integer.valueOf(13));
    private static final INode nodeG = new Node(Integer.valueOf(15));

    public static void main(String[] args) {


        System.out.println("Initialization Double Linked List");
        System.out.println("Size = " + doubleLinkedList.size());

        System.out.println("Adding some elements ");
        System.out.println("Adding Node A = " + nodeA);
        doubleLinkedList.add(nodeA);
        System.out.println("Adding Node B = " + nodeB);
        doubleLinkedList.add(nodeB);
        System.out.println("Adding Node C = " + nodeC);
        doubleLinkedList.add(nodeC);
        System.out.println("Elements Added, new size = " + doubleLinkedList.size());

        System.out.println("Get an Iterator to print the list");
         Iterator iterator = doubleLinkedList.getIterator();

         int counter = 0;
        while (iterator.hasNext()) {
            System.out.println("Element order - " + counter++ + "; data - " + iterator.next().getData());
        }
        System.out.println("Element order - " + counter++ + "; data - " + iterator.next().getData());

        System.out.println("Adding some elements more ");
        System.out.println("Adding Node E = " + nodeE + " Before Node B = " + nodeB);
        doubleLinkedList.add(nodeB, nodeE, Boolean.TRUE);
        System.out.println("Adding Node F = " + nodeF + " After Node B = " + nodeB);
        doubleLinkedList.add(nodeB, nodeF, Boolean.FALSE);
        System.out.println("Adding Node G = " + nodeG + " at the end");
        doubleLinkedList.addTail(nodeG);
        System.out.println("Elements Added, new size = " + doubleLinkedList.size());


        System.out.println("Get an Iterator to print the list");
         iterator = doubleLinkedList.getIterator();

        counter = 0;
        while (iterator.hasNext()) {
            System.out.println("Element order - " + counter + "; data - " + iterator.next().getData());
        }
        System.out.println("Element order - " + counter++ + "; data - " + iterator.next().getData());

        System.out.println("Removing some elements");

        System.out.println("Remove Node A = " + nodeA);
        doubleLinkedList.delete(nodeA);

        System.out.println("Get an Iterator to print the list");
        iterator = doubleLinkedList.getIterator();

        counter = 0;
        while (iterator.hasNext()) {
            System.out.println("Element order - " + counter + "; data - " + iterator.next().getData());
        }
        System.out.println("Element order - " + counter++ + "; data - " + iterator.next().getData());

        System.out.println("Remove Node B = " + nodeB);
        doubleLinkedList.delete(nodeB);

        System.out.println("Get an Iterator to print the list");
        iterator = doubleLinkedList.getIterator();

        counter = 0;
        while (iterator.hasNext()) {
            System.out.println("Element order - " + counter + "; data - " + iterator.next().getData());
        }
        System.out.println("Element order - " + counter++ + "; data - " + iterator.next().getData());
    }
}
