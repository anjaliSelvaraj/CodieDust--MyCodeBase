package Algos.ArraysAndStrings.Arrays.Sorts;

/**
 * Created by ANJALI on 01/30/17.
 */
public class InsertionSort {
    public static void iSort(int[] arr) {
        int i;
        int j;
        int pick;
        for (i = 1; i < arr.length; i++) {
            pick = arr[i];
            for (j = i - 1; j >= 0 && pick < arr[j]; j--) {
                arr[j + 1] = arr[j];
                arr[j] = pick;

            }

        }
    }
}
