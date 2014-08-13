package training.ideas.java.fibonacciSeries;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciSeriesTest {
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass4Numbers(){
      int[] expectedFibonacciSeries = {1,1,2,3};
      assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeries.getSeries(4));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass5Numbers(){
        int[] expectedFibonacciSeries = {1,1,2,3,5};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeries.getSeries(5));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass10Numbers(){
        int[] expectedFibonacciSeries = {1,1,2,3,5,8,13,21,34,55};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeries.getSeries(10));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass3Numbers(){
        int[] expectedFibonacciSeries = {1,1,2};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeries.getSeries(3));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass2Numbers(){
        int[] expectedFibonacciSeries = {1,1};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeries.getSeries(2));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass1Number(){
        int[] expectedFibonacciSeries = {1};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeries.getSeries(1));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_PassZeroNumber(){
        FibonacciSeries.getSeries(0);
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_PassNegativeNumber(){
        try{
          FibonacciSeries.getSeries(-1);
         }
          catch (NegativeArraySizeException e){
        }
   }

}
