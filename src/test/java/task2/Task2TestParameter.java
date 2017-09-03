package task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

//Решил попробовать написать тесты с параметритизированными данными
//Наверно не лучший вараинт, так как есть только проверки assertTrue/False
//Которые выдают Exception, поэтому переписал в Task2Test

@RunWith(Parameterized.class)
public class Task2TestParameter {

    @Parameterized.Parameters
    public static Collection<int[]> data() {
        return Arrays.asList(new int[][]{
                {2, 1, 4, 5, 6, 8, 9},
                {1, 4, 1, 1, 1, 4, 1},
                {1, 4, 1, 3, 1, 4, 1, 5, 6},
                {1, 1, 1, 1, 1, 1, 1},
        });
    }

    private int[] arr;

    public Task2TestParameter(int[] arr){
        this.arr = arr;
    }
    ArrChecker arrChecker;

    @Before
    public void init() {
        arrChecker = new ArrChecker();
    }

    @Test
    public void massTest(){
        Assert.assertTrue(arrChecker.checkArrFor1or4(arr));
    }

}
