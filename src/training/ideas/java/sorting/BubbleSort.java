package training.ideas.java.sorting;

import static training.ideas.java.sorting.VerifySortOrderAscOrDesc.check;

/**
 * Created by idnvra on 29-07-2014.
 */
public class BubbleSort {

    public static int[] asc(int[] integersValues) {
        sort(integersValues, VerifySortOrderAscOrDesc.sortOrder.ASC);
        return integersValues;
    }
    public static int[] desc(int[] integersValues) {
        sort(integersValues, VerifySortOrderAscOrDesc.sortOrder.DESC);
        return integersValues;
    }

    private static void sort(int[] integersValues, VerifySortOrderAscOrDesc.sortOrder sortOrder) {
        for (int sortingPassCounter = 0; sortingPassCounter < integersValues.length - 1; sortingPassCounter++) {
            for (int individualNumberCounter = 0; individualNumberCounter < integersValues.length - 1 - sortingPassCounter; individualNumberCounter++) {
                    if (check(integersValues[individualNumberCounter], integersValues[individualNumberCounter + 1], sortOrder)) {
                        int temp = integersValues[individualNumberCounter];
                        integersValues[individualNumberCounter] = integersValues[individualNumberCounter + 1];
                        integersValues[individualNumberCounter + 1] = temp;
                    }
                }
             }
       }
}


