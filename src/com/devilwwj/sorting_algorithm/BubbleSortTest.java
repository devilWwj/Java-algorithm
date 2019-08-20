package com.devilwwj.sorting_algorithm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.testng.annotations.Test;


public class BubbleSortTest {

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void bubbleSort() throws Exception {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        BubbleSort.sort(array);
        Assert.assertEquals(1, array[0]);
        Assert.assertEquals(9, array[array.length - 1]);
    }

}