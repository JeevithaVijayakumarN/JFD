package com.nseit.SpringExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlg sortAlg;

    public int binarySearch(int[] numbers, int numbersToBeSearched) {
//        SortAlg sortAlg = new BubbleSort();
        //QuickSort quickSort = new QuickSort();
        int[] sortnumber = sortAlg.sort(numbers);
        System.out.println(sortAlg);
        return 3;

    }
}
