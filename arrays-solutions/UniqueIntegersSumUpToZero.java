import java.util.Arrays;

public class UniqueIntegersSumUpToZero {
    public static void main(String[] args){
        int n = 5, index = 0;
        int[] res = new int[n];
        int left = 0, right = n - 1, start = 1;
        while (left < right) { // in the middle is zero
            res[left++] = start;
            res[right--] = -start;
            start++;
        }
       // return res;
        System.out.println(Arrays.toString(res));
    }
}
