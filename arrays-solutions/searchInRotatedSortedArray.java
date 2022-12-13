public class searchInRotatedSortedArray {
    public static void main(String[] args){
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        search(nums, target);
    }

    static void search(int[] nums, int target){
        int pos = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                pos = i;
            }
        }
        System.out.println(pos);
    }
}
