public class BasicArraysOperations {
    public static void main(String argd[]){
        int[] arr = {2,3,1,5,6,4,8};
        swap(arr,0,4);
        max(arr);
        maxInRange(arr, 1, 4);
        reverse(arr);
    }

    static void swap(int[] arr, int k, int l){
        int temp = arr[k];
        arr[k] = arr[l];
        arr[l] = temp;
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void max(int[] arr){
        int big = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>big){
                big = arr[i];
            }
        }
        System.out.println("Max in array: "+big);
    }

    static void maxInRange(int[] arr, int first, int last){
        int max = arr[first];
        for(int i = first;i<=last;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max in range: "+max);
    }

    static void reverse(int arr[]){
        int start = 0, end = arr.length-1,rev = 0;
        while(start<end){
            rev = arr[start];
            arr[start] = arr[end];
            arr[end] = rev;
            start++;
            end--;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}

