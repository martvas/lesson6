package task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task2Test {
    ArrChecker arrChecker;

    @Before
    public void init(){
        arrChecker = new ArrChecker();
    }

    @Test
    public void testTrue1 (){
        int[] arr = {1, 4, 1, 1, 1, 4, 1};
        Assert.assertTrue(arrChecker.checkArrFor1or4(arr));
    }

    @Test
    public void testTrue2 () {
        int[] arr = {1, 1, 1, 1, 1, 1, 1};
        Assert.assertTrue(arrChecker.checkArrFor1or4(arr));
    }

    @Test
    public void testFalse() {
        int[] arr = {1, 4, 1, 3, 1, 4, 1, 5, 6};
        Assert.assertFalse(arrChecker.checkArrFor1or4(arr));
    }

    @Test
    public void testFalse2() {
        int[] arr = {2, 1, 4, 1, 4};
        Assert.assertFalse(arrChecker.checkArrFor1or4(arr));
    }


}
