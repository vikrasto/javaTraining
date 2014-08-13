package training.ideas.java.decisions;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnvra on 28-07-2014.
 */
public class FplosTest {
    @Test
    public void verifyFPLOSLogicPassSingleRateValue_TestYYYYYNNWhenRateIsBetweenMaxAndMinLRV(){
        int[] lrv= {1,2,3,4,5,6,7};
        char[] fplosOutPut = {'Y','Y','Y','Y','Y','N','N'};
        assertArrayEquals(fplosOutPut, Fplos.getFpLOSDecisions(lrv, 3));
    }
    @Test
    public void verifyFPLOSLogicPassSingleRateValue_TestNNNNNNNWhenRateIsLessThanAnyOfTheLRVs(){
        int[] lrv= {2,3,4,5,6,7,8};
        char[] fplosOutPut = {'N','N','N','N','N','N','N'};
        assertArrayEquals(fplosOutPut, Fplos.getFpLOSDecisions(lrv, 1));
    }
    @Test
    public void verifyFPLOSLogicPassSingleRateValue_TestFpLOSIsYYYYYYYWhenRateIsGreaterThanAllLRV(){
        int[] lrv= {1,2,3,4,5,6,7};
        char[] fplosOutPut = {'Y','Y','Y','Y','Y','Y','Y'};
        assertArrayEquals(fplosOutPut, Fplos.getFpLOSDecisions(lrv, 8));
    }
    @Test
    public void verifyFPLOSLogicPassSingleRateValue_TestFpLOSIsYNNNNNNWhenRateIsEqualToFirstLRVButIsLessThanOtherLRVs(){
        int[] lrv= {1,2,3,4,5,6,7};
        char[] fplosOutPut = {'Y','N','N','N','N','N','N'};
        assertArrayEquals(fplosOutPut, Fplos.getFpLOSDecisions(lrv, 1));
    }
    @Test
    public void verifyFPLOSLogicPassRateSpectrumValue_TestFplosIsYYYYYYYWhenAllRatesAreEqualToLrvs(){
        int[] lrv= {1,2,3,4,5,6,7};
        int[] rates = {1,2,3,4,5,6,7};
        char[] fplosOutPut = {'Y','Y','Y','Y','Y','Y','Y'};
        assertArrayEquals(fplosOutPut, Fplos.getFpLOSDecisions(lrv, rates));
    }
    @Test
    public void verifyFPLOSLogicPassRateSpectrumValue_TestFplosIsNNNNNNNWhenAllRatesAreLessThanLrvs(){
        int[] lrv= {1,2,3,4,5,6,7};
        int[] rates = {0,1,2,3,4,5,6};
        char[] fplosOutPut = {'N','N','N','N','N','N','N'};
        assertArrayEquals(fplosOutPut, Fplos.getFpLOSDecisions(lrv, rates));
    }
    @Test
    public void verifyFPLOSLogicPassRateSpectrumValue_TestFplosIsYYYYYYYWhenAllRatesAreGreaterThanLrvs(){
        int[] lrv= {1,2,3,4,5,6,7};
        int[] rates = {2,3,4,5,6,7,8};
        char[] fplosOutPut = {'Y','Y','Y','Y','Y','Y','Y'};
        assertArrayEquals(fplosOutPut, Fplos.getFpLOSDecisions(lrv, rates));
    }
    @Test
    public void verifyFPLOSLogicPassRateSpectrumValue_TestFplosIsYYYYYYYWhenAllRatesAreBetweenSomeLrvs(){
        int[] lrv= {1,2,3,7,8,9,10};
        int[] rates = {1,2,4,5,6,7,8};
        char[] fplosOutPut = {'Y','Y','Y','N','N','N','N'};
        assertArrayEquals(fplosOutPut, Fplos.getFpLOSDecisions(lrv, rates));
    }
}
