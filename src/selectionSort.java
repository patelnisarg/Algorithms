import java.util.Arrays;

public class selectionSort
{

    void sort(int arr[])
    {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++)
        {
          int min_indx = i;

          for(int j = i+1; j < n; j++)
          {
              if (arr[j] < arr[min_indx])
                  min_indx = j;
          }

          int temp = arr[min_indx];
          arr[min_indx] = arr[i];
          arr[i] = temp;

        }
    }

    // Driver code to test above
    public static void main(String args[])
    {
        selectionSort ob = new selectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

/*
time complexity for Selection Sort is O(n2). As there are two nested loops.
How Selection Sort works:
This algorithm splits an array into 2 parts : sorted and unsorted array
Starts by taking the first index of the unsorted array and comparing with all the rest of elements.
the smallest element while comparing is stored using min_value.
After completing the comparison, it will swap the values of the min_value and the first index element.
By this way the algorithm will sort the array in an ascending way.
*/