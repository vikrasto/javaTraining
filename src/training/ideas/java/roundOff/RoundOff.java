package training.ideas.java.roundOff;

/**
 * Created by idnvra on 11-08-2014.
 */
public class RoundOff {

    public static double roundOff(double input) {
       if (input*100%5==0){
           return input;
       }
        return (input*100 +5 - ((input*100)%5))/100;
    }
}
