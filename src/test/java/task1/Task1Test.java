package task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task1Test {
    NewArrCreator newArrCreator;

    @Before
    public void startTest() {
        newArrCreator = new NewArrCreator();
    }

    @Test
    public void standartTest() {
        int[] testArr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] newArr = {1, 7};
        Assert.assertArrayEquals(newArr, newArrCreator.newArrAfterLast4(testArr));
    }

    @Test(expected = RuntimeException.class)
    public void testWithExceprion() {
        int[] testArr = {2, 2, 3, 7, 2, 3, 9, 1, 7};
        int[] newArr = {};
        Assert.assertArrayEquals(newArr, newArrCreator.newArrAfterLast4(testArr));
    }

    @Test
    public void firstIs4() {
        int[] testArr = {4, 2, 5, 9, 6, 5, 8, 9};
        int[] newArr = {2, 5, 9, 6, 5, 8, 9};
        Assert.assertArrayEquals(newArr, newArrCreator.newArrAfterLast4(testArr));
    }

    @Test
    public void lastIs4() {
        int[] testArr = {2, 5, 9, 6, 5, 8, 9, 4};
        int[] newArr = {};
        Assert.assertArrayEquals(newArr, newArrCreator.newArrAfterLast4(testArr));
    }

}

