package com.algorithms;

import com.algorithms.sorting.BubbleSort;
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

    public static List<Integer> getTestList(int maxValue){
        Random myRandom = new Random();
        List<Integer> myNumbers = new ArrayList<>(listCapacity);
        for (int i = 0; i <= listCapacity ; i++) {
            myNumbers.add(myRandom.nextInt(maxValue));
        }
        return myNumbers;
    }

}
