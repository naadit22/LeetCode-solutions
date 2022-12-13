import java.util.Arrays;

public class FirstAndLastPositioninArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = new int[2];
        result[0] = findFirstIndex(nums, target);
        result[1] = findLastIndex(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int findFirstIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;

            if(nums[mid]>=target)
                end = mid-1;
            else
                start = mid+1;

            if(nums[mid] == target)
                index = mid;
        }
        return index;
    }

    static int findLastIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;

            if(nums[mid]<=target)
                start = mid+1;
            else
                end = mid-1;

            if(nums[mid] == target)
                index = mid;
        }
        return index;
    }

}
