package org.example.collection;

import java.util.Collection;

public interface MyList<E> {
    void add(E element);
    void addAll(Collection<E> collection);
    void remove(int index);
    E get(int index);
    void set(int index, E element);
    int size();
}