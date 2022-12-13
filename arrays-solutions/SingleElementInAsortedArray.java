import java.util.Arrays;

public class SingleElementInAsortedArray {
    public static void main(String args[]){
        //int[] nums = {1,2,2};
        int[] nums = {1,1,3,3,4,4,8,8};
        uniqueNumber(nums);
    }
    static void uniqueNumber(int[] nums) {
        int[] arr = new int[nums.length];
        int unique = 0;

        if(nums.length == 0){
            unique = 0;
        }

        if(nums.length == 1)
            unique = nums[0];

        for(int i = 0;i<nums.length;i++){
            unique = unique ^ nums[i];
        }
        System.out.println("\n\n"+unique);
    }
}
