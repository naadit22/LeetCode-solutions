public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target>nums[mid]){
                start = mid + 1;
            }else{
                end = mid-1;
            }

            if(nums[mid] == target){
                return mid;
            }
        }
        return end+1;
    }
}
