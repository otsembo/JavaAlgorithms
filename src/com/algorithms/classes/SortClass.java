package com.algorithms.classes;

import java.util.List;

public class SortClass {

    public void swapElements(List<Integer> myNumbers, int i, int j){
        int tmp = myNumbers.get(j);
        myNumbers.set(j, myNumbers.get(i));
        myNumbers.set(i, tmp);
    }

}
