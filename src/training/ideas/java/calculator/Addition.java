package training.ideas.java.calculator;

import java.util.Arrays;
import java.util.List;

public class Addition {
    public static double add(double ...numbers) {
        double sum=0;
        for (double individualNumbers: numbers){
            sum+=individualNumbers;
        }
        return sum;
    }
}
