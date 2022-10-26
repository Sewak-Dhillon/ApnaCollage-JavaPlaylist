package com.company;

//Pivot & Partition.
//1. Choose Random element.
//2. Choose Median.
//3. Choose First element.
//4. Choose Last element.(we will use this)

//Important Note:
//Worst case occur when our pivot element is always smallest or largest element.

public class quickSort {
    public static int partition(int[] arr,int low,int high)
    {
        int pvt = arr[low];
        int i = low;

        for(int j = low+1;j<=high;j++) {
            if (arr[j] < pvt) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = pvt;
        arr[low] = temp;
        return i; //Pivot Index.
    }
    public static void quicksort(int[] arr,int low,int high)
    {
     if(low<high)
     {
         int pivot = partition(arr,low,high);
         quicksort(arr,low,pivot-1);
         quicksort(arr,pivot+1,high);
     }
    }

    public static void main(String[] args) {
    int[] arr = {6,3,9,5,2,8};
    int n = arr.length;
    quicksort(arr,0,n-1);
    for(int i : arr)
    {
        System.out.print(i + " ");
    }
    }
}
