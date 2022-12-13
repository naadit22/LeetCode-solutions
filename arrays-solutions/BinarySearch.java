public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {2,4,6,9,11,12,14,20,36,48,89};
        int target = 4;
        System.out.println(operations(nums, target));
    }

    static int operations(int[] nums, int target){
        int n = nums.length;
        int end = n, start = 0;

        while(start<end){
            int mid = (start+(end-start))/2;
            if(target>nums[mid]){
                start = mid+1;
            }
            else if (target<nums[mid]) {
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
