package training.ideas.java.fibonacciSeries;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnvra on 06-08-2014.
 */
public class FibonacciSeriesByRecursionTest {
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass4Numbers(){
        int[] expectedFibonacciSeries = {1,1,2,3};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeriesByRecursion.getSeries(4));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass5Numbers(){
        int[] expectedFibonacciSeries = {1,1,2,3,5};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeriesByRecursion.getSeries(5));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass10Numbers(){
        int[] expectedFibonacciSeries = {1,1,2,3,5,8,13,21,34,55};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeriesByRecursion.getSeries(10));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass3Numbers(){
        int[] expectedFibonacciSeries = {1,1,2};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeriesByRecursion.getSeries(3));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass2Numbers(){
        int[] expectedFibonacciSeries = {1,1};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeriesByRecursion.getSeries(2));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_Pass1Number(){
        int[] expectedFibonacciSeries = {1};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeriesByRecursion.getSeries(1));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_PassZeroNumber(){
        FibonacciSeriesByRecursion.getSeries(0);
    }
    @Test
    public void testValuesReturnedFromFibonacciSeries_PassNegativeNumber(){
        try{
            FibonacciSeriesByRecursion.getSeries(-1);
        }
        catch (NegativeArraySizeException e){
        }
    }
    @Test
    public void testValuesReturnedFromFibonacciSeriesPassArray_Pass4Numbers(){
        int[] expectedFibonacciSeries = {1,1,2,3};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeriesByRecursion.getSeriesPassArray(4));
    }
    @Test
    public void testValuesReturnedFromFibonacciSeriesPassArray_Pass5Numbers(){
        int[] expectedFibonacciSeries = {1,1,2,3,5};
        assertArrayEquals("Expected did not match with the actual",expectedFibonacciSeries, FibonacciSeriesByRecursion.getSeriesPassArray(5));
    }
}
