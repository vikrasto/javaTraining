package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by idnvra on 28-07-2014.
 */
public class MinLosTest {
    @Test
    public void verifyMinLos_FirstYIsAt5thPlace(){
        String fplosDecisions="NNNNYYY";
        Assert.assertEquals("Minlos Value retrieved is not coorect", 5, Minlos.getMinLos(fplosDecisions));
    }
    @Test
    public void verifyMinLos_FirstYIsAt7thPlace(){
        String fplosDecisions="NNNNNNY";
        Assert.assertEquals("Minlos Value retrieved is not coorect", 7, Minlos.getMinLos(fplosDecisions));
    }
    @Test
    public void verifyMinLos_YIsNotPresentMinlosShouldBe0(){
        String fplosDecisions="NNNNNNN";
        Assert.assertEquals("Minlos Value retrieved is not coorect", 0, Minlos.getMinLos(fplosDecisions));
    }
    @Test
    public void verifyMinLos_AllYInFplosMinlosShouldBe1(){
        String fplosDecisions="YYYYYYY";
        Assert.assertEquals("Minlos Value retrieved is not coorect", 1, Minlos.getMinLos(fplosDecisions));
    }
}
