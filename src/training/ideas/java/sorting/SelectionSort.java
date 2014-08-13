package training.ideas.java.sorting;
import static training.ideas.java.sorting.VerifySortOrderAscOrDesc.check;

public class SelectionSort {
    public static int[] asc(int[] integersValues) {
        sort(integersValues, VerifySortOrderAscOrDesc.sortOrder.ASC);
        return integersValues;
    }
    public static int[] desc(int[] integersValues) {
        sort(integersValues, VerifySortOrderAscOrDesc.sortOrder.DESC);
        return integersValues;
    }
    private static int[] sort(int[] integerValues, VerifySortOrderAscOrDesc.sortOrder sortOrder) {
        for (int outerLoopCounter = 0; outerLoopCounter < integerValues.length - 1; outerLoopCounter++) {
            int indexOfSmallerNumber = outerLoopCounter;
            for (int innerLoopCounter = outerLoopCounter + 1; innerLoopCounter < integerValues.length; innerLoopCounter++) {
                if (check(integerValues[indexOfSmallerNumber],integerValues[innerLoopCounter],sortOrder))
                    indexOfSmallerNumber = innerLoopCounter;
            }
            int smallerNumber = integerValues[indexOfSmallerNumber];
            integerValues[indexOfSmallerNumber] = integerValues[outerLoopCounter];
            integerValues[outerLoopCounter] = smallerNumber;
        }
        return integerValues;
    }
 }
