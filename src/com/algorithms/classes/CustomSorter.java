package com.algorithms.classes;

import java.util.ArrayList;
import java.util.List;

public class CustomSorter<T extends SortClass> {

    private List<Integer> nums;
    private T sorter;

    public CustomSorter(List<Integer> nums) {
        this.nums = nums;
        //this.sorter = (T) new SortClass(nums);

    }

    public List<Integer> sortedList(boolean showList){
        nums = sorter.sortList(showList);
        return nums;
    }

}
