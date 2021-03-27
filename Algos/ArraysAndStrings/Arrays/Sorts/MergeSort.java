package Algos.ArraysAndStrings.Arrays.Sorts;

/**
 * Created by ANJALI on 01/30/17.
 */
public class MergeSort {
    public static void mSort(int[] arr, int start, int end)
    //this method focuses on dividing the array recursively till the size of the array is 1
    {
        if (start < end) {
            int mid = (start + end) / 2;
            mSort(arr, start, mid);
            mSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }


    private static void merge(int[] arr, int start, int mid, int end) {
        //creating a new temporary array
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;

        //copying the elements in order
        for (int k = 0; k < temp.length; k++) {
            if (j <= end) {
                if (arr[i] <= arr[j] && i < mid + 1) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
            } else
                temp[k] = arr[i++];    //if the divided arrays are of different size
        }

        int arrIn = start;
        for (int num : temp) //replaces the given array with the sorted values in the temp array
        {
            arr[arrIn] = num;
            arrIn++;
        }
    }
}
