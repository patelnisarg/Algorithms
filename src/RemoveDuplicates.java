public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){
        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,6};

        System.out.println(removeDuplicates(nums));
    }
}
