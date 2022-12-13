import java.util.*;
import java.util.Arrays;

public class BuildAnArrayFromPermutation {
    public static void main(String args[]) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        buildArray(nums);
        //System.out.println(Arrays.toString(newArr));
    }
    static void buildArray(int[] nums){
        int[] newArr = new int[nums.length];
        int j = 0, a = 0;
        for(int i=0;i<nums.length;i++){
            a = nums[i];
            newArr[j++] = nums[a];
        }
        System.out.println(Arrays.toString(newArr));
        //return newArr;
    }
}

