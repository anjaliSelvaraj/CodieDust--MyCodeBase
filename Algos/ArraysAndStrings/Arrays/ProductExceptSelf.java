package Algos.ArraysAndStrings.Arrays;

import Utilities.Services.Inputs;

/**
 * Created by ANJALI on 6/9/2017.
 */
public class ProductExceptSelf {
    public static void main(String[] args) {
        ProductExceptSelf ps = new ProductExceptSelf();
        System.out.println("***PRODUCT EXCEPT SELF***");
        int[] result = ps.product(new Inputs().getIntArray());

    }

    /*
    Given an array of n integers where n > 1, nums,
    return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
Solve it without division and in O(n).
For example, given [1,2,3,4], return [24,12,8,6].
Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
     */
    private int[] product(int[] given) {
        int n = given.length;
        int[] result = new int[n];

        //multiplication except self in forward direction (left to right)
        result[0] = 1;
        for (int i = 0; i < given.length; i++)
            result[i] = result[i - 1] * given[i - 1];

        //multiplication except self in the backward direction (right to left)
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = right * result[i];
            right = right * given[i];
        }
        return result;
    }
}
