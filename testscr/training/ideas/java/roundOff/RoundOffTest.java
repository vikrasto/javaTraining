package training.ideas.java.roundOff;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by idnvra on 11-08-2014.
 */
public class RoundOffTest {
    @Test
    public void roundOffTest_PassGreaterThan0Value(){
        assertEquals(22.05,RoundOff.roundOff(22.01),0);
    }
    @Test
    public void roundOffTest_SameNumber(){
        assertEquals(22.05,RoundOff.roundOff(22.05),0);
    }
    @Test
    public void roundOffTest_PassLessThan0Value(){
        assertEquals(.05,RoundOff.roundOff(0.04),0);
    }
}
