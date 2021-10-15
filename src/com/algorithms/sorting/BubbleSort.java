package com.algorithms.sorting;

import com.algorithms.classes.SortClass;
import com.algorithms.interfaces.Sort;

import java.util.List;

public class BubbleSort extends SortClass {

    private final List<Integer> numbers;

    public BubbleSort(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> sortList(boolean showList) {
        //appUtil.printList("INITIAL ARRAY: ", numbers);
        //number of items
        int n = numbers.size();
        //loop through entire array
        for (int i = 0; i < n-1; i++) {
            //loop unsorted array
            for (int j = 0; j < n-i-1; j++) {
                if(numbers.get(j) < numbers.get(j+1)){
                    //swap array elements
                    swapElements(numbers, j+1, j);
                    if(showList) appUtil.printList("", numbers);
                }
            }
        }
        //appUtil.printList("FINAL ARRAY: ", numbers);
        return numbers;
    }


    //recursive bubble sort
    public void recursivelySort(List<Integer> data, int n){
        //base scenario
        if(n == 1) return;

        for (int i = 0; i < n-1; i++) {
            if(data.get(i) > data.get(i+1)){
                //swap the element
                swapElements(data, i, i+1);
            }

            //call the method again
            recursivelySort(data, n-1);

        }

    }

    @Override
    public void swapElements(List<Integer> myNumbers, int i, int j) {
        super.swapElements(myNumbers, i, j);
    }
}
