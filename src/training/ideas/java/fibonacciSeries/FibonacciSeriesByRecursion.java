package training.ideas.java.fibonacciSeries;

/**
 * Created by idnvra on 06-08-2014.
 */
public class FibonacciSeriesByRecursion {
    public static int[] getSeries(int numberCount) {
        int[] fibonacciSeries = new int[numberCount];
        for (int counter=0;counter<numberCount;counter++){
            fibonacciSeries[counter]= getSumOfLastTwoNumbers(counter);
        }
        return fibonacciSeries;
    }

    private static int getSumOfLastTwoNumbers(int numberCount) {
        int firstAndSecondValue=1;
        if (numberCount==0 || numberCount==1){
            return firstAndSecondValue;
        }else {
            return getSumOfLastTwoNumbers(numberCount - 1) + getSumOfLastTwoNumbers(numberCount - 2);
        }
    }

    public static int[] getSeriesPassArray(int numberCount) {
        int[] fibonacciSeries = new int[numberCount];
        getFibonacciSeries(fibonacciSeries, numberCount);
        return fibonacciSeries;
    }

    private static void getFibonacciSeries(int[] fibonacciSeries, int numberCount) {
        if (numberCount==0){
            return;
        }
        if (numberCount==1||numberCount==2){
            fibonacciSeries[0]=1;
            fibonacciSeries[1]=1;
            return;
        }
        else{
            fibonacciSeries[numberCount-1]=fibonacciSeries[numberCount-2]+fibonacciSeries[numberCount-3];
            getFibonacciSeries(fibonacciSeries, numberCount-1);
        }
    }
}
