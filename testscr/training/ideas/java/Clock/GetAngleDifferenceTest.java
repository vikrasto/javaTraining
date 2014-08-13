package training.ideas.java.Clock;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by idnvra on 11-08-2014.
 */
public class GetAngleDifferenceTest {
    @Test
    public void getAngleDiff(){
        assertEquals(15.0,GetAngleDifference.get(5, 30),0);

    }
    @Test
    public void getAngleDiff2(){
        assertEquals(15.0,GetAngleDifference.get(6, 30),0);
    }
    @Test
    public void getAngleDiff3(){
        assertEquals(80.0,GetAngleDifference.get(10, 40),0);
    }
    @Test
    public void getAngleDiff4(){
        assertEquals(90.0,GetAngleDifference.get(9, 0),0);
    }
}
