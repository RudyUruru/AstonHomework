package org.example.collection;

public class LinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

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