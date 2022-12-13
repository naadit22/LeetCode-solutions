import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args){
        int[][] nums = {{1,2,3},{1,2,3}};
        int m = nums.length;
        int n = nums[0].length, sum = 0;
        int wealth[] = new int[m];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                sum = sum+nums[i][j];
            }
            wealth[i] = sum;
            sum = 0;
        }
        int max = wealth[0];
        for(int i = 0;i<wealth.length-1;i++){
            if(wealth[i]>max) {
                max = wealth[i];
            }
        }
        System.out.println(max);
    }
}
