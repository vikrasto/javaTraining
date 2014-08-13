package training.ideas.java.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnvra on 29-07-2014.
 */
public class BubbleSortTest {
    @Test
    public void verifyIntegerBubbleSortingAscendingOrder_PassDifferentValues() {
        int[] integersValues = {5, 4, 3, 1, 7, 6, 2};
        int[] sortedIntegerValues = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals("Values were not sorted", sortedIntegerValues, BubbleSort.asc(integersValues));
    }
    @Test
    public void verifyIntegerBubbleSortingDescendingOrder_PassDifferentValues() {
        int[] integersValues = {5, 4, 3, 1, 7, 6, 2};
        int[] sortedIntegerValues = {7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals("Values were not sorted", sortedIntegerValues, BubbleSort.desc(integersValues));
    }
}
