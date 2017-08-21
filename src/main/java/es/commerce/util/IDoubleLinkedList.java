package es.commerce.util;

/**
 * Created by kszosze on 21/08/2017.
 */
public interface IDoubleLinkedList {

    /**
     * Add a node at the end of a Double Linked List.
     * @param node to add in the list
     */
    void add(INode node);

    /**
     * Add a node in a double Liked List related to a reference node.
     * @param reference node to inssert Before or After it
     * @param node to insert
     * @param before flag is true if want to insert before reference, false otherwise
     */
    void add(INode reference, INode node, Boolean before);

    /**
     * Add a node in the Head of the List
     * @param node to insert in the Head
     */
    void addHead(INode node);

    /**
     * Retrieve the head of the List
     * @return a INode object with the Head.
     */
    INode getHead();

    /**
     * Add a node in the tail of the list
     * @param node to Insert at the End.
     */
    void addTail(INode node);

    /**
     * Retrieve the last INode of the List
     * @return a INode object with the Tail
     */
    INode getTail();

    /**
     * Delete a node of the list if exist
     * @param node to delete
     */
    void delete(INode node);

    /**
     * Retrieve an Iterator of the list
     * @return an iterator to goes through the list
     */
    Iterator getIterator();

    /**
     * Check if the list is Empty
     * @return a Boolean True if the list if Empty and False otherwise
     */
    Boolean isEmpty();

    /**
     * Retrieves the size of the list
     * @return a integer value with the number of nodes in the list
     */
    int size();

    /**
     * Indicates if a node if store in the List. Use the Node equals method to determinate if two nodes are equals or not
     * @param node to look for
     * @return a Boolean value True if the Node is in the list.
     */
    Boolean contains(INode node);
}
