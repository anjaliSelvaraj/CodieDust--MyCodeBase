package Utilities.Services;

/**
 * Created by ANJALI on 2/9/2017.
 */
public class Sort {
    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr.length;j++)
                if(arr[i]<arr[j])
                    Swap.swap(arr,i,j); //since both Sort and Swap are in the same package, import is not required
    }
}
