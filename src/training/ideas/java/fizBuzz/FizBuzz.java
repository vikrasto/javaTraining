package training.ideas.java.fizBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by idnvra on 11-08-2014.
 */
public class FizBuzz {
    public static String[] get(int[] integerValues) {
        String[] stringArray = new String[integerValues.length];
        for (int arrayIndex=0;arrayIndex<integerValues.length;arrayIndex++){
            if (integerValues[arrayIndex]%5==0 && integerValues[arrayIndex]%3==0){
                stringArray[arrayIndex]="fizzBuzz";
            }
            else if (integerValues[arrayIndex]%3==0){
                stringArray[arrayIndex]="fizz";
            }
            else if (integerValues[arrayIndex]%5==0){
                stringArray[arrayIndex]="buzz";
            }
            else {
                stringArray[arrayIndex] = Integer.toString(arrayIndex + 1);
            }
        }
        return stringArray;
    }
}
