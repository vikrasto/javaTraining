package training.ideas.java.fibonacciSeries;

/**
 * Created by idnvra on 05-08-2014.
 */
public class FibonacciSeries {
    public static int[] getSeries(int numberCount) {
         int[] fibonacciSeries= new int[numberCount];
             if (numberCount>1){
                fibonacciSeries[0]= 1;
                fibonacciSeries[1]= 1;
                for (int counter=0;counter<numberCount-2;counter++){
//                    int sum=+fibonacciSeries[counter]+fibonacciSeries[counter+1];
//                    fibonacciSeries[counter+2]=sum;
                fibonacciSeries[counter+2]= fibonacciSeries[counter]+fibonacciSeries[counter+1];
                }
             }
             else if (numberCount==1){
                 fibonacciSeries[0]= 1;
             }
             else if (numberCount==0){
                 System.out.println("Can not create fibonacci series as 0 value was entered");
             }
          return fibonacciSeries;
     }
 }
