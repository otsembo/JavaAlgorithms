package com.algorithms.classes;

import com.algorithms.interfaces.Sort;

import java.util.List;

public class SortClass implements Sort {

    public List<Integer> numbers;



    public void swapElements(List<Integer> myNumbers, int i, int j){
        int tmp = myNumbers.get(j);
        myNumbers.set(j, myNumbers.get(i));
        myNumbers.set(i, tmp);
    }

    @Override
    public List<Integer> sortList(boolean showList) {
        return this.numbers;
    }
}
