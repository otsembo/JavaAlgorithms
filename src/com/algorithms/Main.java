package com.algorithms;

import com.algorithms.sorting.SelectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    private static final int listCapacity = 50;
    private static final List<Integer> numbers = new ArrayList<>(listCapacity);

    public static void main(String[] args) {
        // initialize list
        setUpList(120);

        //test selection sort
        SelectionSort mySort = new SelectionSort(numbers);
        mySort.sortList(true);

    }

    private static void setUpList(int maxValue){
        //create a random list of integers
        //Random object
        Random random = new Random();

        //use loop to fill data in the list
        for (int i = 0; i <= listCapacity; i++) {
            numbers.add(random.nextInt(maxValue));
        }

    }

}
