import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args){
        int[] nums1 = {1,3,5,6};
        int[] nums2 = {2,4,6,8};
        int[] result = new int[nums1.length+ nums2.length];
        int j = 0;
        for(int i = 0;i< nums1.length;i++){
            result[j++] = nums1[i];
        }
        for(int i = 0;i< nums2.length;i++){
            result[j++] = nums2[i];
        }

        float sum = 0;
        for(int i = 0;i< result.length;i++){
            sum += result[i];
        }
        System.out.println(sum/ result.length);
    }
}
