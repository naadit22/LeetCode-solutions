import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args){
        int[] nums = {3,3,1,4,2};
        arrange(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(searchDuplicate(nums));
    }

    static int[] arrange(int[] nums){
        for(int i = 0;i<nums.length;i++){
            for(int j = 1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    static int searchDuplicate(int[] nums){
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                return nums[i];
            }
        }
        return -1;
    }
}
