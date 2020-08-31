import java.util.Arrays;
import java.util.HashMap;

/**
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
**/

public class twoSum {
    public static int[] solution(int [] nums, int target){
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(numbers.containsKey(complement) && numbers.get(complement) != i){
                return new int[] {i, numbers.get(complement)};
            }
            else{
                numbers.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("no two sum");
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        System.out.print(Arrays.toString(solution(nums, 9)));
    }
}
