package com.wipro.numbers;

import java.util.ArrayList;

public class NumberList {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();

        numberList.add(100);       // Integer
        numberList.add(45.6f);     // Float
        numberList.add(99.99);     // Double

        System.out.println("Numbers in the list:");
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}
