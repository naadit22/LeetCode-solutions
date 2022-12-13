public class EvenNumberofDigits {
    public static void main(String args[]){
        int[] nums = {122,345,222,644,789};
        evenDigits(nums);
    }

    static void evenDigits(int[] nums){
        int count = 0, digits = 0;
        for(int i = 0; i<nums.length;i++){
            int num = nums[i];
            while(num>0) {
                num /= 10;
                digits++;
            }
            if(digits%2 == 0){
                count++;
            }
            System.out.println(digits);
            digits = 0;
        }
        System.out.println(count);
    }
}
