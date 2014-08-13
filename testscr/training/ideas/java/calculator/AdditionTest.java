package training.ideas.java.calculator;

import junit.framework.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditionTest {
    @Test
    public void addTwoIntegers(){
        Assert.assertEquals("Values did not match",5.0,Addition.add(2,3));
    }
    @Test
    public void addTwoDoubles(){
        Assert.assertEquals("Values did not match",5.5,Addition.add(2.2, 3.3));
    }
    @Test
    public void addIntegersInAnArray(){
        double[] arrayInt={1,2,3,4};
        Assert.assertEquals("Array sum did not match with the expected result",10.0,Addition.add(arrayInt));
    }
    @Test
    public void addDecimalsInAnArray(){
        double [] secondArray = new double[3];
        secondArray[0]=1.1;
        secondArray[1]= 1.5;
        secondArray[2]=2.3;
        Assert.assertEquals("Array sum did not match with the expected result",4.9,Addition.add(secondArray));
    }
    @Test
    public void addIntegersWithoutArrayAndList(){
        Assert.assertEquals("Sum did not match with the expected result",10.0,Addition.add(1,2,3,4));
    }
}
