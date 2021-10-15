package com.algorithms.sorting;

import com.algorithms.classes.SortClass;
import com.algorithms.interfaces.Sort;
import com.algorithms.utils.AppUtil;

import java.util.List;

public class SelectionSort extends SortClass {

    private final List<Integer> numbers;

    public SelectionSort(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> sortList(boolean showList){
        //print array before sorting
        appUtil.printList("INITIAL ARRAY: ", numbers);

        //find the number of items in the array
        int n = numbers.size();

        //loop through the upper bound of unsorted array
        for(int i = 0; i < n - 1; i++){

            //find minimum index that is unsorted
            int indx = i;
            //loop through unsorted array to find minimum element
            for (int j = i; j < n; j++) {
                //switch values if large
                if(numbers.get(j) < numbers.get(indx)){
                    indx = j;
                }

            }
            //swap element with first element
            swapElements(numbers, indx, i);

            //display the list
            if(showList) appUtil.printList("", numbers);

        }
        appUtil.printList("FINAL ARRAY: ", numbers);
        //return the value
        return numbers;
    }

    @Override
    public void swapElements(List<Integer> myNumbers, int i, int j) {
        super.swapElements(myNumbers, i, j);
    }

}
