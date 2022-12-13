import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));
    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n){

        int res[] = new int[m+n];
        for(int i = 0;i< m;i++){
            res[i] = nums1[i];
        }
        for(int i = 0;i<n;i++){
            res[m+i] = nums2[i];
        }

        for(int i = 0;i< res.length;i++){
            for(int j = 1;j< res.length-i;j++){
                if(res[j]<res[j-1]){
                    int temp = res[j];
                    res[j] = res[j-1];
                    res[j-1] = temp;
                }
            }
        }
        return res;
    }
}
