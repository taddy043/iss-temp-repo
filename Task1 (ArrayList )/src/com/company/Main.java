package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedListIterator = new LinkedList<>();
        long startTime, endTime;

        //ArrayList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) arrayList.add(i);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Adding 1000000 elements into ArrayList cost " + endTime + " ms");

        //LinkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) linkedList.add(i);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Adding 1000000 elements into LinkedList cost " + endTime + " ms");

        //LinkedList with Iterator
        startTime = System.currentTimeMillis();
        linkedListIterator.listIterator(0);
        for (int i = 0; i < 1000000; i++) linkedListIterator.add(i);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Adding 1000000 elements into LinkedList with Iterator cost " + endTime + " ms");
    }
}
