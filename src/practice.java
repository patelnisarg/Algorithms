/**
 Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 Find all unique triplets in the array which gives the sum of zero.

 Note:

 The solution set must not contain duplicate triplets.

 Example:

 Given array nums = [-1, 0, 1, 2, -1, -4],

 A solution set is:
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]
 **/
import java.util.*;
public class practice {
    public static List<List<Integer>> calculateThreeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length && nums[i] <= 0; i++){
            if(i == 0 || nums[i] != nums[i-1])
                twoSum(nums, i, result);
        }
        return result;
    }

    public static void twoSum(int[] nums, int i, List<List<Integer>> res){
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
