import java.util.Arrays;

public class bubbleSort
{
    void sort(int arr[])
    {
        int n = arr.length;

        for(int i = 0; i < n -1; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void main(String args[])
    {
        bubbleSort bs = new bubbleSort();
        int arr[] = {89,34,1343,12,123,1};
        bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
/*
Run time : O(n2)
How does it work?
Bubble sort compares two adjacent numbers and compares which one is the bigger one.
If found, then the numbers will be swapped with each other. The algorithm will start
with the first index.
 */