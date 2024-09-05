package org.example.collection;

import java.util.Collection;

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;
    private Node<E> last;

    private int size = 0;

    public MyLinkedList() {
        first = new Node<>(null, null, last);
        last = new Node<>(first, null, null);
    }

    public MyLinkedList(Collection<E> collection) {
        this();
        addAll(collection);
    }

    @Override
    public void add(E element) {
        Node<E> toAdd = new Node<>(last.prev, element, last);

        last.prev.next = toAdd;
        last.prev = toAdd;

        size++;
    }

    @Override
    public void addAll(Collection<E> collection) {
        for(E item : collection) {
            this.add(item);
        }
    }

    @Override
    public void remove(int index) {
        Node<E> target = getByIndex(index);

        target.prev.next = target.next;
        target.next.prev = target.prev;
        target.next = null;
        target.prev = null;

        size--;
    }

    @Override
    public E get(int index) {
        return getByIndex(index).item;
    }

    @Override
    public void set(int index, E element) {
        Node<E> target = getByIndex(index);

        target.item = element;
    }

    @Override
    public int size() {
        return size;
    }

    private Node<E> getByIndex(int index) {
        checkBounds(index);

        Node<E> target = first.next;
        for (int i = 0; i < index; i++) {
            target = target.next;
        }

        return target;
    }

    private void checkBounds(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    private static class Node<E> {
        E item;
        Node<E> prev;
        Node<E> next;

        Node(Node<E> prev, E item, Node<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

}