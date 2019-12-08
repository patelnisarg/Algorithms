import java.util.Arrays;

public class recursiveBubbleSort {
    void sort(int arr[], int n){
        if(n == 1)
            return;

        for(int i = 0; i < n-1; i++)
        {
           if(arr[i] > arr[i+1])
           {
               int temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;
           }
        }
        sort(arr,n-1);
    }

    public static void main (String args[])
    {
        recursiveBubbleSort rbs = new recursiveBubbleSort();
        int arr[] = {45,23,65,25,67,69,1,56,34};
        rbs.sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
/*
Runtime: We are calling the same function recursively for each
 element of the array and inside the function, we are looping till
 the given length of the array, So Time complexity is O(n ^ n) = O(n ^ 2).

how does this work?
We are calling the same function recursively on each element till it gets sorted.
Our base case will be n == 1 where it will return the array.
 */
