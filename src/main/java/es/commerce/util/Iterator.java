package es.commerce.util;

import java.util.NoSuchElementException;

/**
 * Created by kszosze on 21/08/2017.
 */
public interface Iterator {

    /**
     * Retrieve the next element in a list and move the pointer towards it or null,
     * @return the next element
     * @exception throws NoSuckElementException in case method is invoke and no more elements remain in the list
     */
    INode next() throws NoSuchElementException;

    /**
     * Retrieve the previous element in a list and move the pointer towards it or null
     * @return the previous element
     * @exception throws NoSuckElementException in case method is invoke and no more elements remain in the list
     */
    INode prev() throws NoSuchElementException;

    /**
     * Look if there is more elements forward in the list.
     * @return true if there are more elements in the list, false otherwise
     */
    Boolean hasNext();

    /**
     * Look if there is more elements previous in the list
     * @return true if there are more elements in the list, false otherwise.
     */
    Boolean hasPrev();
}
