package training.ideas.java.sorting;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {
    @Test
    public void testSelectionSortAsc(){
        int[] integerValues = {4,3,1,7,5,2,6};
        int[] sortedValues = {1,2,3,4,5,6,7};
        Assert.assertArrayEquals("Values did not match", sortedValues, InsertionSort.asc(integerValues));
    }
    @Test
    public void testSelectionSortDesc(){
        int[] integerValues = {4,3,1,7,5,2,6};
        int[] sortedValues = {7,6,5,4,3,2,1};
        Assert.assertArrayEquals("Values did not match",sortedValues, InsertionSort.desc(integerValues));
    }
    @Test
    public void testSelectionSortAsc_PassNegativeAndZero(){
        int[] integerValues = {4,1,7,5,0,-4};
        int[] sortedValues = {-4,0,1,4,5,7};
        Assert.assertArrayEquals("Values did not match",sortedValues, InsertionSort.asc(integerValues));
    }
    @Test
    public void testSelectionSortDesc_PassNegativeAndZero(){
        int[] integerValues = {4,0,-1,7,5,8,2,6};
        int[] sortedValues = {8,7,6,5,4,2,0,-1};
        Assert.assertArrayEquals("Values did not match",sortedValues, InsertionSort.desc(integerValues));
    }
}
