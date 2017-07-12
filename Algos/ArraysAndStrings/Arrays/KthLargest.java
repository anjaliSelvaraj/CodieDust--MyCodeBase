package Algos.ArraysAndStrings.Arrays;

import Algos.ArraysAndStrings.Arrays.Sorts.QuickSort;
import Utilities.Services.Inputs;

/**
 * Created by ANJALI on 6/8/2017.
 */
public class KthLargest {
    /*Find the kth largest element in an unsorted array.
    Note that it is the kth largest element in the sorted order, not the kth distinct element.
For example,
Given [3,2,1,5,6,4] and k = 2, return 5.
Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.
     */

    int kthLargest(int[] arr, int k){
        k=arr.length-k; // this is the position of the kth largest after the array gets sorted.
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int pos= QuickSort.partition(arr,start,end);
            if(pos<k)
                start=pos+1;
            else if(pos>k)
                end=pos-1;
            else break;
        }
     return arr[k];
    }
    public static void main(String args[]){
        KthLargest kl=new KthLargest();
        System.out.println("***Kth LARGEST***");
       int kthLargest= kl.kthLargest(new Inputs().getIntArray(),new Inputs().getANumber());
       System.out.println(kthLargest);
    }
}
