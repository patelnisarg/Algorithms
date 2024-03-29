import java.util.*;

class threeSum{

     static List<List<Integer>> calculateThreeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        for(int i = 0; i < nums.length && nums[i] <= 0; i++){
            if(i == 0 || nums[i] != nums[i-1])
                twoSum(nums, i, result);
        }
        return result;
    }

     static void twoSum(int[] nums, int i, List<List<Integer>> res){
        int low = i+1;
        int high = nums.length -1;
        while(low < high){
            int sum = nums[i] + nums[low] + nums[high];

            if(sum < 0 ){
                ++low;
            }
            else if(sum > 0){
                --high;
            }
            else{
                res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                while(low < high && nums[low] == nums[low-1]){
                    ++low;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.print(calculateThreeSum(nums));
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