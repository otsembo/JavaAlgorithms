package com.algorithms.sorting;

import com.algorithms.classes.SortClass;

import java.util.List;

public class QuickSort extends SortClass {

    private final List<Integer> numbers;

    public QuickSort(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> sortList(boolean showList) {

        quickSort(numbers, 0, numbers.size()-1);

        return numbers;
    }

    @Override
    public void swapElements(List<Integer> myNumbers, int i, int j) {
        super.swapElements(myNumbers, i, j);
    }

    public int partition(List<Integer> nums, int low, int high){

        //pivot
        int pivot = nums.get(high);

        int i = (low - 1);

        for (int j = low; j <= high - 1 ; j++) {

            if(nums.get(j) < pivot){

                i++;
                swapElements(nums, i, j);
            }

        }

        swapElements(nums, i+1, high);
        return (i+1);
    }

    public void quickSort(List<Integer> nums, int low, int high){

        if(low < high){

            int pi = partition(nums, low, high);

            quickSort(nums, low, pi -1);
            quickSort(nums, pi+1, high);

        }

    }


}
