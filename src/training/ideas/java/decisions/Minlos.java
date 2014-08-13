package training.ideas.java.decisions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by idnvra on 28-07-2014.
 */
public class Minlos {
    public static int getMinLos(String fplosDecisions) {
//        int minLos=0;
//        char[] fplosDecisionsInArray = fplosDecisions.toCharArray();
//        for (int i = 0; i < fplosDecisionsInArray.length; i++) {
//            if (fplosDecisionsInArray[i] == 'Y') {
//                minLos = i + 1;
//                break;
//            }
//        }
//        return minLos;
        return fplosDecisions.toUpperCase().indexOf("Y")+1;
    }
}
