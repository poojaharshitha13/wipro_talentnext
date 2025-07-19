package com.wipro.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        printAll(stringList);
    }

    public static void printAll(ArrayList<String> list) {
        System.out.println("Elements in the ArrayList:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
