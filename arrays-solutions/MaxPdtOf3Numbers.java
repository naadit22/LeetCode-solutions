import java.util.Arrays;

public class MaxPdtOf3Numbers {
    public static void main(String[] args) {
        //int[] nums = {-1,-2,-3};
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(product(nums));
    }

    static int product(int[] nums){
//        int initial = nums[0]*nums[1]*nums[2];
//        for(int i = 0;i<(nums.length)/2;i++){
//            int pdt = nums[i]*nums[i+1]*nums[i+2];
//            if(initial<pdt){
//                initial = pdt;
//            }
//        }
        //System.out.println(-1*-2*-3);
//        return Math.max(nums[0]*nums[1]*nums[2], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
               // Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
