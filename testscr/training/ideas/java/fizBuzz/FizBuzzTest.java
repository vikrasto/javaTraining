package training.ideas.java.fizBuzz;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by idnvra on 11-08-2014.
 */
public class FizBuzzTest {
    @Test
    public void fizBuzz(){
         int[] integerValues = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
         String[] expectedArray = {"1","2","fizz","4","buzz","fizz","7","8","fizz","buzz","11","fizz","13","14","fizzBuzz"};
         assertArrayEquals(expectedArray,FizBuzz.get(integerValues));
    }
}
