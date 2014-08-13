package training.ideas.java.decisions;

/**
 * Created by idnvra on 28-07-2014.
 */
public class Fplos {
    public static char[] getFpLOSDecisions(int[] lrv, int ...rates) {
        int lrvSum=0;
        int ratesSum=0;
        char[] fpLOSDecision = new char[7];
        for (int counter=0;counter<lrv.length;counter++){
            lrvSum+=lrv[counter];
            if (rates.length==1){
                ratesSum=rates[0]*(counter+1);
            }
            else {
                ratesSum += rates[counter];
            }
            if (ratesSum>=lrvSum){
                fpLOSDecision[counter]='Y';
            }
            else fpLOSDecision[counter]='N';
        }
        return fpLOSDecision;
    }
}
