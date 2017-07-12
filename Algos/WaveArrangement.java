package Algos;

import Utilities.Services.Swap;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ANJALI on 3/22/2017.
 */
public class WaveArrangement {
    int n;
    int arr[];

    void getAnArray()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n");
        n=s.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
    }

    void arrangeWave() {
        Arrays.sort(arr);
        int temp;
        for (int i = 1; i+2 <= arr.length; i = i + 2)
            Swap.swap(arr, i, i + 1);
    }

    void arrangeWave2()
    {
        for(int i=0;i+2<arr.length;i++)
        {
            if(arr[i]>arr[i+1])
            {
                Swap.swap(arr,i,i+1);
            }
            i++;
            if(arr[i]<arr[i+1])
            {
                Swap.swap(arr,i,i+1);
            }
            i++;
        }
    }



    public static void main(String args[])
    {
        WaveArrangement wa=new WaveArrangement();
        wa.getAnArray();
        //wa.arrangeWave();
        wa.arrangeWave2();
        for(int i:wa.arr)
        System.out.println(i);


    }
}
