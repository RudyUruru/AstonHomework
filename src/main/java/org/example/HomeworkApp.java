package org.example;

import org.example.collection.MyCollections;
import org.example.collection.MyLinkedList;
import org.example.collection.MyList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HomeworkApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");

        MyList<String> myStringList = new MyLinkedList<>();
        myStringList.add("11");
        myStringList.add("22");
        myStringList.addAll(list);

        System.out.println("-------BEFORE REMOVE-------");
        for(int i = 0; i < myStringList.size(); i++) {
            System.out.println(myStringList.get(i));
        }

        myStringList.remove(0);
        myStringList.remove(2);

        System.out.println("------AFTER REMOVE-------");
        for (int i = 0; i < myStringList.size(); i++) {
            System.out.println(myStringList.get(i));
        }

        MyList<Integer> myIntegerList = new MyLinkedList<>();
        myIntegerList.add(1);
        myIntegerList.add(5);
        myIntegerList.add(4);
        myIntegerList.add(2);
        myIntegerList.add(3);
        System.out.println("------BEFORE SORTING------");
        for (int i = 0; i < myIntegerList.size(); i++) {
            System.out.println(myIntegerList.get(i));
        }

        MyCollections.bubbleSort(myIntegerList, Comparator.naturalOrder());
        System.out.println("------AFTER SORTING------");
        for (int i = 0; i < myIntegerList.size(); i++) {
            System.out.println(myIntegerList.get(i));
        }

    }
}
