package es.commerce.util;

/**
 * Created by kszosze on 21/08/2017.
 */
public interface INode {


    Object getData();

    INode getPrev();

    void setPrev(INode prev);

    INode getNext();

    void setNext(INode next);
}
