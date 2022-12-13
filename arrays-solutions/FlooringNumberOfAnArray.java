public class FlooringNumberOfAnArray {
    public static void main(String args[]){
        int[] nums = {2,4,6,8,9,13,18};
        int target = 5;
        System.out.println(flooring(nums, target));
    }

    //greater number greater than or equal to target
    static int flooring(int[] nums, int target){
        int start = 0, end = nums.length;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(target>nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }
}
