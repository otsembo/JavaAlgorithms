package com.algorithms.sorting;

import com.algorithms.classes.SortClass;

import java.util.List;

public class MergeSort extends SortClass {

    private final List<Integer> numbers;

    public MergeSort(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> sortList(boolean showList) {
        actualSort(numbers, 0, numbers.size()-1);
        return numbers;
    }

    //method for merging
    private void merge(List<Integer> nums, int l, int m, int r){

        //sizes of the two subarrays
        int n1 = m - l + 1;
        int n2 = r - m;

        //create temporary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = nums.get(l + 1);
        }

        for (int i = 0; i < n2; i++) {
            R[i] = nums.get(m + 1 + i);
        }

        //initial indices of first and second sub arrays
        int i = 0, j = 0;

        int k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                nums.set(k, L[i]);
            }else{
                nums.set(k, R[j]);
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            nums.set(k, L[i]);
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            nums.set(k, R[j]);
            j++;
            k++;
        }

    }

    //sort the elements
    private void actualSort(List<Integer> myNums, int l, int r){
        if(l < r){
            int m = l + (r - l) / 2;

            //sort first and second halves
            actualSort(myNums, l, m);
            actualSort(myNums, m+1, r);

            //merge the sorted values
            merge(myNums, l, m, r);
        }

    }

}
