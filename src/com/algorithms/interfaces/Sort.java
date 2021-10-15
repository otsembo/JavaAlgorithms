package com.algorithms.interfaces;

import com.algorithms.utils.AppUtil;

import java.util.ArrayList;
import java.util.List;

public interface Sort {
    //had coded appUtil injection
    AppUtil appUtil = new AppUtil();
    //sorting function
    List<Integer> sortList(boolean showList);
}
