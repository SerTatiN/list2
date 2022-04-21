package com.company;

import java.util.Iterator;
import java.util.function.Consumer;

public class ListIterator implements Iterator <Node>{
    private List list;
    private Node tmpNode;
    private int counter;

    public ListIterator(List list) {
        this.list = list;
        this.tmpNode = list.getHead();
        this.counter = 0;

    }

    public List getList() {
        return list;
    }

    @Override
    public boolean hasNext() {
        return this.counter < this.list.getLength();
    }

    @Override
    public Node next() {
        Node tmp = tmpNode;
        counter++;
        tmpNode = tmpNode.getNextNode();
        return tmp;
    }


}
