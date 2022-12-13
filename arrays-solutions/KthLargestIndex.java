import java.util.Arrays;

public class KthLargestIndex {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length-k]);
    }

    static void sort(int[] nums){
        for(int i = 0;i<nums.length;i++){
            int last = nums.length-i-1;
            int maxIndex = max(nums, 0, last) ;
            swap(nums, maxIndex, last);
        }
    }

    static int max(int[] nums, int start, int end){
        int max = start;
        for(int i = start;i<=end;i++){
            if(nums[i]>nums[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] nums, int maxIndex, int last){
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[last];
        nums[last] = temp;
    }
}
