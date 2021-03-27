package Algos.ArraysAndStrings.Arrays;

import Utilities.Services.Inputs;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by ANJALI on 6/7/2017.
 */
public class SlidingWindowMax {
    /*
    Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
For example,
Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Therefore, return the max sliding window as [3,3,5,5,6,7].
Note:
You may assume k is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array.
Follow up:
Could you solve it in linear time?
     */

    private int[] findSlidingWindowMaximum(int[] input, int k) {

        if (k <= 0 || input == null) {
            return new int[0];
        }

        int n = input.length;
        int[] max = new int[n - k + 1];
        Deque<Integer> indexToMax = new ArrayDeque<>();
        int ind = 0;

        for (int current = 0; current < input.length; current++) {

            while (!indexToMax.isEmpty() && indexToMax.peek() < current - k + 1)
                indexToMax.poll();

            while (!indexToMax.isEmpty() && input[indexToMax.peekLast()] < input[current])
                indexToMax.pollLast();

            indexToMax.offer(current);

            if (current >= k - 1) {
                max[ind] = input[indexToMax.peek()];
                ind++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        SlidingWindowMax sm = new SlidingWindowMax();
        System.out.println("***SLIDING WINDOW MAXIMUM***");
        int[] input = new Inputs().getIntArray();
        int k = new Inputs().getANumber();
        for (int n : sm.findSlidingWindowMaximum(input, k)) {
            System.out.print(n + " ");
        }
    }
}
