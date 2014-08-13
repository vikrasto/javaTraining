package training.ideas.java.sorting;
import static training.ideas.java.sorting.VerifySortOrderAscOrDesc.check;

/**
 * Created by idnvra on 05-08-2014.
 */
public class InsertionSort {

    public static int[] asc(int[] integersValues) {
        sort(integersValues, VerifySortOrderAscOrDesc.sortOrder.ASC);
        return integersValues;
    }
    public static int[] desc(int[] integersValues) {
        sort(integersValues, VerifySortOrderAscOrDesc.sortOrder.DESC);
        return integersValues;
    }

    private static void sort(int[] integerValues,VerifySortOrderAscOrDesc.sortOrder sortOrder) {
        for (int outerLoopCounter = 1; outerLoopCounter < integerValues.length; outerLoopCounter++) {
            int holdValue = integerValues[outerLoopCounter];
            int innerLoopCounter = outerLoopCounter-1;
            for (;innerLoopCounter>=0 && check(integerValues[innerLoopCounter],holdValue,sortOrder);innerLoopCounter--){
                integerValues [innerLoopCounter+1] = integerValues [innerLoopCounter];
            }
            integerValues[innerLoopCounter+1] = holdValue;
        }
    }
}
