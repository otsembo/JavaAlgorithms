package com.algorithms.sorting;

import com.algorithms.classes.SortClass;
import com.algorithms.interfaces.Sort;

import java.util.List;

public class InsertionSort extends SortClass{
    private final List<Integer> numbers;

    public InsertionSort(List<Integer> numbers) {
        this.numbers = numbers;
    }


    @Override
    public List<Integer> sortList(boolean showList) {

        //array size
        int n = numbers.size();

        for(int i = 1; i < n; ++i){

            int key = numbers.get(i);

            int j = i - 1;

            //shift elements that are greater than the key
            while(j >= 0 && numbers.get(j) > key){
                numbers.set(j+1, numbers.get(j));
                j = j - 1;
            }

            numbers.set(j + 1, key);

        }

        return numbers;
    }
}
