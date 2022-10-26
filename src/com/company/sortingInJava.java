package com.company;

public class sortingInJava {
    public static void bubbleSort(int[] arr) // Bubble Sort.(Time complexity of bubble sort is O(n^2).)
    {
        for(int i = 0;i < arr.length;i++){
            for(int j = 1;j < arr.length;j++ )
            {
                if(arr[j-1] < arr[j])//Descending order.
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
//                if(arr[j-1] > arr[j]) //Ascending order.
//                {
//                    int temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }
            }
        }
    }

    public static void selectionSort(int[] arr)
    {
        for(int i = 0;i < arr.length;i++)//Selection Sort (Time complexity = O( (n(n+1))/2) ) => O(n^2)
        {
//            For Ascending order.

            int smallest = i;
            for (int j = i+1;j < arr.length;j++)  // n-1 n-2 n-3 n-4 run kar raha hai loop toh ek AP(Arithmetic progression) series ban rehi hai.
            {
                if(arr[smallest] > arr[j])
                    smallest = j;
            }
            int temp1 = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp1;

//            For Descending order.

//            int largest = i;
//            for (int j = i+1;j < arr.length;j++)
//            {
//                if(arr[largest] < arr[j])
//                    largest = j;
//            }
//            int temp2 = arr[i];
//            arr[i] = arr[largest];
//            arr[largest] = temp2;
        }
    }


    public static void insertionSort(int[] arr)//Insertion Sort (Time complexity = O(n^2).
    {
        for(int i = 1;i < arr.length;i++)
        {
            int current = arr[i];
            int j = i - 1;

            while(j>=0 && current < arr[j]) // Ascending order.
            {
                arr[j+1] = arr[j];
                j--;
            }
//            while(j>=0 && current > arr[j]) // Descending order.
//            {
//                arr[j+1] = arr[j];
//                j--;
//            }

            arr[j+1] = current;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,8,3,2,1};
        insertionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
