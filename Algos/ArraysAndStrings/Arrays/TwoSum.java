package Algos.ArraysAndStrings.Arrays;

import Utilities.Services.Inputs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ANJALI on 6/1/2017.
 */

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class TwoSum {
    int[] given;
    int target;

    int[] twoSum(int[] given, int target) throws Exception {
        Map<Integer, Integer> twosum = new HashMap<>();
        for (int i = 0; i < given.length; i++) {
            int complement = given[i] - target;
            if (twosum.containsKey(complement))
                return new int[]{i, twosum.get(i)};
            twosum.put(given[i], i);
        }
        throw new Exception("No twosum found");
    }

/*Given an array of integers that is already sorted in ascending order,
find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target,
where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
    You may assume that each input would have exactly one solution and you may not use the same element twice.
    Input: numbers={2, 7, 11, 15}, target=9
    Output: index1=1, index2=2 */

    int[] twoSumOnSortedArray(int[] given, int target) throws Exception {
        int first = 0, last = given.length - 1;
        while (first < last) {
            if (given[first] + given[last] == target)
                return new int[]{(first + 1), (last + 1)};
            //since indices should not be zero based
            if (given[first] + given[last] > target)
                last--;
            else
                first++;
        }
        throw new Exception("No twosum found");
    }

    public static void main(String[] args) throws Exception {
        TwoSum ts = new TwoSum();
        System.out.println("****TWO SUM****");

        ts.given = new Inputs().getIntArray();
        ts.target = new Inputs().getANumber();

        for (int i : ts.twoSumOnSortedArray(ts.given, ts.target))
            System.out.print(i);

    }
}



