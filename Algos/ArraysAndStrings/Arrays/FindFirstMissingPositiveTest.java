package Algos.ArraysAndStrings.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindFirstMissingPositiveTest {
    FindFirstMissingPositive fm = new FindFirstMissingPositive();
    int[] input ;
    @Test
    void testSortedArray(){
      input = new int[]{1,2,3};
      Assertions.assertEquals(4, fm.myfindFirstMissingPositive(input));
    }

    @Test
    void testOnlyNegativeArray(){
        input = new int[]{-1, -3};
        Assertions.assertEquals(1, fm.myfindFirstMissingPositive(input));
    }

    @Test
    void testUnSortedPositiveArray(){
        input = new int[]{1, 3, 6, 4, 1, 2};
        Assertions.assertEquals(5, fm.myfindFirstMissingPositive(input));
    }

    @Test
    void testSingleLengthNegativeArray(){
        input = new int[]{-10};
        Assertions.assertEquals(1, fm.myfindFirstMissingPositive(input));
    }

    @Test
    void testSingleLengthPositiveArray(){
        input = new int[]{10};
        Assertions.assertEquals(1, fm.myfindFirstMissingPositive(input));
    }

}