package test;

import com.algorithms.Main;
import com.algorithms.classes.CustomSorter;
import com.algorithms.sorting.BubbleSort;
import com.algorithms.sorting.InsertionSort;
import com.algorithms.sorting.MergeSort;
import com.algorithms.sorting.SelectionSort;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortingTest {

    private List<Integer> bubbleNumbers = new ArrayList<>();
    private List<Integer> selectionNumbers = new ArrayList<>();
    private List<Integer> expectedList = new ArrayList<>();
    private List<Integer> insertionNumbers = new ArrayList<>();
    private List<Integer> mergeSortNumbers = new ArrayList<>();
    
    //before test execution
    @Before
    public void testSetUp(){
        //set up values
        //max value of lists
        int maxValue = 760;
        expectedList = Main.getTestList(maxValue);

        bubbleNumbers = expectedList;
        selectionNumbers = expectedList;
        insertionNumbers = expectedList;
        mergeSortNumbers = expectedList;

        //sort bubbleNumbers using BubbleSort
        //sorting classes
        BubbleSort mySorter = new BubbleSort(bubbleNumbers);
        mySorter.sortList(false);

        //sort selectionNumbers using SelectionSort
        SelectionSort selectionSort = new SelectionSort(selectionNumbers);
        selectionSort.sortList(false);

        //sort using insertion sort
        InsertionSort insertionSort = new InsertionSort(insertionNumbers);
        insertionSort.sortList(false);

        //sort using insertion sort
        MergeSort mergeSort = new MergeSort(mergeSortNumbers);
        mergeSort.sortList(false);

        //sort with default sorter
        Collections.sort(expectedList);
    }

    //test Bubble sort
    @Test
    public void testBubbleSort(){
        assertEquals(expectedList, bubbleNumbers);
    }

    //test Selection sort
    @Test
    public void testSelectionSort(){
        assertEquals(expectedList, selectionNumbers);
    }

    //test insertion sort
    @Test
    public void testInsertionSort(){
        assertEquals(expectedList, insertionNumbers);
    }

    //test merge sort
    @Test
    public void testMergeSort(){
        assertEquals(expectedList, mergeSortNumbers);
    }


}
