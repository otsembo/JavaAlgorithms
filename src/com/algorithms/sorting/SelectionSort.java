package com.algorithms.sorting;

import java.util.List;

public class SelectionSort {

    private final List<Integer> numbers;

    public SelectionSort(List<Integer> numbers) {
        this.numbers = numbers;
    }

    //print array during sorting
    private void printList(){
        System.out.println(numbers.toString());
    }

    public List<Integer> sortList(boolean showList){

        if(showList){
            //print array before sorting
            printList();
        }

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
            int tmp = numbers.get(indx);
            numbers.set(indx, numbers.get(i));
            numbers.set(i, tmp);

            if (showList) printList();

        }
        //return the value
        return numbers;
    }

}
