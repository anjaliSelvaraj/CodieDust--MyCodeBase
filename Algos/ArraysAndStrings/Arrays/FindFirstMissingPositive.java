package Algos.ArraysAndStrings.Arrays;

import java.util.Arrays;

/**
 *Write a function:
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 *         N is an integer within the range [1..100,000];
 *         each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class FindFirstMissingPositive {
    public int myfindFirstMissingPositive(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int prev = -1;
        for(int  i=0; i< A.length; i++){
            if(A[i]>0){
                if(prev <=0){
                    prev = A[i];
                } else if(prev != A[i] && prev + 1 != A[i]){
                    return prev + 1;
                } else {
                    prev = A[i];
                }
            }
        }

        if(A[A.length-1] >0 ){
            return A[A.length-1] +1 ;
        }

        return 1 ;
    }

    public static void main(String[] args){
        FindFirstMissingPositive fm = new FindFirstMissingPositive();
        int[] arr = new int[]{1,2,3};
        fm.myfindFirstMissingPositive(arr);
    }
}
