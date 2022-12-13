import java.net.SocketOption;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr = {1,3,5,6,9,12,14,20,33};
        int target = 5;
        System.out.println(orderAgnostics(arr, target));
    }

    static int orderAgnostics(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while(start<end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

            if(target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
